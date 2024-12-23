package C02ClassBasic;

public class C0203Scope {
    public static void main(String[] args) {
//        지역변수의 유효범위
        int v1 = 10;
        scope(v1);
        System.out.println(v1);
//        객체의 유효범위
        C0202Person p1 = new C0202Person();
    }
    public static void scope(int a){
        a= 20;
        System.out.println(a);
    }
    public static void scope2(C0202Person person){
        person.setAge(30);
//        System.out.println(person.getAge);
    }
}
