package C02ClassBasic;
import java.util.ArrayList;
import java.util.List;

public class C0208RecurCombiPermu {
    public static void main(String[] args) {
////        숫자가 1,2,3,4가 있을때
//        List<Integer> mylist = new ArrayList<>();
//        mylist.add(1);
//        mylist.add(2);
//        mylist.add(3);
//        mylist.add(4);
////        mylist로 만들수 있는 2개짜리 숫자 조합을 출력
////        [1,2] , [1,3] , [1,4] , [2,3] , [2,4] , [3,4]
//        List<List<Integer>> answer = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        for(int i =0; i<mylist.size()-1 ; i++){
//            temp.add(mylist.get(i));
//            for(int j = 1+i; j<mylist.size() ; j++){
//                temp.add(mylist.get(j));
//                answer.add(new ArrayList<>(temp));
//                temp.remove(temp.size()-1);
//            }
//            temp.remove(temp.size()-1);
//        }
        List<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
//        combi(answer,temp,mylist,2,0);
//        System.out.println(answer);
        permu(answer,temp,mylist,2, new boolean[mylist.size()]);
        System.out.println(answer);
    }
    public static void combi(List<List<Integer>> answer, List<Integer> temp,List<Integer> myList, int count,int start){
        if(temp.size()==count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i= start; i<myList.size() ; i++){
            temp.add(myList.get(i));
            combi(answer,temp,myList,count,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public static void permu(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, boolean[] visited){
        if(temp.size()==count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i= 0; i<myList.size() ; i++){
            if(!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(answer, temp, myList, count, visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}

// N과 M (15649) 백준 문제
// 로또 (6603) 백준