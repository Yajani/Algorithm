
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        //StringBuilder에 계산한 식을 넣어준 뒤 나중에 한번에 출력해주는 방식 !!
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine()," ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append("\n");

        }

        System.out.println(sb);

    }

}