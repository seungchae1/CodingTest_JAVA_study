package Lv1;

public class Lv_11 {
    public int solution(int[] nums) {
        int answer = 0;
        int sum=0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int s=j+1; s<nums.length; s++){
                    sum=nums[i]+nums[j]+nums[s];
                    int cnt=0;
                    for(int a=1; a<=sum; a++){
                        if(sum%a==0)cnt++;
                    }
                    if(cnt==2)answer++;
                }
            }
        }
        return answer;
    }
}
