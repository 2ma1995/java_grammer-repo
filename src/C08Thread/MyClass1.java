package C08Thread;
//thread클래스 안에는 run메서드가 내장돼 있는데, 이는 비어있는 빈메서드
//그래서, 스레드 실행시 특정 작업을 수행하고 싶다면, run메서드를 overriding해야함
public class MyClass1 extends Thread {
    @Override
    public void run() {
        System.out.println("thread 실행 시작(MyClass1)");
    }
}
