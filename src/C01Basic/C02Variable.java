package C01Basic;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//              //정수 : byte(1바이트), int(4바이트) , long(8바이트)
//        byte a = 127;
//        byte b = -128;
//        //오버플로우
//        a++;
//        //언더플로우
//        b--;
//        System.out.println(a);
//        System.out.println(b);
//
//        int intA = 10;
//        long longA = 10;
//        long longB = 20L;
//
//        //실수 : float, double(기본형)
//        float f1 = 1.123F;
//        double d1 = 1.123;
//
//        //부동소수점 오차 확인
//        double d2 = 0.1;
//        System.out.println(d2);
//        //소숫점이 누적됬을때 유의미한 오차 발생
//        double total = 0;
//        for(int i = 0; i<1000; i++){
//            total = total + 0.1;
//        }
//        System.out.println(total);
//
//        double total2 = 0;
//        for(int i = 0; i<1000; i++){
//            total = total + 0.1*10;
//        }
//        System.out.println(total2/10);
//        */
//
//        /*
//        //소수점 오차 해결방법 : Bigdecimal 클래스 사용
//        double double1 = 1.03;
//        double double2 = 0.42;
//        System.out.println(double1-double2);
//        BigDecimal bd1 = new BigDecimal("1.03");
//        BigDecimal bd2 = new BigDecimal("0.42");
//        double result = bd1.subtract(bd2).doubleValue();
//        System.out.println(result);
//        */
//
///*
//        //문자형 : char
//        char ch1 = '가';
//        System.out.println(ch1);
//
//        //boolean = true or false
//        boolean b1 = true;
//        System.out.println(b1);
//        //boolean타입은 대부분 조건절에 사용
//        if(b1){
//            System.out.println("참입니다.");
//        }
//
//        //null도 하나의 타입
//        String st1 = null;
//        String st2 = "";
//        */
//
//        /*
//
//        //타입변환
//        //묵시적 변환
//        char ch1 = 'a';
//        int intA =  ch1;
//        System.out.println(intA);
//        //알파벳 비교를 위한 묵시적 타입변환
//        System.out.println('a'>'b');
//
//        //알파벳소문자 제거 문제
//        String st1 = "01abcd123한글123";
//        String answer = "";
//        for(int i= 0 ; i<st1.length();i++){
//            if(st1.charAt(i)<'a'||st1.charAt(i)>'z'){
//                answer += st1.charAt(i);
//            }
//        }
//        System.out.println(answer);
//
//        //int -> double로 형변환
//        int i1 = 10;
//        double d1 = i1;
//
//        //double -> int 형변환
//        double d2 = 10.5;
//        int i2 = (int)d2;
//
//        //  정수/정수의 경우 소수점 절사 문제 발생
//        int a = 1;
//        int b = 4;
//        double d = a/b;
//        System.out.println(d); // 0
//        // 두 정수중에 한 정수만이라도 double 형변환시 소수점 절사문제 해결
//        double c = (double)a/b;
//        System.out.println(c);
//        */
//
//        // 변수와 상수
//        int a1= 10;
//        //재선언은 불가능
//        //int a1 = 20;
//        //변수값 재할당은 가능
//        a1=20;
//        System.out.println(a1);
//
//        //상수는 초기값을 이후에 재할당하는것이 불가능
//        //상수는 final키워드를 통해 표현
//        //final int AGES =20;
//        //AGES = 30;
    }
}
