package Lv1;

public class Lv1_15 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int[] a=new int[commands[i][1]-commands[i][0]+1];
            for(int j=commands[i][0]; j<commands[i][1]; j++){
                int k=commands[i][2];
                for(int s=0; s<a.length; s++){
                    a[s]=array[j];
                }
                int flag=a[0];
                for(int s=1; s<a.length; s++){
                    if(a[s]>a[s-1]){
                        flag=a[s];
                        a[s]=a[s-1];
                        a[s-1]=flag;
                    }
                }
                answer[i]=a[k];
            }
        }
        return answer;
    }
}
