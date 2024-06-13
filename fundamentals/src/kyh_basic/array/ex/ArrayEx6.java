package kyh_basic.array.ex;

import  java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        int maxNumber, minNumber;

        System.out.println(size + "개의 정수를 입력하세요:");
        for(int i=0; i<size; i++){
            nums[i] = scanner.nextInt();
        }

        minNumber = maxNumber = nums[0];
        for (int i = 1; i < size; i++) {
            if(nums[i] < minNumber){
                minNumber = nums[i];
            }
            if(nums[i] > maxNumber){
                maxNumber = nums[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
