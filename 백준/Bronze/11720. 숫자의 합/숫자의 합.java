import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String ch = sc.next();
        sc.close();
        
        int sum = 0;

        for(int i =0; i<N; i++){
            sum += ch.charAt(i) - '0';
            //charAt()는 아스키코드값을 반환하므로 반드시 -48 또는 -'0'를
            //해주어야 우리가 입력받은 숫자 값 그대로를 사용할 수 있다.
        }
        System.out.print(sum);
    }
}