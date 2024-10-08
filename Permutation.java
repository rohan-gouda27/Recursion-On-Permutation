package Recursion_On_Permutation;

import java.util.ArrayList;

public class Permutation {
    static void permutation(String processed,String str){
        if(str.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=str.charAt(0);
        for (int i = 0; i <=processed.length() ; i++) {
            String f=processed.substring(0,i);
            String s=processed.substring(i,processed.length());
            permutation(f+ch+s,str.substring(1));
        }
    }
    //TO ADD PERMUTATION ON ARRAYLIST CREATE ARRYLIST AND USE ADDALL KEEP IT IN FOR LOOPS
    static ArrayList<String> permutationOnList(String processed, String str){
        if(str.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
           list.add(processed);
            return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        char ch=str.charAt(0);
        for (int i = 0; i <=processed.length() ; i++) {
            String f=processed.substring(0,i);
            String s=processed.substring(i,processed.length());
            permutationOnList(f+ch+s,str.substring(1));
            ans.addAll(permutationOnList(f+ch+s,str.substring(1)));
        }
        return ans;
    }
    public static void main(String[] args) {
//        permutation("","abc");
        System.out.println(permutationOnList("","abc"));
    }

}
