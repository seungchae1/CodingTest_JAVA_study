package Lv1;

public class Lv1_06 {
    public long solution(long n) {
        long answer = 0;
        for(int i=1; i<=n; i++){
            if(n/i==i){
                answer=(i+1)*(i+1);
                break;
            }
        }
        if(answer==0) answer=-1;
        return answer;
    }
}
