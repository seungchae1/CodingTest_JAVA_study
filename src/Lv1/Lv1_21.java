package Lv1;

public class Lv1_21 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int sum=0;
        for(int i=1; i<=count; i++){
            sum+=price*i;
        }
        answer=sum-money;
        return answer;
    }
}
