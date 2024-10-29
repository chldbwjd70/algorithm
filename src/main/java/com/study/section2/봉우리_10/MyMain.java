package com.study.section2.봉우리_10;


import java.util.*;

public class MyMain {
    /*
     * Desc.
     * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
     * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
     * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
     * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
     *
     * Input.
     * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
     * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
     *
     * Output.
     * 봉우리의 개수를 출력하세요.
     *
     * 풀이.
     * N +2 를 통해 가장자리는 모두 0 으로 채우고 나머지는 입력값으로 초기화
     * 현재 자리 값 기준 으로 상,하,좌,우 중 현재 값이 제일 큰 경우에는 ++
     *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int totalSize = size + 2;

        int[][] arr = new int[totalSize][totalSize];

        for(int i = 0; i < totalSize; i++) {
            for(int j = 0; j < totalSize; j++) {
                if(i == 0 || i == totalSize-1|| j == 0 || j == totalSize-1) {
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = scanner.nextInt();
                }
            }
        }

        int result = 0;

        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                if(isMaxNumber(arr[i][j], arr[i][j-1], arr[i][j+1], arr[i-1][j], arr[i+1][j])) result++;
            }
        }

        System.out.println(result);

    }

    public static boolean isMaxNumber(int current, int left, int right, int high, int down) {
        return current > left && current > right && current > high && current > down;
    }



}