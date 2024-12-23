package C10Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1001Validation {
    public static void main(String[] args) throws IllegalAccessException {
        List<User> userList = new ArrayList<>();
        while (true){
        Scanner sc = new Scanner(System.in);
//        아래 방식의 코딩은 사용자의 입력의 필수 입력을 보장하지 못함.
//        컴파일타임에서는 사용자의 입력값을 예측하는것이 불가
        System.out.println("put the name");
        String name = sc.nextLine();
        System.out.println("put the email");
        String email = sc.nextLine();
        User user1 = new User(name,email);
        validate(user1);
        userList.add(user1);
        System.out.println(userList);
        }
    }
//    리플렉션 기술을 통해 런타임시점에서 크래스에 접근하고, 필드 검증 및 수정까지도 가능.
static void validate(Object object) throws IllegalAccessException {
//        <?>는 제네릭표현으로서 어떤 클래스타입도 가능한 표현
//    getClass메서드를 통해 런타임시점에 user라는 객체의 타입을 가져 올수 있게된다.
    Class<?> myClass = object.getClass();
//    변수정보 조회 : 리플렉션 기술을 통해 필드 접근 및 수정.
    Field[] fields = myClass.getDeclaredFields();
    for (Field f : fields) {
        if (f.isAnnotationPresent(NotEmpty.class)){
//            field에서 값을 꺼내거나 수정하려면 private변수를 접근하도록 설정
            f.setAccessible(true);
            String value = (String) f.get(object);
            if (value == null || value.isEmpty()){
                NotEmpty notEmpty = f.getAnnotation(NotEmpty.class);
                throw new IllegalAccessException(notEmpty.message());
            }
        }
    }
}

}
class User{
@NotEmpty(message = "name is can't be empty ")
    private String name;
@NotEmpty
    private String email;


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
//어노테이션 클래스를 통해, 해당 클래스명으로 특정 필드 검사,클래스검사,특정 기능 주입, 등에 활용
@Retention(RetentionPolicy.RUNTIME)// 런타임시점에 동작 시키겠다는것
//ElementType.FIELD : 변수를 대상, ElementType.Method : 메서드를 대상, ElementType.TYPE : 클래스, 인터페이스 등에 적용
@Target(ElementType.FIELD)
@interface NotEmpty {
    String message() default "this field cannot be empty";
}
