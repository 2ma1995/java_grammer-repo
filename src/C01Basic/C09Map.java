package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        map은 인덱스 요소가 없으므로, 순서가 무의미.
//        키값은 중복되지 않고, value를 덮어쓰기함
//        Map<String,String> sports = new HashMap<>();
//        sports.put("basketball", "농구");
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("baseball", "공놀이");
//        System.out.println(sports);


//        map은 key를 통해 value를 get
//        map에서 key값을 통한 복잡도는 O(1)
//        System.out.println(sports.get("baseball"));


//        MAP에 전체데이터 조회하는 방법
//        keyset() : map의 key목록을 리턴하는 메서드
//        values() ; MAP의 VALUE목록을 리턴하는 메서드
//        for (String key ; sports.keySet()){
//            System.out.println("sports의 key값은" + key);
//            System.out.println("sports의 value값은" + sports.get(key));
//        }


////        remove : 키를 통해 삭제
//        sports.remove("baseball");
//        System.out.println(sports);
//        sports.put("soccer", "운동");

////        putIfAbsent : key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer","운동");
//        sports.putIfAbsent("baseball","야구");
//        System.out.println(sports.get(sports));

////        getOrDefault : key가 없으면 default값으로 return
//        System.out.println(sports.get("pingpong"));
//        System.out.println(sports.getOrDefault("pingpong", "그런키 없음"));
//        System.out.println(sports.getOrDefault("baseball", "그런키 없음"));


////      containsKey : key가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("baseball"));
//        System.out.println(sports.containsKey("pingpong"));


//        String[] arr = {"농구", "축구", "농구", "야구", "축구"};
//            농구 2, 축구 :2, 야구:1
//            Map<String,Integer> sports = new HashMap<>();
//        for (String string : arr) {
//            if (sports.containsKey(string)){
//                sports.put(string,sports.get(string)+1);
//            }else
//                sports.put(string,1);
//        }
//        System.out.println(sports);


//        완주하지 못한 선수
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//        String answer = "";
//
//        Map<String, Integer> completion2 = new HashMap<>();
//        for (String string : completion) {
//            if (completion2.containsKey(string))
//                completion2.put(string, completion2.get(string) + 1);
//            else completion2.put(string, 1);
//        }
//        for (String string : participant){
//            completion2.getOrDefault(string,0);
//
//    }
//}


// 프로그래머스 의상

//        int answer = 0;
//
//        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
//        Map<String,Integer> mymap = new HashMap<>();
//        for (String[] strings : clothes){
//            if (mymap.containsKey(clothes[1])){
//
//            }
//        }


//        LinkedHashMap : 데이터 삽입순서를 보장(유지)
//        Map<String,Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5",1);
//        linkedMap.put("hello4",2);
//        linkedMap.put("hello3",3);
//        linkedMap.put("hello2",4);
//        linkedMap.put("hello1",5);
//        for (String l : linkedMap.keySet()){
//            System.out.println("key값은" + l);
//        }


//        TreeMap : key를 통해 데이터를 정렬
//        Map<String,Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5",1);
//        treeMap.put("hello4",2);
//        treeMap.put("hello3",3);
//        treeMap.put("hello2",4);
//        treeMap.put("hello1",5);
//        for (String l : treeMap.keySet()){
//            System.out.println("key값은" + l);
//        }


//        해쉬맵을 사용해서 key값으로 정렬
//        Map<String,Integer> myMap = new HashMap<>();
//        myMap.put("hello5",1);
//        myMap.put("hello4",2);
//        myMap.put("hello3",3);
//        myMap.put("hello2",4);
//        myMap.put("hello1",5);
//        List<String> myList = new ArrayList<>();
//        for (String a : myMap.keySet()){
//            myList.add(a);
//        }
//        Collections.sort(myList);
//
//        for (String l : myList){
//            System.out.println("key값은" + l);
//            System.out.println("value값은" + myMap.get(l));
//        }
//        Collections.sort(myList, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return myMap.get(o2) - myMap.get(o1);
//            }
//        });
//        System.out.println(myList);

//      해쉬맵출력방법 2가지 : 1.강화된 for문 2. iterator
        Map<String, String> mymap = new HashMap<>();
        mymap.put("basketball", "농구");
        mymap.put("soccer", "축구");
        mymap.put("baseball", "야구");
//        for (String a : mymap.keySet()) {
//            System.out.println(a);
//        }

        Iterator<String> myIters = mymap.keySet().iterator();
//        next메서드는 데이터를 하나씩 소모시키면서 값을 반환
        System.out.println(myIters.next());
//        데이터를 출력할 수있도록 도와주는 객체

//        hashNext는 iterator안에 그 다음값이 있는지 없는지 boolean retrun
        while (myIters.hasNext()) {
            System.out.println(myIters.next());
        }

    }
}