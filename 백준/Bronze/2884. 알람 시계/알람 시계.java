import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M<45){
            if((H-1)<0) {
                System.out.println(23 + " " + (60+(M-45)));
            }
            else{
                System.out.println((H-1) + " " + (60+(M-45)));
            }
        } else{
            System.out.println(H + " " + (M-45));
        }

//        if(M < 45){
//            H--; //시 1감소
//            M = 60 -(45-M);
//            if(H < 0){
//                H = 23;
//            }
//            System.out.println(H + " " + M);
//        }else{
//            System.out.println(H + " " + (M - 45));
//        }


    }


}