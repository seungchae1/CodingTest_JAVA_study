package Lv1;
import java.util.*;

public class Lv1_05 {
	public String solution(String phone_number) {
		char[] answer1 = new char[phone_number.length()];
		char[] answer2 = phone_number.toCharArray();
        
		for(int i=0; i<answer1.length; i++) {
            if(i<answer1.length-4) answer1[i]='*';
            else answer1[i]=answer2[i];
        }
        String answer=new String(answer1);
        return answer;
    }
}
