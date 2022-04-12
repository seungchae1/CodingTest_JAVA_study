package Lv1;

public class Lv1_14 {
    public int[] solution(long n) {
        String str = ""+n;
        int[] answer=new int[str.length()];
        for(int i=0; n>0; i++)
        {
            answer[i]=(int)(n%10);
            n/=10;
        }
        return answer;
    }
}
