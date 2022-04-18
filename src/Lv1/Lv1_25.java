package Lv1;

public class Lv1_25 {
    public int[] solution(int[] arr, int divisor) {
        int cnt=0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]%divisor==0)cnt++;
        int[] answer = new int[cnt];
        int j=0;
        for(int i=0; j<cnt; i++){
            if(arr[i]%divisor==0)answer[j]=arr[i];
            j++;
        } 
        return answer;
    }
}
