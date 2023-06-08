package com.example.springTest;

import java.util.Arrays;

public class ArrangingStudents {

  private static int[] findTotalMarks(int input1,int input2,int[][] input3){
    int min = 0;
    int sum =0;
    int index = 0;
    int[] res = new int[input1];
    int[] avg = new int[input2];
    for(int i=0;i<input2;i++){
      sum = 0;
      for(int j=0;j<input1;j++){
        sum = sum + input3[j][i];
      }
      avg[i] = sum/input1;
      if(min < avg[i]){
        min = avg[i];
        index = i;
      }
    }
    int subSum = 0;
    for(int i=0;i<input1;i++){
      for(int j=0;j<input2;j++){
        if(j==index){
          continue;
        }
        subSum +=input3[i][j];
      }
      res[i] = subSum;
      subSum = 0;
    }

    return res;
  }
  public static void main(String[] args) {
    int students = 3;
    int subjects = 5;
    int[][] arr = { {75,76,65,87,87},
                    {78,76,68,56,89},
                    {67,87,78,77,65}  };
    System.out.println(Arrays.toString(findTotalMarks(students, subjects, arr)));

  }
}
