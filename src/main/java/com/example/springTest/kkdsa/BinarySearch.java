package com.example.springTest.kkdsa;

public class BinarySearch {
  static int getCeiling(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    if(target > arr[end]){
      return -1;
    }
    while(start <= end){
      int mid = start + (end - start)/2;
      if(arr[mid] == target){
        return mid;
      }
      if(arr[mid] < target){
        start = mid + 1;
      }
      if(arr[mid] > target){
        end = mid - 1;
      }
    }
    return arr[start];
  }

  static int getFlour(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    if(target < arr[start]){
      return -1;
    }
    while(start <= end){
      int mid = start + (end - start)/2;
      if(arr[mid] == target){
        return mid;
      }
      if(arr[mid] < target){
        start = mid + 1;
      }
      if(arr[mid] > target){
        end = mid - 1;
      }
    }
    return arr[end];
  }

  static char SmallestCharacterInArray(char[] arr, char target){
    int start = 0;
    int end = arr.length - 1;
    while(start <= end){
      int mid = start + (end - start)/2;
      if(arr[mid] < target){
        start = mid + 1;
      }
      else{
        end = mid - 1;
      }
    }
    return arr[start % arr.length];
  }

  static int[] findFirstAndLast(){
    int start = searchRange(new int[]{5,7,7,7,7,8,8,10},7,true);
    int end = searchRange(new int[]{5,7,7,7,7,8,8,10},7,false);
    int[] ans = new int[2];
    ans[0] = start;
    ans[1] = end;
    return ans;
  }
  static int searchRange(int[] arr, int target, boolean startIndex){
    int start = 0;
    int end = arr.length - 1;
    int ans = -1;
    while(start <= end){   //5,7,7,7,7,8,8,10
      int mid = start + (end - start)/2;
      if(arr[mid] < target){
        start = mid + 1;
      } else if (arr[mid] > target) {
        end = mid - 1;
      } else{
        ans = mid;
        if(startIndex){
          end = mid - 1;
        }else{
          start = mid + 1;
        }
      }
    }
    return ans;
  }

  static int findIndexInInfinity(int[] nums,int target){
    int start = 0;
    int end = 1;
    while(target > nums[end]){
        int tempStart = end + 1;
        end = start + (end - start + 1)*2;
        start = tempStart;
    }
    return binarySearch(nums,start,end,target);
  }
  static int binarySearch(int[] arr, int start, int end,int target){
    while(start <= end){
      int mid = start + (end - start)/2;
      if(arr[mid] < target){
        start = mid + 1;
      }else if(arr[mid] > target){
        end = mid - 1;
      }else{
        return mid;
      }
    }
    return -1;
  }

  static int orderAgnosticBinarySearch(int[] arr,int target, int start, int end){
//    int start = 0;
//    int end = arr.length - 1;
    boolean isAscending = arr[start] < arr[end];
    while(start <= end){
      int mid = start + (end - start)/2;
      if(arr[mid] == target){
        return mid;
      }
      if(isAscending){
        if(target > arr[mid]) {
          start = mid + 1;
        }
          else{
            end = mid - 1;
          }
        }else{
        if(target > arr[mid]) {
          end = mid + 1;
        }
        else{
          start = mid - 1;
        }
      }
      }
    return -1;
    }

  static int findPeak(int[] arr){    // 0 1 3 5 4 2 1
    int start = 0;
    int end = arr.length - 1;
    while(start < end){
      int mid = start + (end-start)/2;
      if(arr[mid] > arr[mid + 1]){
        end = mid;
      }else{
        start = mid + 1;
      }
    }
    return start;
  }

  static int findElementinMountainArray(int[] arr,int target){
    int peak = findPeak(arr);
    int left = orderAgnosticBinarySearch(arr,target,0,peak);
    if(left == -1){
      return orderAgnosticBinarySearch(arr,target,peak,arr.length-1);
    }
    return left;
  }

  public static void main (String[] args)
  {
//    int[] arr = {2,4,6,8,9,12,14,16};
//    int t = 5;
//    System.out.println(getCeiling(arr,t));
//    System.out.println(getFlour(arr,t));
//
//    char[] charArr = {'c','f','j'};
//    System.out.println(SmallestCharacterInArray(charArr,'g'));
//    System.out.println(findFirstAndLast());
//    System.out.println(findIndexInInfinity(new int[]{2,3,4,5,8,9,12,13,16,17},9));
//    System.out.println(findPeak(new int[]{0,1,6,9,7,5,2,1}));
//    System.out.println(findElementinMountainArray(new int[]{0,1,6,9,7,5,2,1},6));
    System.out.println((0+1)/2);
  }
}
