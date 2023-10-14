import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count=0;
        int n = Integer.parseInt(br.readLine());
        int a = n;

        while(true){         
            n = ((n%10) + (n/10)) % 10 + (n%10)*10;
            count++;
            
            if(n == a){
                System.out.println(count);
                break;
            }

        }

    }
}