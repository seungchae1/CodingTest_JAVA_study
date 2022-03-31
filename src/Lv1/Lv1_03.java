package Lv1;

public class Lv1_03 { 
	public int[] solution(int[] lottos, int[] win_nums) {
    int[] answer = new int[2];
    int win_cnt=0;
    int zero_cnt=0;
    for(int i=0; i<lottos.length; i++){
        if(lottos[i]==0) zero_cnt++; 
        for(int j=0; j<lottos.length; j++){
            if(lottos[i]==win_nums[j]) win_cnt++;  
        }
    }
    
    answer[0]=Answer(win_cnt + zero_cnt);
    answer[1]=Answer(win_cnt);
    
    if(zero_cnt==6)answer[0]=1;
    return answer;
}
	int Answer(int a) {
	    switch(a) {
			case 0:
			case 1: return 6;
			case 2: return 5;
			case 3: return 4;
			case 4: return 3;
			case 5: return 2;	
			default: return 1;	
	    }
	}
}
