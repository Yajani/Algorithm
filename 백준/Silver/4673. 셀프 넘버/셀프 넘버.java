//1부터 10000까지 검사한뒤, 해당 수를 생성자로 하는 수가 있으면 그 수를 거르는 것
//생성자가 없는 셀프넘버 구하기 

public class Main {

    public static void main(String[] args) { //메인
        boolean[] check = new boolean[10001]; //1~10000이므로 10001크기로 지정
        //1부터 10000까지 검사할 때 메인에서 d 함수로 숫자를 넣어보며 return되는 수는
        //해당 number를 생성자로 하는 수로 구성할 것이다.
        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if (n < 10001) { //10000이 넘지 않을때 , 10000이 넘으면 계산 불가능
                check[n] = true;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) { //false인 인덱스만 출력한다.
            if (!check[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    //함수 생성하기
    public static int d(int number){
        int sum = number;

        //셀프 넘버를 찾기 위한 반복문
        //각 자리수를 더해주기 위해 나머지 연산자와 나눗셈 연산자로 10단위씩 number를
        //줄여갈 것이기 때문에 number가 0이 아닐때 까지 계속 반복해준다.
        while(number != 0){
            sum = sum + (number % 10 ); //첫번째 자리수(10으로 나눠가면서) 0이 될때까지 더한다.
            number = number / 10; //10을 나누어 첫째 자리를 없앤다.
        }
        return sum;
    }
}


