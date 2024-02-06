//import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //입력개수

        int[] arr = new int[N];
        int count =0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i< N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        for(int value : arr){
            if(value == v){
                count++;
            }
        }
        System.out.println(count);

    }
}