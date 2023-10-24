import java.util.*;
 
class Solution {
  public long solution(long n) {
      //n을 정수로 변환한뒤에 한글자 씩 쪼갠다
    String[] list = String.valueOf(n).split("");
    Arrays.sort(list); //순서대로 정렬

    StringBuilder sb = new StringBuilder();
      
    for (String aList : list) 
        sb.append(aList);  //정렬된 값 문자에 담기
    //Long형태로 변환한 후에 내림차순으로 정렬
    return Long.parseLong(sb.reverse().toString());
  }
}
