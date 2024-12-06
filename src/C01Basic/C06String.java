package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
////        참조자료형 : 기본자료형을 제외한 모든 자료형, 클래스 기반
////        WrapperClass : 기본형  타입을 Wrapping 한 클래스
//        int a =10;
//        Integer b = new Integer(10);
//        System.out.println(b);
////        오토 언박싱 : WrapperClass -> 기본자료형
//        int c = b;
////        오토 박싱 : 기본자료형 -> WrapperClass 형변환
//        Integer d = a;

//        String과 int의 형변환
//        int a = 10;
//        String st1 = Integer.toString(a);
//        String st2 = Integer.toString(a);

//        String -> int
//        int b = Integer.parseInt(st1);
//
////        배열에는 원시타입 자료형 세팅
//        int[] arr1 = {10,20,30};
//
////        리스트에는 참조자료형 세팅
////        참조자료형에 원시자료형을 담을때는, Wrapper클래스를 써야함.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//
//
//        String st1 = new String("hello1");
////        리터럴 방식 허용 : 권장되는 방식
//        String st2 = "hello1";
//        String st3 = "hello1";
////        참조자료형이므로, == 비교는 메모리 주소가 되고, 값을 비교할때는 .equals()사용
//        System.out.println(st1.equals(st2));
//        System.out.println(st2==st3);
//        char ch1 = '가';
//        char ch2 = '가';
//        System.out.println(ch1==ch2);

//        equals 중에 대소문자 무시
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st2.equals(st3));
//        System.out.println(st2.equalsIgnoreCase(st3));

//      문자열의 길이 : length()
        
//        String st1 = "hello java1 world2";
//        System.out.println(st1.length());
//        charAt : 특징 index의 문자(char)값을 리턴
//        소문자 알파벳의 개수 구하기
//        int count = 0;
//        for (int i = 0; i < st1.length(); i++) {
//            if(st1.charAt(i)>='a'&&st1.charAt(i)<='z'){
//                count++;
//            }
//        }
//        System.out.println(count);

//        String st2 = "abcdefabaadf";
////        a의개수가 몇개인지 출력
//        int count2 = 0;
//        for (int i = 0; i < st2.length(); i++) {
//            if(st1.charAt(i) == 'a'){
//                count2++;
//            }
//        }
//        System.out.println(count2);
////    toCharArray() : String문자열을 char배열로 리턴
//        int count =0;
//        char[] chArr = st2.toCharArray();
//        for (int i = 0; i < st2.length(); i++) {
//        if (chArr[i] ==  'a'){
//            count++;
//        }
//        }
//        System.out.println(count);
//  이런식으로도 사용할수있다.
//        count =0;
//        char[] chArr = st2.toCharArray();
//        for (char ch : chArr) {
//            if (ch ==  'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

//String st1 = "hello java java";
////indexOf : 특정 문자열의 위치 변환, 가장 먼저 나오는 문자열의 위치
////        System.out.println(st1.indexOf("java"));
//        int number = st1.indexOf("java");
//        System.out.println(number);
//
////contains : 특정 문자열이 있는지 여부를 boolean
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));
//
////substring(a,b) a이상b미만의 index의 문자를 잘라 반환
//        String st2 = "hello world";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st2.length()));
//
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//        for (int i = 0; i < my_string.length(); i++) {
//            if (!my_string.substring(i,i+1).equals(letter)){
//                answer +=my_string.substring(i,i+1);
//            }
//        }

//        trim, strip :문자열 양쪽 끝의 공백제거
//        String st1 = " hello world    ";
//        String trimSt1 = st1.trim();
//        String stripSt1 = st1.strip();
//        System.out.println(trimSt1);
//        System.out.println(stripSt1);
//
////      toUpperCase : 대문자로 변환, toLowerCase : 소문자로 변환
//
//        String st2 = "Hello";
//        String st3 = st2.toUpperCase();
//        String st4 = st2.toLowerCase();
//        System.out.println("st3 = " + st3);
//        System.out.println("st4 = " + st4);
//
//        char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        String -> char
//        char ch2 = st1.charAt(0); //한글자 출력할때

//        replace(a,b) : a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("hello","bye");
//        System.out.println(st2);
//        replaceAll(a,b) : replave와 동일, 정규표현식을 쓸수 있는점이 차이.
//        String st1 = "01abc123한글123";
//        for문 활용해서 소문자 알파벳만 제거한 새로운 문자열 생성
//        String answer = "";
//        for (int i = 0; i < st1.length(); i++) {
//            if (st1.charAt(i) <'a'|| st1.charAt(i)>'z'){
//                answer += st1.charAt(i);
//            }
//        }
//      [a-z]+ : 1개 이상의 소문자 알파벳 의미
//      [A-Za-z]+ : 대소문자 포함한 알파벳을 의미
//      [가-힣]+ : 한글
//      [0-9]+ : 숫자
//        String answer2 = st1.replaceAll("[a-z]+","");
//        System.out.println("answer2 = " + answer2);

//        String input = "hello가나다";
//        System.out.println("input = " + input.matches("[A-Za-z]+"));
//        if (input.matches("[A-z]+]")){
//            System.out.println("제대로 입력하셨습니다.");
//        }else{
//            System.out.println("틀렸습니다. 입력을 확인해주세요");
//        }

//       전화번호검증
//        String number = "010-1234-1234";
//        boolean b1 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$",number);
//        System.out.println(b1);

//        이메일검증 : 소문자@소문자알파벳.com
//        String email = "hello@naver.com";
//        boolean b2 = Pattern.matches("^[a-z]+@+[a-z]+.com$",email);
//        System.out.println("b2 = " + b2);

//        split : 특정문자를 기준으로 문자열을 자르는것.
//        String a = "a:b:c:d";
//        String[] arr1 =  a.split(":");
//        System.out.println(Arrays.toString(arr1));
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        System.out.println(Arrays.toString(arr2));
////        정규표현식 사용안하고 arr2의 알파벳 개수 구하는 방법
//        int count = 0;
//        for (int i = 0; i < arr2.length; i++) {
//            if(arr2[i]!=""){
//                count++;
//            }
//        }
//        System.out.println(count);
////        \s : 공백
//        String[] arr3 = b.split("\\s+");
//        System.out.println(Arrays.toString(arr3));
////      null 과 공백의 차이
//        String st1 = null; //null 은 String 이 아님.
//        String st2 = "";
//        String st3 = "hello";
//        System.out.println(st1==st2); // false
//        System.out.println(st3.isEmpty()); // false
//        System.out.println(st2.isEmpty()); // true
//        System.out.println(st1.isEmpty()); // NullPointerException발생 (null인데, String 메서드(isEmpty())를 사용해서 에러가 난다.)

//      null에러 예시
//        String[] arr = {"hello","Java", null,"python"};
//        int answer = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (null != null && arr[i].equals("python")) {
//                answer = i;
//            }
//        }
//       문자열 조립1
//        String[] arr = {"java","python","javascript"};
//        String answer = ";";
//        for (String a :arr){
//            answer += a;
//        }
////       문자열 조립2
//        String answer2 = String.join(":",arr);
//        System.out.println("answer2 = " + answer2);
//  출력값 => answer2 = java:python:javascript

//       StringBuffer : 문자열 조립
//        StringBuffer sb = new StringBuffer();
//        sb.append("java");
//        sb.append("python");
//        sb.append("javascript");
//        String answer = sb.toString();
//        System.out.println(answer);

//        StringBuilder
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("java");
//        sb2.append("\n");
//        sb2.append("python");
//        sb2.append("\n");
//        sb2.append("javascript");
//        String answer3 = sb2.toString();
//        System.out.println(answer3);

//        문자열 뒤집기
        String st1 = "hello";
        String answer = "";
        StringBuilder sb1 = new StringBuilder();
        for (int i = st1.length()-1; i >=0 ; i --) {
            sb1.append(st1.charAt(i));
        }
        StringBuilder sb = new StringBuilder(st1);
        String answer2 = sb.reverse().toString();






    }
}
