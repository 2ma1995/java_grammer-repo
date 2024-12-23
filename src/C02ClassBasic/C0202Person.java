package C02ClassBasic;

public class C0202Person {
    String name;
    int age;
    String email;

    public void eating(){
        System.out.println(this.name+"님이 밥을 먹고있습니다.");
    }
    public String whoIs(){
       String result = "이름은"+name+"나이는"+age+"eamil:"+email;
        return result;
    };

    public void setAge(int i) {

    }
}
