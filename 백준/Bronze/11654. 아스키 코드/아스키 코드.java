
//Scanner를 쓰지 말고 System.in을 쓰는 방법 
//System.in은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 
//값을 저장할수 있다.   
public class Main {

    //반드시 예외처리를 해줘야한다는게 주의할 점이다. 
    //throws Exception(예외처리)를 꼭 해줘야한다.
    public static void main(String[] args) throws Exception {
        
        int a = System.in.read();
        System.out.print(a);
    }

}


