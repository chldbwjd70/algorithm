package com.study.section2.소수_5;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MyMain {
    /*
    * Desc.
    * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
    * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
    *
    * Input.
    * 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
    *
    * Output.
    * 첫 줄에 소수의 개수를 출력합니다.
    *
    * 풀이.
    * 입력 값을 순회하며
    * 에라토스테네스의체를 사용
    * 2부터 나눈 값의 나머지가 0 인 경우 제거
    * 최종 사이즈 ==  소수의 개수
    * 성능 해결 하지 못했다 ...
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size  = scanner.nextInt();
        int[] numbers = new int[size+1];



        for(int i=0; i <= size ; i++){
            numbers[i] = i;
        }


        for(int i=2; i <= size; i++){
            for(int j=i; j <= size; j++){
                if(numbers[j] == 0) continue;
                if(numbers[j] != i && numbers[j] % i == 0){ numbers[j] = 0;}
            }
        }

        int result = 0;
        for(int i=2; i <= size; i++){
            if(numbers[i] != 0) result++;
        }

        System.out.println(result);

    }


}
