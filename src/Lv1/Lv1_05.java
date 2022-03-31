package Lv1;

public class Lv1_05 {
	public String solution(String phone_number) {
		String[] arr = phone_number.split("");
        String answer="";
        
		for(int i=0; i<arr.length; i++) {
            if(i<arr.length-4) answer+='*';
            else answer+=arr[i];
        }
        return answer;
    }
}
