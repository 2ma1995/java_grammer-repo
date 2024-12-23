//package C02ClassBasic;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//public class ec {
//
//    public class Permutations {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            // 입력값 받기
//            System.out.print("N과 M을 입력하세요: ");
//            int N = scanner.nextInt();
//            int M = scanner.nextInt();
//
//            // 초기화
//            List<Integer> sequence = new ArrayList<>();
//            boolean[] visited = new boolean[N + 1];
//            List<List<Integer>> results = new ArrayList<>();
//
//            // 백트래킹 호출
//            backtrack(N, M, sequence, visited, results);
//
//            // 결과 출력
//            for (List<Integer> result : results) {
//                System.out.println(result);
//            }
//
//            scanner.close();
//        }
//
//        private static void backtrack(int N, int M, List<Integer> sequence, boolean[] visited, List<List<Integer>> results) {
//            if (sequence.size() == M) { // 조건 만족: 수열의 길이가 M
//                results.add(new ArrayList<>(sequence));
//                return;
//            }
//
//            for (int i = 1; i <= N; i++) { // 1부터 N까지 탐색
//                if (!visited[i]) { // 아직 방문하지 않은 숫자
//                    visited[i] = true; // 방문 체크
//                    sequence.add(i); // 수열에 추가
//                    backtrack(N, M, sequence, visited, results); // 재귀 호출
//                    sequence.remove(sequence.size() - 1); // 수열에서 제거
//                    visited[i] = false; // 방문 취소
//                }
//            }
//        }
//    }
//
//}
