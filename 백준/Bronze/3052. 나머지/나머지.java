
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int[] result = new int[10];
        int count_1=0;
   

        for(int i=0; i<10 ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            result[i] = arr[i] % 42 ;
        }

        for(int i =0 ; i<10; i++){
            int count =0;
            for(int j =i+1 ; j < 10 ; j++){
                if(result[i] == result[j]){
                    count++;
                }
            }
            if(count ==0){
                count_1++;
            }
        }

        System.out.println(count_1);

    }
}