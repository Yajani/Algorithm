//방법1 BufferReader 사용하기
import java.io.BufferedReader;
import java .io.InputStreamReader;
import java.io.IOException;




public class Main{
    public static void main(String[] args) throws IOException {
        //BufferedReader방식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String last = "??!";
        
        String s = br.readLine();
        System.out.println(s + last);


    }
}