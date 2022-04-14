package Lv1;

public class Lv1_20 {
    public int solution(int[][] sizes) {
        int[] w=new int[sizes.length];
        int[] h=new int[sizes.length];
        for(int i=0; i<sizes.length; i++){
            w[i]=sizes[i][0];
            h[i]=sizes[i][1];
            if(h[i]>w[i]){
                int flag=h[i];
                h[i]=w[i];
                w[i]=flag;
            }
        }
        int max_w=w[0];
        int max_h=h[0];
        for(int i=1; i<w.length; i++){
            if(w[i]>max_w) max_w=w[i];
            if(h[i]>max_h) max_h=h[i];
        }
        int answer= max_w*max_h;
        return answer;
    }
}
