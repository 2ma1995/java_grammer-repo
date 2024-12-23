package C06EtcClass;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0604GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java","python","c"};
//        stChange(stArr,0,1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {10,20,30};
        IntegerChange(intArr,0,1);
        System.out.println(Arrays.toString(intArr));

//      generic을 사용한 메서드 활용
        genericChange(stArr,1,2);
        genericChange(intArr,1,2);

        person p1 = new person("hongildong");
        System.out.println(p1.getValue());

//      generic을 사용하여 범용적 클래스(객체) 생성
        GenericPerson<Integer> p2 = new GenericPerson<>(10);
        System.out.println(p2.getValue());

        List<String> myList = new ArrayList<>();
        Stream<String> myStream;
        IntStream intStream;
        Optional<String> optional;
        OptionalInt optionalInt;


    }
    //      제네릭메서드는 반환타입 왼쪽에 <T>tjsdjs.
//    유의점으로 t에는 참조형변숭인 객체타입 들어와야함
    static<T> void genericChange(T[] stArr,int o1, int o2){
        T temp = stArr[o1];
        stArr[o1] = stArr[o2];
        stArr[o2] = temp;
    }



// static void stChange(String[] stArr,int o1, int o2){
//        String temp = stArr[o1];
//        stArr[o1] = stArr[o2];
//        stArr[o2] = temp;
// }

    static void IntegerChange(Integer[] arr,int o1, int o2){
        Integer temp = arr[o1];
        arr[o1] = arr[o2];
        arr[o2] = temp;
    }
}


class person{
    private String value;


    public person(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
//제네릭 클래스는 클래스명 여에 <T>선언
class GenericPerson<T>{
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }


}