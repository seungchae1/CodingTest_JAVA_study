package Lv1;

public class Lv1_15 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int a=commands[i][0]-1;
            int b=commands[i][1]-1;
            int c=commands[i][2]-1;
            int[] arr=new int[b-a+1];
            for(int j=0; j<commands[i].length; j++){
                for(int x=0; a<=b; x++){
                	arr[x]=array[a];
                	a++;
                }
                int flag=arr[0];
                for(int s=1; s<arr.length; s++){
                    if(arr[s]<arr[s-1]){
                        flag=arr[s-1];
                        arr[s-1]=arr[s];
                        arr[s]=flag;
                    }
                }
            }
            answer[i]=arr[c];
        }
        return answer;
    }
}