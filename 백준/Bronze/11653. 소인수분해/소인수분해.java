import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        br.close();


        if(N == 1){
            //break;로 하지않고 그냥 null값을 리턴
            return;
        }

        for(int i=2; i <= N; i++){
            while(N % i == 0){
                N /= i; //소인수분해하기
                sb.append(i + "\n"); //stringbuilder에 넣기

            }
        }
        System.out.println(sb);


    }
}