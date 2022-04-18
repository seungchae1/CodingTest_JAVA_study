package Lv1;

public class Lv1_25 {
    public int[] solution(int[] arr, int divisor) {
        int cnt=0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]%divisor==0)cnt++;
        if(cnt==0){
            int[] answer={-1};
            return answer;
        }
        else{
            int[] answer = new int[cnt];
            int j=0;
            for(int i=0; j<answer.length; i++){
                if(arr[i]%divisor==0)answer[j]=arr[i];
                j++;
            }
            for(int i=0; i<answer.length-1; i++){
                for(int y=1; y<answer.length; y++){
                    if(answer[i]>answer[y]){
                    int flag=answer[i];
                    answer[i]=answer[y];
                    answer[y]=flag;
                    }
                }
            }
             return answer;
        }
    }
}