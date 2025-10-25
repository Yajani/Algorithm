import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A; // 인접 리스트
    static boolean[] visited;      // 방문 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 노드 수 (1..n)
        int m = Integer.parseInt(st.nextToken()); // 간선 수

        // 제네릭 배열 생성 시 캐스팅으로 경고 제거
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] tmp = (ArrayList<Integer>[]) new ArrayList[n + 1];
        A = tmp;

        visited = new boolean[n + 1];

        // 인접 리스트 초기화 (1..n 만 사용)
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s); // 무방향
        }

        // (선택) 방문 순서 고정이 필요하면 각 리스트 정렬
        // for (int i = 1; i <= n; i++) Collections.sort(A[i]);

        int count = 0; 
        // 1..n만 순회 (0은 사용하지 않음)
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }

        // 총 연결 요소 개수 한 번만 출력
        System.out.println(count);
    }

    static void DFS(int v) {
        visited[v] = true;
        for (int next : A[v]) {
            if (!visited[next]) {
                DFS(next);
            }
        }
    }
}