package com.study.section1.단어뒤집기_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
    *
    * Input.
    * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
    * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
    *
    * Output.
    * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
    *
    * 풀이.
    * 첫번째 입력한 단어의 갯수 만큼 반복한다.
    * StringBuilder을 이용해 reverse를 활용
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        for(int i= 0; i < count ; i++){
            StringBuilder builder = new StringBuilder(scanner.next());
            System.out.println(builder.reverse());
        }


    }

}
