package com.Problems;

public class FindEvenDigitNumber {
    public static void main(String[] args) {
        int[] array = {12,345,2,6,7896};

        System.out.print(findNumbers(array));
    }

    static int findNumbers(int[] nums){
        int ans = 0;

        for(int num : nums){
            int digitsInNumber = 0;

            if(num == 0){
                digitsInNumber = 1;
            }else {
                while (num > 0){
                    digitsInNumber++;
                    num /= 10;
                }
            }

            if(digitsInNumber % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
}
