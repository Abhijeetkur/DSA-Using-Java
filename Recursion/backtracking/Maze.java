package com.abhi.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3, 3));
//        path("", 3, 3);
//        System.out.println(pathRet("", 3,3, new ArrayList<>()));
//        System.out.println(pathRetDiagonal("", 3,3, new ArrayList<>()));
        boolean[][] board = {{true, true, true},
                             {true, false, true},
                             {true, true, true}};
        System.out.println(pathRestrictions("", board,0, 0, new ArrayList<>()));
    }

    static int count(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }

        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if (r > 1){
            path(p + 'D', r - 1, c);
        }
        if (c > 1){
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c, ArrayList<String> ans){
        if (r == 1 && c == 1){
            ans.add(p);
            return ans;
        }

        if (r > 1){
            pathRet(p + 'D', r - 1, c, ans);
        }
        if (c > 1){
            pathRet(p + 'R', r, c - 1, ans);
        }

        return ans;
    }

    static ArrayList<String> pathRetDiagonal(String p, int r, int c, ArrayList<String> ans){
        if (r == 1 && c == 1){
            ans.add(p);
            return ans;
        }

        if (r > 1 && c > 1){
            pathRetDiagonal(p + 'D', r - 1, c - 1, ans);
        }
        if (r > 1){
            pathRetDiagonal(p + 'V', r - 1, c, ans);
        }
        if (c > 1){
            pathRetDiagonal(p + 'H', r, c - 1, ans);
        }

        return ans;
    }

    static ArrayList<String> pathRestrictions(String p, boolean[][] maze, int r, int c, ArrayList<String> ans){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            ans.add(p);
            return ans;
        }

        if (!maze[r][c]){
            return ans;
        }

        if (r < maze.length - 1){
            pathRestrictions(p + 'D', maze, r + 1, c, ans);
        }

        if (c < maze[0].length - 1){
            pathRestrictions(p + 'R', maze, r, c + 1, ans);
        }

        return ans;
    }
}
