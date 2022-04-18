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
        int j=0;
        for(int i=0; j<cnt; i++){
            if(arr[i]%divisor==0)answer[j]=arr[i];
            j++;
        }
        Arrays.sort(answer);
        return answer;
    }
}