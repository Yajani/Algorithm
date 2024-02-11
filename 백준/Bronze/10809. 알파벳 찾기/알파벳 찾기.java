import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//charAt()사용
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String st = br.readLine();

        //-1로 된 알파벳 갯수 26개 배열 생성(-1로 초기화)
        int arr[] = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = -1;
        }

        //입력 받을 수의 갯수까지 중복
        for(int i=0; i < st.length(); i++){
            //문자열로 입력받은 후에 charAt()로 문자로 쪼갠다.
            char ch = st.charAt(i);
            
            //arr의 index 는 a~z의 순서이기 때문이다. a를 뺴면 몇번째에 있는 알파벳인지 알수가 있다.

            if(arr[ch-'a'] == -1){
                //중복되는 문자라면 arr에 값으로 들어갈 수 없으므로 , -1인 곳에만 값을 넣을 수있다. 
                arr[ch - 'a'] = i;
            }
        }

        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}


