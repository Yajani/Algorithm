import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {

    public static int[] stack; //stack 배열
    public static int size = 0; //stack의 크기

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        stack = new int[N];

        //N의 값이 0보다 클때 실행한다.
        while(N-- > 0){
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()){ //명령어를 가져온다
                
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }

        }
        System.out.println(sb);
    }

    private static int top() {
        if(size() == 0){
            return -1;
        }else{
            return stack[size-1];
        }

    }
    private static int empty() {
        if(size() == 0){
            return 1;
        }else{
            return 0;
        }
    }

    private static int size() {
        return size;
    }

    private static int pop() {
        if(size == 0){
            return -1;
        }else{
            //밖으로 꺼낼 숫자(가장위에있는 숫자를 꺼낸다)
            int num = stack[size - 1];
            //0으로 만든다음
            stack[size - 1] = 0;
            size--; //스택의 크기를 1줄인다
            return num;
        }

    }

    private static void push(int i) {
        //stack push는 위에 있는거에 쌓으면 되니까 그냥 총길이 + i에 추가하면된다.
        stack[size] = i;
        size++;
    }

}