package Lv1;

public class Lv1_04 {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        for(int i=0; i<participant.length; i++){
            for(int j=0; j<completion.length; j++){
                   if(participant[i]==completion[j]){
                       completion[j]=""; 
                       participant[i]="";    
                   }
            }
        }
        for(int i=0; i<participant.length; i++){
            if(participant[i]!="") answer=participant[i];
        }
        
        return answer;
    }
}
