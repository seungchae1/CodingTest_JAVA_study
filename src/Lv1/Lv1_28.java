package Lv1;
import java.util.Arrays;
public class Lv1_28 {
    public int[] solution(int[] answers) {
		int[] sp1={1,2,3,4,5};
        int[] sp2={2,1,2,3,2,4,2,5};
        int[] sp3={3,3,1,1,2,2,4,4,5,5};
        int sp1len=sp1.length;
        int sp2len=sp2.length;
        int sp3len=sp3.length;
        
        int[] result= {0,0,0};
        for(int i=0; i<answers.length; i++){
            if(sp1[i%sp1len]==answers[i])result[0]++;
            if(sp2[i%sp2len]==answers[i])result[1]++;
            if(sp3[i%sp3len]==answers[i])result[2]++;
        }
        int[] index={1,2,3};
        int max=0,cnt=0;
        for(int i=0; i<3; i++){
            if(result[i]>=max) max=result[i];
        }
        for(int i=0; i<3; i++){
            if(result[i]==max) cnt++;
            else index[i]=-1;
        }
        int[] answer=new int[cnt];
        int j=0;
        for(int i=0; j<cnt; i++){
            if(index[i]==-1)continue;
            else {
                answer[j]=index[i];
                j++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}