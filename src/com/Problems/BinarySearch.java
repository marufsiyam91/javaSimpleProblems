package com.Problems;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arrayofNums = {0, 5, 8, 12, 14, 18, 19, 24, 28, 29, 31, 32, 39, 48, 52, 55, 56, 58, 62, 69, 72, 85, 95, 105};

        System.out.print(Binary(arrayofNums, 19));
    }

    static int Binary(int[] arr, int target){
        int ans = -1;

        int starting = 0;
        int end = arr.length - 1;

        while(starting <= end){
            int middle = (starting + end) / 2;
            if(arr[middle] == target){
                ans = middle;
                break;
            }
            if (arr[middle] < target) {
                starting = middle + 1;
            }
            if (arr[middle] > target) {
                end = middle - 1;
            }
        }

        return ans;
    }
}
