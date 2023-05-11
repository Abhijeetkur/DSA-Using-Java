package com.abhi.String;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//        dice("", 4);
//        System.out.println(diceFaceRet("", 4, 6));
        System.out.println(diceArgumentRet("", 4, new ArrayList<>()));
    }

    static void dice(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceRet(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            ans.addAll(diceRet(p + i, target - i));
        }
        return ans;
    }

    static ArrayList<String> diceFaceRet(String p, int target, int face){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= face && i <= target ; i++) {
            ans.addAll(diceFaceRet(p + i, target - i, face));
        }
        return ans;
    }

    static ArrayList<String> diceArgumentRet(String p, int target, ArrayList<String> ans){
        if (target == 0){
            ans.add(p);
            return ans;
        }

        for (int i = 1; i <= 6 && i <= target ; i++) {
            diceArgumentRet(p + i, target - i, ans);
        }
        return ans;
    }
}
