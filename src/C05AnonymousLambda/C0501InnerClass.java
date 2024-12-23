package C05AnonymousLambda;

public class C0501InnerClass {
    public static void main(String[] args) {
        MemberInnerClass.StaticInnerClass = new MemberInnerClass.StaticInnerClass();
    }
}

//(일반)내부 클래스
class MemberInnerClass{
    public static MemberInnerClass.StaticInnerClass StaticInnerClass;
    int a ;
    void display(){
        System.out.println("a의 값은"+this.a);

    }
//    static내부즣해스 : 밖의 Member
    static class StaticInnerClass{
        int age ;
    }
}

