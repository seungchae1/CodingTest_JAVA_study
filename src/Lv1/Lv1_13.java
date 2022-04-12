package Lv1;

public class Lv1_13 {
	public int solution(int n) {
        int answer = 0;
        int m=n;
        int cnt=0;
        while(m>10){
            m/=10;
            cnt++;
        }
        int flag=1;
        for(int i=cnt; i>=1; i--){
            flag*=10;
            answer+=(n-answer*flag)/flag;
        } 
            
        return answer;
    }
}
