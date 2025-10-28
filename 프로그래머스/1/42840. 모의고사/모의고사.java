import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
    
        //1~3번 수포자가 번호를 찍는 패턴
        int[] one = {1,2,3,4,5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        //맞춘 개수를 담을 배열
        int[] score = new int[3];
        
        
        //맞춘 개수 구하기
        //이때 패턴을 무한히 반복해서 비교해야 하니까,
// 인덱스를 계속 돌려서(순환시켜서) 사용해야 함
        for(int i =0 ; i < answers.length; i++){
            if(answers[i] == one[i % 5]) score[0]++;
            if(answers[i] == two[i % 8]) score[1]++;
            if(answers[i] == three[i % 10]) score[2]++;
        }
        
        //가장 많이 맞춘 개수
        int maxScore = Math.max(score[0],Math.max(score[1],score[2]));
        
            List<Integer> list = new ArrayList<>();
        for(int i =0 ;i < 3; i++){
            if(maxScore == score[i]) list.add(i+1);
        }
        
        return list;
    }
}