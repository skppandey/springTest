package com.example.springTest.DSA;

public class StringBackspaceCompare {
  public static void main (String[] args) throws java.lang.Exception
  {
    String str1="xy#z";
    String str2="xzz#";
    boolean flag=false;
    StringBuilder sbr1 = new StringBuilder();
    StringBuilder sbr2 = new StringBuilder();
    if(str1.length()!=str2.length()){
      flag = false;
    }else{
      int str1R = str1.length()-1;
      int str2R = str2.length()-1;
      for(int i=str1.length()-1;i>=0;i--){
          if (str1.charAt(str1R) == '#') {
            str1R =str1R-2;
          }else{
            sbr1.append(str1.charAt(str1R));
            str1R--;
          }
          if (str2.charAt(i) == '#') {
            str2R = str2R-2;
          }else{
            sbr2.append(str2.charAt(str2R));
            str2R--;
          }


      }
    }
    if(sbr1.toString() == sbr2.toString()){
      flag=true;
    }
    System.out.print(flag);
  }
}
