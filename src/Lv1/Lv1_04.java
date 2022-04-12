package Lv1;

public class Lv1_04 { 
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int index=0;
        int cnt;
        for(int i=0; i<participant.length; i++){
            cnt=0;
            for(int j=0; j<completion.length; j++){
                if(participant[i].equals(completion[j])){
                    completion[j]=""; 
                    participant[i]="";
                    cnt++;
                }
            }
            if(cnt==0)index=i;
        }
        answer=participant[index];
        return answer;
    }
}
