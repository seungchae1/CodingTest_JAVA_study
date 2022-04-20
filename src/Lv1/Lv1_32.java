package Lv1;

public class Lv1_32 {
    public String solution(String s) {
        String answer = "";
        int len, slen;
        if(s.length()%2==0){
            len=2;
            slen=s.length()/2-1;
        }
        else {
            len=1;
            slen=s.length()/2;
        }
        for(int i=slen; i<slen+len; i++){
                answer+=s.charAt(i);
        }
        return answer;
    }
}