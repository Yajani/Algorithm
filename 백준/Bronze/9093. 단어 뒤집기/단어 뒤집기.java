import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			StringBuilder sb = new StringBuilder();

			while (st.hasMoreTokens()) {
				String str = st.nextToken();

				for (int i = 0; i < str.length(); i++)
                    //문자 뒤에서부터 추가하기
					sb.append(str.charAt(str.length() - 1 - i));
				sb.append(" ");
			}
            
            //한단어를 추가한다음 맨끝의 단어를 삭제한다.
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb);
		}
	}
}