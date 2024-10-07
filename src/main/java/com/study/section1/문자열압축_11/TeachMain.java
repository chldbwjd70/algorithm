package com.study.section1.문자열압축_11;

import java.util.Scanner;

public class TeachMain {

    public int[] solution(String str, char t){
        int[] answer = new int[str.length()];

        /*
        * 방법.
        * 왼쪽에서 오른쪽으로 순회
        * 문자와 같으면 p = 0;
        * 문자와 다르면 p를 증가하여 해당 배열 번째에 넣음
        *
        * 오른쪽에서 왼쪽으로 순회
        * 문자와 같으면 p = 0;
        * 문자와 다르면 p를 증가하여 해당 배열 번째에 넣음
        * 이때 기존 값과 비교해서 작은 경우에만 넣는다.
        * */

        int p = 1000;
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == t){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i) == t){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        TeachMain teachMain = new TeachMain();

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        char c = scanner.next().charAt(0);

        for(int x : teachMain.solution(input, c)){
            System.out.print(x + " ");
        }

    }
}
