import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String str = br.readLine();
        ArrayList<Integer> numbers = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, " ");

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a != 1) {
                numbers.add(a);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            boolean stopFlag = false;
            for (int j = 2; j * j <= numbers.get(i); j++) {
                if (numbers.get(i) % j == 0) {
                    stopFlag = true;
                    break;
                }
            }
            if (!stopFlag) {
                sum++;
            }
        }

        System.out.println(sum);
        br.close();
    }
}