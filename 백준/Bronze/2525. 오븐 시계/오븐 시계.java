import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //모든 시간을 분으로 바꾼다 (시간을 통으로 바꾸는 생각을 해야한다.!!!)
        int total = a * 60 + b + c;
        a = total / 60;
        b = total % 60;

        //만약 a(시간)이 24를 넘는다면??
        if(a >= 24){
            a = a -24;
        }
        System.out.println(a + " " + b);
    }


}