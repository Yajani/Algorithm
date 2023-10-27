import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

//charAt()사용
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            String[] str = br.readLine().split(" ");  //공백 분리 
            //반복 횟수 
            int R = Integer.parseInt(str[0]); //String -> int
            String S = str[1];
            
            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();

        }

    }
}


