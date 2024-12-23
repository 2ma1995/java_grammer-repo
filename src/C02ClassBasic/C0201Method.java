package C02ClassBasic;

import org.w3c.dom.ls.LSOutput;

public class C0201Method {

    public static void main(String[] args) {
//        for문을 이용해 10~10까지 total 값 계산후 출력
        int total = 0;
        for (int i = 0; i <= 10; i++) {
            total+=i;
        }
        System.out.println("total = " + total);
//        for문을 이용해 10~20까지 total 값 계산후 출력
        int total2 = 0;
        for (int i = 0; i <= 10; i++) {
            total2+=i;
        }
        System.out.println("total2 = " + total2);
//    코드의 중복이 발생하므로, 반쪽을 피하기 위해 위 코드의 기능을 별도로 분리 : 메섣, 시용의 이유
//    기본호출방식 : 클래스명.메서드
        System.out.println(C0201Method.sumAcc(1,10));
        System.out.println(C0201Method.sumAcc(10,20));
//    같은 클래스내에서 정의된 클래스메서드의 호출은 클래스명 생략가능
        System.out.println(sumAcc(10,30));
    }

//    int리턴타입을 가집
//    매개변수(input)로서 int 2개를 정의,
//    메서드 구성 요소 : 접근제어자(public), 클래스 메서드 여부(static)
    public static int sumAcc(int start, int end){
        int total2 = 0;
        for (int i = 0; i <= 10; i++) {
            total2+=i;
        }
        return total2;
    }
}
