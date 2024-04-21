class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arr = new char[phone_number.length()];

        for (int i = 0; i < phone_number.length() - 4; i++) {
            arr[i] = '*';
        }

//전화번호 뒷자리 4자리 배열에 추가
        for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            arr[i] = phone_number.charAt(i);
        }
// arr을 문자로 변경후에 합치기
        answer = String.join("", String.valueOf(arr));

        return answer;
    }
}
