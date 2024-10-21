package com.study.section2.가위바위보_3;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
    * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
    * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
    *
    * Input.
    * 첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
    * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
    * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
    *
    * Output.
    * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
    *
    * 풀이.
    * 같으면 D 하고 다음 순차로
    * A를 기준으로 이기는 경우의 조건문만 만들고,
    * 그 조건문에 해당하지 않으면 B가 승리
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> person1List = new ArrayList<>();
        List<Integer> person2List = new ArrayList<>();
        List<String> result = new ArrayList<>();

        int inputSize  = scanner.nextInt();
        scanner.nextLine();


        for(int i=0; i < inputSize; i++){
            person1List.add(scanner.nextInt());
        }

        scanner.nextLine();

        for(int i=0; i < inputSize; i++){
            person2List.add(scanner.nextInt());
        }


        for(int i=0; i < inputSize; i++){
            if(person1List.get(i) == person2List.get(i)){
                result.add("D");
            }else {
                if( person1List.get(i) == 1 && person2List.get(i) == 3 ||
                    person1List.get(i) == 2 && person2List.get(i) == 1 ||
                    person1List.get(i) == 3 && person2List.get(i) == 2
                ){
                        result.add("A");
                        continue;
                }
                result.add("B");
            }
        }

        result.forEach(System.out::println);

    }


}
