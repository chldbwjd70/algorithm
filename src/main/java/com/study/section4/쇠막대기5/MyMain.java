package com.study.section4.쇠막대기5;

import java.util.*;

public class MyMain {

    /*
    * Desc.
    * 여러 개의 쇠막대기를 레이저로 절단하려고 한다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고,
      레이저를 위에서 수직으로 발사하여 쇠막대기들을 자른다. 쇠막대기와 레이저의 배치는 다음 조건을 만족한다.
        • 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있다. - 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓는다.
        • 각 쇠막대기를 자르는 레이저는 적어도 하나 존재한다.
        • 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
        아래 그림은 위 조건을 만족하는 예를 보여준다. 수평으로 그려진 굵은 실선은 쇠막대기이고, 점은 레이저의 위치, 수직으로 그려진 점선 화살표는 레이저의 발사 방향이다.

      이러한 레이저와 쇠막대기의 배치는 다음과 같이 괄호를 이용하여 왼쪽부터 순서대로 표현할 수 있다.
        1. 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍 ‘( ) ’ 으로 표현된다. 또한, 모든 ‘( ) ’는 반 드시 레이저를 표현한다.
        2. 쇠막대기의 왼쪽 끝은 여는 괄호 ‘ ( ’ 로, 오른쪽 끝은 닫힌 괄호 ‘) ’ 로 표현된다.

        위 예의 괄호 표현은 그림 위에 주어져 있다.
        쇠막대기는 레이저에 의해 몇 개의 조각으로 잘려지는데, 위 예에서 가장 위에 있는 두 개의 쇠막대기는 각각 3개와 2개의 조각으로 잘려지고,
        이와 같은 방식으로 주어진 쇠막대기들은 총 17개의 조각으로 잘려진다.
        쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 주어졌을 때, 잘려진 쇠막대기 조각의 총 개수를 구하는 프로그램을 작성하시오.
    *
    * Input.
      한 줄에 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 공백없이 주어진다. 괄호 문자의 개수는 최대 100,000이다.
    *
    * Output.
      잘려진 조각의 총 개수를 나타내는 정수를 한 줄에 출력한다.
    *
    * Example.
    * ()(((()())(())()))(()) -> 17
    * (((()(()()))(())()))(()()) -> 24
    * */

    public static void main(String[] args) {

    /*
    * 조건
    - 쇠막대기
      * 자신보다 긴 쇠막대기 위에만 놓일 수 있다.
      * 끝점은 겹치지 않는다.
      * 적어도 하나의 레이저와 만나야한다.
      * '(' -> 쇠막대기 왼쪽, ')' 쇠막대기 오른쪽
    - 레이저
      * 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
      * '()' 인접한 쌍으로 표현, 무조건 '()' -> 레이저를 표현함
    * */

    /*
    * 레이저인 경우 R, 여는 괄호인 경우 O 로 변경
    * 닫는 괄호가 나오면 제일 마지막에 있는 O 찾은 후 그 사이의 레이저 수 카운팅 (/2 필요) && 마지막 값은 O -> C로 변경
    * 위 카운팅 된 값 누적
    * ex) OOORRRORRRR))ORR)RR))ORRRR)
    *
    * */


        Scanner in=new Scanner(System.in);
        String input = in.next();
        int length = input.length();
        List<String> inputList = new LinkedList<>();

        for(int i=0 ; i < length ;i ++){
            inputList.add(String.valueOf(input.charAt(i)));
        }

        for(int i=0 ; i < length-1 ;i ++){
            String current = String.valueOf(input.charAt(i));
            String nextString = String.valueOf(input.charAt(i+1));
            if(current.equals("(") && nextString.equals(")")){
                inputList.set(i , "R");
                inputList.set(i+1 , "R");
            }
        }


        int result = 0;
        for(int i= 0; i < length; i++){
            String current = inputList.get(i);
            if(current.equals("(")){
                inputList.set(i, "O");
            }
            if(current.equals((")"))){
                int index = -1;
                for(int r= i-1;i > r; r--){
                    if(inputList.get(r).equals("O")){
                        index= r;
                        inputList.set(r, "C");
                        break;
                    }
                }

                int razer = 0;
                for(int t= index ; t < i ; t++){
                    if(inputList.get(t).equals("R")){
                        razer ++;
                    }
                }
                result += razer/2 + 1;


            }
        }


        System.out.println(result);
    }
}
