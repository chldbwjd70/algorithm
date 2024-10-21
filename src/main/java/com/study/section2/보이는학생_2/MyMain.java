package com.study.section2.보이는학생_2;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
    * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
    *
    * Input.
    * 첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
    *
    * Output.
    * 선생님이 볼 수 있는 최대학생수를 출력한다.
    *
    * 풀이.
    * 입력 값이 최대 값보다 크면
    * 최대 값을 입력 값으로 변경
    * 결과 + 1
    *
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputSize  = scanner.nextInt();

        // result = 첫번째 학생은 무조건 보이기 때문에 1로 초기화
        // max = 첫번째 학생 키 값으로 초기화
        // 하면 0부터 시작할 필요 없음
        int result = 0;
        int max = 0;

        for(int i = 0; i < inputSize ; i ++){
            int input = scanner.nextInt();
            if(input > max){
                max = input;
                result++;
            };
        }

        System.out.println(result);

    }


}
