package C02ClassBasic;

public class C0201MethodPractice {

 public static boolean isPrime(int num){
     boolean answer = true;
     for (int i = 2; i <= num;i++){
            if (num% i != 0){
                System.out.println( "소수이다.");
                answer=false;
                break;
            }
            }
     return answer;
        }


// for (int i = 2; i <= num;i++){
//            if (num% i != 0){
//                System.out.println(num + "소수이다.");
//                break;
//            }
//        }



    public static void main(String[] args) {
//        isPrime(10);
             if (isPrime(11)){
            System.out.println("소수입니다");
        }else {
            System.out.println("소수가 아닙니다");
        }
    }
}
