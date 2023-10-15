import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //문자들의 빈도수를 나타내기 위한 배열 선언
        int[] arr =new int[26]; //영문자의 개수 26개
        String S = sc.next();

        //첫번쨰 문자부터 마지막 문자까지 검사하기 위한 반복문 작성
        for(int i = 0 ; i< S.length(); i++){
            //대문자의 범위는 65~90, 소문자의 범위는 97~122
            //즉 C는 67이니 세번쨰 원소인 2를 도출해내려면 65를 빼줘야한다.
            //소문자는 'a'를 뺴주거나 97을 빼주어야 한다.
            if('A' <= S.charAt(i) && S.charAt(i) <= 'Z') { //대문자 범위
                arr[S.charAt(i) - 'A']++;
            }
            else{ //소문자 범위
                arr[S.charAt(i) - 'a']++;
            }

        }

        int max = -1;
        char ch = '?';
         //가장많이 쓰인 값을 찾는다
        for(int i =0; i < 26; i++){
            if(arr[i] > max){
                max = arr[i];
                //(char) 캐스팅
                ch = (char)(i + 65); //대문자로 출력해야하므로 65를 더해준다.
            }
            //가장 많이 사용된 알파벳이 여러개 존재하는 경우 ? 를 출력
            else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.print(ch);

    }
}