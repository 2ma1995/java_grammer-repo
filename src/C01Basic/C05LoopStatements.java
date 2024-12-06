package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
//        int a = 0;
//        while(a < 10){
//            System.out.println("hello world");
//            a++;
//        }
////        2~10까지 출력하는 while문 예제
//        int b = 2;
//        while(b < 11){
//            System.out.println(b);
//            b++;
//        }

//        입력한 숫자의 구구단 단수 출력
//        3 x 1 = 3
//        3 x 2 = 6
//        3 x 3 = 9

//        while (true) {
//            System.out.println("단수를 입력해주세요.");
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            int a = 1;
//            while (a < 10) {
//                System.out.println(input + "x" + a + " = " + input * a);
//                a++;
//            }
//        }


//        도어락키예제 -> 반복되는 도어락키 예제
//        도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if (answer == input){ //boolean값이 들어온다/
//            System.out.println("문이 열렸습니다.");
//        }else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }



//        int answer = 1234;
//        int a = 0;
//        Scanner sc = new Scanner(System.in);
//        while (a < 5){
//            int input = sc.nextInt();
//            sc.nextLine();
//            if (answer == input){
//                System.out.println("문이 열리네요~ 그대가 들어오죠");
//                break; //가장 가까운 반복문 종료
//            }
//            else {
//                System.out.println("문이 안열리네요~ 그대가 못들어오죠");
//            }
//            a++;
//            if (a==5){
//                System.out.println("5회 이상 초과");
//                break;
//            }
//        }

//        int a = 100;
//        do{
//            System.out.println(a);
//        }
//        while (a < 10);




//        for문 : 초기식, 조건식, 증감식이 있다.
//
//        int b = 2;
//        while(b < 11){
//            System.out.println(b);
//            b++;
//        }
//        for (int a = 2; a < 11; a++){
//            System.out.println(a);
//        for문은 사용했던 변수명을 for문 끝난이후 다음 라인에서 재선언이 가능



//1~10중에 홀수만 출력
//        for (int a = 1; a < 11; a++){
//            if (a%2 != 0){
//                System.out.println(a);
//            }
//        }



//        1~20까지 수 중에 짝수를 모두 더한 값
//        int sum = 0;
////        for(int a = 1; a < 21; a++){
////            if (a%2 == 0){
////                sum += a;
////                System.out.println(sum);
////            }
////        }
//        int a = 24;
//        int b = 36;
//        int min = a < b ? a : b;
//        int answer = 0;
//        for(int i = 1; i<min; i++){
//            if (a%1 == 0 && b%i ==0){
//                answer = i;
//            }
//        }
//        System.out.println(answer);




        //소수구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는 수
//        사용자가 입력한 숫자 n이 소수인지 아닌지 판별
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        sc.nextLine();
//
//        for (int i = 2; i <= num;i++){
//            if (num% i != 0){
//                System.out.println(num + "소수이다.");
//                break;
//            }
//        }



//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean answer = false;
//        for (int i =2; i< input; i++){
//            if (input % i == 0){
//                answer = true;
//            }
//        }
//        if (answer==true){
//            System.out.println("소수가 아닙니다.");
//        }else {
//            System.out.println("소수 입니다.");
//        }

//        continue : 반복문의 조건식으로 이동
//        continue를 활용하여 홀수만 출력
//        for (int i = 1; i < 11; i++){
//            if (i%2 != 0){
//                System.out.println(i);
//            }
//        }

//        배열과 enhanced for문(향상된 for문 -for each문)
//        int[] arr = {1,3,5,7};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
////        일반 for문으로 배열 접근
//        for (int i = 0; i < 4; i++){
//            System.out.println(arr[i]);
//        }
//
////        향상된 for문으로  배열 접근 : a에 arr의 값이 하나씩 담기고, 값의 갯수만큼 반복횟수가 결정된다.
//        for (int a : arr) {
//            System.out.println(a);
//        }
//
//        //일반for문을 통해 arr의 저장된 값 변경
//        for (int i = 0; i < 4; i++){
//            arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr));
////        향상된 for문을 arr값 변경 시도
//        for (int a : arr) {
//            a += 100;
//        }
//        System.out.println(Arrays.toString(arr));
//
//
////        자바 변수의 유효범위 : {}
//        int num = 10;
//        if(num>1){
//            int abc = 20;
//            num = 20;
//        }
////        abc = 30; if문 중괄호 밖에서는 abc변수의 존재를 모름.
//        System.out.println(num);

//        다중반복문
//        2~9단까지 출력 + 각 단마다 몇단입니다. 출력

//        for (int i = 1; i < 10; i++){
//            System.out.println(i + "단 입니다.");
//            for (int j = 1; j < 10; j++){
//                System.out.println(i + "x" + j + " = " + i*j);
//            }
//        }


//        라벨문 : 반목문에 이름을 붙이는 것
//        for (int i = 0; i > 5; i++){
//            for (int j = 0;j < 5; j++){
//                System.out.println("hello world");
//                if()
//            }
//        }


//        int[][] arr = {{1,2,3},{4,5,11},{7,8,9},{10,11,12}};
////        숫자 8을 찾아서 2,1에 있다고 출력
////        숫자 11일 찾되, 가장 먼저 찾아지는 11에 위치만 출력
//        loop1:
//        for (int i =0;i < 4; i++){
//            loop2:
//            for (int j = 0; j < 3; j++){
//                if (arr[i][j] == 11){
//                    System.out.println(i + "," + j);
//                    break loop1;
//                }
//            }
//        }
//100~200까지 수 중에서 가장 작은 소수 출력
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for (int input = 100;input<=200; input++){
            boolean answer = false;
            for (int i = 2; i*i<=input; i++){
                if (input % i == 0){
                    answer = true;
                    break;
                }
            }
            if (!answer){
                System.out.println(input);
                break;
            }
        }
    }
}
