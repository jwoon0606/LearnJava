package kyh_basic.array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 5;
        System.out.println(size+"개의 정수를 입력하세요:");
        int[] nums = new int[size];
        for(int i=0; i<size; i++){
            nums[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]);
            if(i != nums.length - 1){
                System.out.print(", ");
            }
            else{
                System.out.println();
            }
        }
    }
}
