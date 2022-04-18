package Lv1;

public class Lv1_26 {
    public int[] solution(int[] arr) {
        int[] answer={-1};
        if(arr.length==1) return answer;
        answer = new int[arr.length-1];
        int min=0;
        for(int i=0; i<arr.length; i++){
            if(i==0)min=arr[0];
            if(min>arr[i])min=arr[i];
        }
        for(int i=0; i<answer.length; i++){
            if(arr[i]>min)answer[i]=arr[i];
        }
        return answer;
    }
}
