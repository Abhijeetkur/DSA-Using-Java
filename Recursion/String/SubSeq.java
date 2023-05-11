package com.abhi.String;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//        ArrayList<String> ans = subSeq("", "abc", list);
//        System.out.println(ans);
//        ArrayList<String> ans = subSeq1("", "abc");
//        System.out.println(ans);
        ArrayList<String> ans = subSeqAscii("", "abc", list);
        System.out.println(ans);
    }
    static void subSeq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        subSeq(p + up.charAt(0), up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeq(String p, String up, ArrayList<String> list){
        if (up.isEmpty()){
            list.add(p);
            return list;
        }
        subSeq(p, up.substring(1), list);
        subSeq(p + up.charAt(0), up.substring(1), list);
        return list;
    }

    static ArrayList<String> subSeq1(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> right = subSeq1(p + up.charAt(0), up.substring(1));
        ArrayList<String> left = subSeq1(p, up.substring(1));
        right.addAll(left);
        return right;
    }

    static void subSeqAscii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        subSeqAscii(p + up.charAt(0), up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (up.charAt(0) + 0), up.substring(1));
    }

    static ArrayList<String> subSeqAscii(String p, String up, ArrayList<String> list){
        if (up.isEmpty()){
            if (!p.isEmpty()){
                list.add(p);
            }
            return list;
        }
        subSeqAscii(p, up.substring(1), list);
        subSeqAscii(p + up.charAt(0), up.substring(1), list);
        subSeqAscii(p + (up.charAt(0)+0), up.substring(1), list);
        return list;
    }
}
