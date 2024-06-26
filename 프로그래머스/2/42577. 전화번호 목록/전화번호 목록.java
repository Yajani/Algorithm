import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer>  map= new HashMap<String,Integer>();
        
        int count = 0; 
        
        for(String str: phone_book){
            map.put(str,count);
            count++;
        }
        // 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다
        for(int i = 0 ; i<phone_book.length; i++){
            for(int j = 0 ; j < phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j)))
                    return false;
            }
        }
        
        return true;
        
    }
}