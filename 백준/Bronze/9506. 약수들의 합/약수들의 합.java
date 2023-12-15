//BufferedReader 사용하기
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == -1){break;}


            ArrayList<Integer> numbers = new ArrayList<>();
            int sum=0;

            for(int i=1; i<N; i++){
                if(N % i == 0){
                    numbers.add(i);
                    sum += i;
                }
            }

            sb.append(N);

            if(N==sum){
                sb.append(" = ");
                for(int i=0; i<numbers.size()-1; i++){
                    sb.append(numbers.get(i) + " + ");
                }
                sb.append(numbers.get(numbers.size() -1));
            }else{
                sb.append(" is NOT perfect.");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();

    }
}