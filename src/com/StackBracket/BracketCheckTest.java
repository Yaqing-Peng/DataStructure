package com.StackBracket;

public class BracketCheckTest {
    public static void main(String[] args) {
        BracketCheck bracketCheck=new BracketCheck();

        String s= "{[()]}";  //new String[]{'{','[','(',')',']','}'};
        boolean res= bracketCheck.checkBracket(s);
        System.out.println(res);

        String s1="{[(}";
        boolean res1=bracketCheck.checkBracket(s1);
        System.out.println(res1);

        String s2="{)]}";
        boolean res2= bracketCheck.checkBracket(s2);
        System.out.println(res2);

        String s3="[{()]}";
        boolean res3= bracketCheck.checkBracket(s3);
        System.out.println(res3);
    }
}
