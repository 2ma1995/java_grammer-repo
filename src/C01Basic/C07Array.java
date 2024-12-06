package C01Basic;

import java.lang.reflect.Array;
import java.util.*;

public class C07Array {
    public static void main(String[] args) {
////        배열표현식1. 리터럴방식
//        int[] intArr1 = {1,3,5,7,9};
//
////        배열표현식2. 배열선언후 할당방식
//        int[] intArry2 = new int[5];
//        intArry2[0] = 1;
//        intArry2[1] = 3;
//        intArry2[2] = 5;
//        intArry2[3] = 7;
//        System.out.println("intArry2 = " + intArry2[4]);//0으로 초기화
//
////        참조자료형의 배열은 기본적으로 null초기화
//        String[] stArr = new String[5];
//        stArr[0] = "hello1";
//        stArr[1] = "hello2";
//        stArr[2] = "hello3";
////        아래코드는 nullPointerException발생
//        for (int i = 0; i < stArr.length;  i++) {
//            if (stArr[i].equals("hello10")){
//                System.out.println("hello10가 있습니다.");
//            }
//
//        }

//        표현식3
//        int[] intArr3 = new int[]{1,3,5,7,9};
//        List<int[]> list1 = new ArrayList<>();
//        int[] a1 = {1,2,3,4,5};
//        list1.add(a1);

////        표햔식4 : 불가 -> 배열의 길이가 사전 지정되어야함
//        int[] intArry4 = new int[];

//        String[] stArr = new String[5];
//        for (int i = 0; i < stArr.length; i++) {
//            stArr[i] = "";
//
//        }
//        Arrays.fill(stArr, "hello");
//        System.out.println("stArr = " + stArr);

//        85,65,90인 int배열을 선언하고, 총합 ,평균을 구하자.
//        int[] intArr = {85,65,90};
//        int total = 0;
//        for (int i = 0; i < intArr.length; i++) {
//            total+=intArr[i];
//        }
//        System.out.println("total = " + total);
//        System.out.println((double)total/intArr.length );

////        배열의 최대값, 최소값
//        int[] arr2 = {10, 20, 30, 12, 8, 17};
//        int max = arr2[0]; // Integer.MIN_VALUE;
//        int min = arr2[0]; // Integer.MAX_VALUE;
//        for (int i = 0; i < arr2.length; i++) {
//            if (arr2[i] > max) {
//                max = arr2[i];
//            }
//            if (arr2[i] < min) {
//                min = arr2[i];
//            }
//        }

//        배열의 자리바꾸기
//        int[] arr = {20,10,30};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1]=temp;

//        int[] arr2 = {10,20,30,40,50};
//        for (int i = 0; i < arr2.length-1 ; i++) {
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println("arr2 = " + arr2);

//      배열뒤집기 : 새로운배열을 선언하여, arr을 뒤집을 배열 생성
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[arr.length-1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(newArr));

//        배열의 정렬
        int[] arr = {17, 12, 20, 10, 25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        선택정렬 알고리즘 구현
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));

//          문자정렬
//          아스키코드(unicode)기준으로 정렬
        String[] fruits = {"banana", "apple", "cherry"};
//        오름차순
        Arrays.sort(fruits);
        System.out.println("fruits = " + Arrays.toString(fruits));

        String[] fruits2 = {"apple", "applee", "applef","b"};
        Arrays.sort(fruits2);
        System.out.println(Arrays.toString(fruits2));

//        내림차순 : 기본형타입은 Comparator로 처리불가
        Arrays.sort(fruits, Comparator.reverseOrder());
        int[] arr2 = {5, 1, 2, 3, 6};
        Arrays.sort(arr2);
//        Arrays.sort(arr2, Comparator.reverseOrder());


    }
}



