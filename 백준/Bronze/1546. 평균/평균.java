import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); //입력 개수
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int max = -1; //입력받을 값이 0보다 크거나 같기 때문에 
        double sum = 0.0;
        
        for(int i=0; i<N ; i++){
            int value = Integer.parseInt(st.nextToken());
            if(value > max){
                max = value;
            }
            sum  += value;
        }
        
        
        //마지막에 한번에 연산을 해준다. 
        System.out.println(((sum/max)*100.0)/N);

    }
}