package com.example.springTest.PI;

import java.util.Stack;

import javax.print.DocFlavor;

public class LongestParanthesis {
  public static void main(String[] args) {
    String str = "(((((())(()))(()";
    String str1 = "((())(()))";
    String str2 = "(((((((((((((()))";
    IsValidParanthesis(str);
    printLongestValidParenthesis(str);
  }

  private static void printLongestValidParenthesis(String str){
    Stack<Character> charStack = new Stack<>();
    StringBuilder sbr = new StringBuilder();
    int countClose = 0;
    int countOpen = 0;
    int indexCount = 0;
    for(char c :str.toCharArray()){
      if(c == '('){
        charStack.add(c);
        countClose = 0;
        countOpen++;
      }else{
        countClose++;
        char top = charStack.peek();
        if(top == '(' && c == ')' &&
                (str.length()-indexCount >= countOpen || indexCount == countOpen)){
          if(countClose > 1){
            sbr.insert(0,top);
            sbr.append(c);
          }else{
            sbr.append(top);
            sbr.append(c);
          }
          charStack.pop();
        }
        countOpen=0;
      }
      indexCount++;
    }
    System.out.println(sbr.toString());
  }

  private static void IsValidParanthesis(String str) {
    Stack<Character> characterStack = new Stack<>();
    for(char c : str.toCharArray()){
      if(c == '('){
        characterStack.push(c);
      }else{
          char top = characterStack.peek();
          if(c == ')' && top == '('){
            characterStack.pop();
          }
        }
      }
    if(characterStack.empty()) {
      System.out.println(str +
              " contains valid parentheses.");
    }
    else{
      System.out.println(str +
              " contains invalid parentheses.");
    }
  }
}

