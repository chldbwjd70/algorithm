package com.study.section1.유효한팰린드롬_8;


import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
    * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.알
    * 파벳 이외의 문자들의 무시합니다.
    *
    * Input.
    * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
    *
    * Output.
    * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
    *
    * 풀이.
    * 입력 단어의 첫번째는 무조건 중복이 아니기에 넣고 시작.
    * 그 다음부터 해당 번째에서 이전까지 문자 중 중복있는 것을 count로 설정
    * count = 0 인 것만 결과에 add
    *
found7, time: study; Yduts; emit, 7Dnuof
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input  = scanner.nextLine().toUpperCase();

        char[] inputArray = input.toCharArray();
        StringBuilder test = new StringBuilder();

        for(int i=0; i < input.length(); i++){
            if(Character.isUpperCase(inputArray[i])){
                test.append(inputArray[i]);
            }
        }
        String copy = test.toString();
        String tet1 = test.reverse().toString();

        if(tet1.equals(copy)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
