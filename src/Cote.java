public class Cote {
    public static void main(String[] args) {
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        double answer = 0;
        for (int n : numbers) {
            answer += n;
        }
        answer /= numbers.length;
        System.out.println(answer);

//        for (int i = 0; i < string.length(); i++) {
//            if(mt_string.charAt(i) == letter.charAt(i));
//            answer+= my_string.chatAt(i);
//        }

    }
}
