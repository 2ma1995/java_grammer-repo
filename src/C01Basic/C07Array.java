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
//        int[] arr = {17, 12, 20, 10, 25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        선택정렬 알고리즘 구현
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = arr[i];
//            int minIndex = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] < min) {
//                    min = arr[j];
//                    minIndex = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//          문자정렬
//          아스키코드(unicode)기준으로 정렬
//        String[] fruits = {"banana", "apple", "cherry"};
////        오름차순
//        Arrays.sort(fruits);
//        System.out.println("fruits = " + Arrays.toString(fruits));
//
//        String[] fruits2 = {"apple", "applee", "applef","b"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));

//        내림차순 : 기본형타입은 Comparator로 처리불가
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        int[] arr2 = {5, 1, 2, 3, 6};
//        Arrays.sort(arr2);
//        Arrays.sort(arr2, Comparator.reverseOrder());

//        프로그래머스 - k번째 수
//        int[] array={1, 5, 2, 6, 3, 7, 4};
//        int[][] commands={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new int[commands.length];
//        for(int i=0; i<commands.length; i++){
//            int[] temp = new int[commands[i][1]-commands[i][0]+1];
//            int number=0;
//            for(int j=commands[i][0]-1; j<commands[i][1];j++){
//                temp[number] = array[j];
//                number++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//        System.out.println(Arrays.toString(answer));

//        숫자조합의 합
//        모두각기 다른 숫자의 배열이 있을때, 만들어질 수 있는 2개의 조합의 합을 배열에 담아 출력.
//        int[] intArr = {10,20,30,40,50,60};
//        int[] arr1 = new int[intArr.length* intArr.length];
//        int index = 0;
//        for (int i = 0; i < intArr.length; i++) {
//            for (int j = i+1; j < intArr.length ; j++) {
//                arr1[index] = intArr[i]+intArr[j];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = new int[index];
//        for (int i = 0; i < index;  i++) {
//            arr2[i]=arr1[i];
//        }
//        Arrays.sort(arr2);
//        int[] arr3 = new int[arr2.length];
//        int count = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if (i==arr2.length-1 || arr2[i] != arr2[i+1]){
//                arr3[count] = arr2[i];
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(arr3));

//        배열의 복사
//        Arrays.copyOf(배열명,length), Arrays.copyOfRange(배열명,start,end);
//        ec)
//        int[] answer1 = Arrays.copyOf(arr3,count);
//        int[] answer2 = Arrays.copyOfRange(arr3,0, count);

//        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
//        int answer = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==target){
//                answer+=i;
//                break;
//            }
//        }
//        System.out.println(answer);

//        이진검색(binary search) - 이분탐색
//        사전에 오름차순정렬이 되어 있어야 이진검색 가능
        int[] arr = {1, 3, 6, 8, 9, 11, 15};
        System.out.println(Arrays.binarySearch(arr, 15));
//        2차원 배열의 선언과 할당
//        int[][] arr1 = new int[2][3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[0][2] = 30;
//        arr1[1][0] = 40;
//        arr1[1][1] = 50;
//        arr1[1][2] = 60;
//
//        int[][] arr2 = {{10,20,30},{40,50,60}};

//        가변배열 선언 후 할당
        int[][] arr1 = new int[2][3];
        arr1[0] = new int[2];
        arr1[1] = new int[3];
        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[1][0] = 30;
        arr1[1][1] = 40;
        arr1[1][2] = 50;
        System.out.println(Arrays.deepToString(arr1));
//        가변배열 리터럴 방식
        int[][] arr2 = {{10, 20}, {30, 40, 50}};

//        2차원 배열 실습
//        [3][4] 사이즈 배열 선언하고
//        1~12까지 숫자값을 각 배열에 순차적으로 할당
//        {1,2,3,4},{5,6,7,8}...
//        int[][] arr3 = new int[3][4];
//        int num = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i]; j++) {
//                arr3[i][j] = num;
//                num++;
//            }
//        }
//       첫배열선언에서 한쪽이 빠져있을경우
        int[][] arr3 = new int[3][];
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = new int[4];
            for (int j = 0; j < arr[i]; j++) {
                arr3[i][j] = num;
                num++;
            }
        }







    }
}



