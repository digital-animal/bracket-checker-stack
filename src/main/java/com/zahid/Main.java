package com.zahid;

public class Main {    
    public static void main( String[] args )
    {
        BracketChecker expressionChecker = new BracketChecker();
        
        System.out.println(expressionChecker.isBalanced("(")); // false 
        System.out.println(expressionChecker.isBalanced("(]")); // false
        System.out.println(expressionChecker.isBalanced("()")); // ture
        System.out.println(expressionChecker.isBalanced("(){}")); // true
        System.out.println(expressionChecker.isBalanced("(){}[]")); // true
        System.out.println(expressionChecker.isBalanced("[{()}]")); // true
        System.out.println(expressionChecker.isBalanced("[{()}][")); // false
        System.out.println(expressionChecker.isBalanced("[{()}][){")); // false
        System.out.println(expressionChecker.isBalanced("[ {  (    )  } ]")); // true
    }
}
