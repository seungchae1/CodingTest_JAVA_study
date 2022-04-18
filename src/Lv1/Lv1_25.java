package Lv1;
import java.util.Arrays;
public class Lv1_25 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer={-1};
        int cnt=0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]%divisor==0)cnt++;
        if(cnt==0) return answer;
        answer = new int[cnt];
        int k=0;
        for(int i=0; i<cnt; i++){
            for(int j=k; j<arr.length; j++)
                if(arr[j]%divisor==0){
                    answer[i]=arr[j];
                    k=j+1;
                    break;
                }
        }
        Arrays.sort(answer);
        return answer;
    }
}