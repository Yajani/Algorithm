



//주의할점은 두 정수는 공백으로 나뉘어 구분된다.
//입력의 종료는 더이상 읽을 수 있는 데이터(EOF)가 없을 때 종료한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while( (str=br.readLine()) != null ){

            st = new StringTokenizer(str," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");

        }
        System.out.print(sb);
    }
}