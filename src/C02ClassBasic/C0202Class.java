package C02ClassBasic;

public class C0202Class {
    public void main(String[] args) {
        System.out.println(MyCalculator.sum(10,20));
//        객체를 사용한 회계프로그램 : 객체 고유의 고유의 메모리 공간 할당
        MyCalculatorInstance m1 = new MyCalculatorInstance();
        MyCalculatorInstance.total_count +=1;
        m1.sumAcc(10);
        m1.sumAcc(20);
        System.out.println(m1.total);
        MyCalculatorInstance m2 = new MyCalculatorInstance();
        MyCalculatorInstance.total_count +=1;
        m2.sumAcc(30);
        m2.sumAcc(40);

//        A부서의 매출
//        20원 매출
    MyCalculator.sumAcc(20);
        System.out.println(MyCalculator.total);
//        30원 매출
        MyCalculator.sumAcc(30);
        System.out.println(MyCalculator.total);
//        40원 매출
        MyCalculator.sumAcc(40);
        System.out.println(MyCalculator.total);

        C0202Person p1 = new C0202Person();
        p1.name = "hongildong";
        p1.age=10;
        p1.email="asd@sdf.com";
        p1.eating();
        System.out.println(p1.whoIs());






    }
    class MyCalculator{
//        static이 붙어있는 변수는 클래스변수, static이 붙어있지 않으면, 객체변수
        static int total;

        static int sum(int a, int b){
            return a+b;
        }

          static void sumAcc(int total){
//            this는 객체 그 자신을 의미
//            예를 들어 m1객체일경우 m1.total, m2객체일경우 m2.total
//            일반적으로, 매개변수와 객체변수를 구분 짓기 위해 사용해야함.(생략가능-매개변수와 이름이 같지 않을경우)
//              this.total += total;
        }
    }

    class MyCalculatorInstance{
        //        static이 붙어있는 변수는 클래스변수, static이 붙어있지 않으면, 객체변수
        static int total_count = 0;
         int total;

         void sumAcc(int a){
            total += a;
        }
    }
}
