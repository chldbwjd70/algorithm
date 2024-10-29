package com.study.section2.격자판최대합_9;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyMain {
    /*
    * Desc.
    * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
    * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
    *
    * Input.
    * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
    * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
    *
    * Output.
    * 최대합을 출력합니다.
    *
    * 풀이.
    * 이중 반복문을 이용 하여 한줄의 열의 합, 한 줄의 행의 합을 구할 수 있다.
    * 최대 값 (result) 보다 큰 경우 변경 해준다.
    * -> 행과 열의 합 중 최대 합은 담긴다.
    * -> 아직 대각선의 최대 합이 남아 있다.
    * 왼쪽 위에서 오른쪽 아래로 내려 오는 대각선의 위치의 합은 size -1 ,
    * 오른쪽 위에서 왼쪽 아래로 내려 오는 대각선의 위치의 값은 동일한 경우다.
    * 위 조건을 통해 대각선 두개의 각각의 합을 구하고,
    * 최종적인 최대 합을 구한다.
    *  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[][] arr = new int[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }


        int leftSum = 0;
        int rightSum = 0;
        int result = 0;
        for(int i = 0; i < size; i++) {
            int rowSum = 0;
            int colSum = 0;
            for(int j = 0; j < size; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];

                if(i + j == size-1) { // 오른쪽 위에서 왼쪽 아래로 내려 오는 대각선
                    rightSum += arr[i][j];
                }

                if( i == j) { // 왼쪽 위에서 오른쪽 아래로 내려오는 대각선
                    leftSum += arr[i][j];
                }
            }

            if(rowSum > result) result = rowSum;
            if(colSum > result) result = colSum;
        }

        int diagonalMax = Math.max(leftSum, rightSum);
        if(diagonalMax > result) result = diagonalMax;

        System.out.println(result);
    }




}
