import java.util.Scanner;

//1. 1보다 크고 입력받은 값보다 작거나 같은 한수의 개수를 출력한다.
//2. 한수는 각 자리수가 등차수열을 이루는 수를 의미한다.
//각 자리수가 등차수열을 이루고 있는지를 검사하는 문제다.
//1~100까지는 모두 등차수열이다.

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(arithmetic_sequence(sc.nextInt()));
        sc.close();

    }

    public static int arithmetic_sequence(int num){
        int cnt =0; //한수(각 자리수가 등차수열을 이루는 수를 의미) 카운팅

        if(num < 100) {
            return num;
        }else{
            //100이상의 수가 들어오면 한수의 최소 개수는 99개이다. 
            //100보다 작은 수들은 모두 한수 이기 때문이다. 
            cnt = 99;

            for(int i = 100; i<= num; i++){
                int hun = i/100; //백의 자릿수
                int ten = (i/10) % 10; //십의 자릿수
                int one = i % 10; //일의 자릿수
                
                //등차수열임므로 각 자릿수 순서대로 차이 값을 구해야 한다.
                if((hun - ten) == (ten - one)) { //각 자릿수가 수열을 이루면
                    cnt++;
                }

            }
        }
        return cnt;
    }
}