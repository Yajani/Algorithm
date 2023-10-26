
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];
        int r=0, c=0, max=0;
        StringTokenizer st;

        for(int i=0; i<9; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > max){
                    max =arr[i][j];
                    r = i;
                    c = j;

                }
            }
        }

        System.out.println(max);
        System.out.println((r+1) + " " + (c+1));

    }
}