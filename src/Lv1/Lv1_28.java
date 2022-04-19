package Lv1;

public class Lv1_28 {
    public int[] solution(int[] answers) {
        int[] answer ={0,0,0};
        int j=1;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==j)answer[0]+=1;
            if(j==5)j=1;
            else j++;
        }
        j=1;
        for(int i=0; i<answer.length; i++){
            if(i%2==0){
                if(answers[i]==2)answer[1]+=1;
                else if(answers[i]==j)answer[1]+=1; 
            } 
            if(j==5)j=1;
            else j++;
        }
        j=3;
        for(int i=0; i<answer.length; i++){
            if(answers[i]==j)answer[1]+=1;
            if(i%2==1){
                if(j==2)j=4;
                else if(j==5)j=3;
                else j++;
            }
        }
        int max=0, cnt=0;
        for(int i=0; i<3; i++){
            if(answer[i]>=max){
                max=answer[i];
                cnt++;
            }
        }
        int[] answer2=new int[cnt];
        max=0;
        j=0;
        for(int i=0; i<3; i++){
            if(answer[i]>=max){
                max=answer[i];
                answer2[j]=answer[i];
                j++;
            }
        }
        return answer2;
    }
}