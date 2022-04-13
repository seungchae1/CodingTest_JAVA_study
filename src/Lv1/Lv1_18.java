package Lv1;

public class Lv1_18 {
    public boolean solution(int x) {
        boolean answer = false;
        String a=""+x;
        int[] b=new int[a.length()];
        int y=x;
        int i=0;
        while(y>=1){
            b[i]=y%10;
            y/=10;
            i++;
        }
        y=0;
        for(i=0; i<b.length; i++){
            y+=b[i];
        }
        if(x%y==0)answer=true;
        return answer;
    }
}
