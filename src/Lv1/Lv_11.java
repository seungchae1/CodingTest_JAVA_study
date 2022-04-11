package Lv1;

public class Lv_11 {
	class Solution {
	    public int solution(int[] nums) {
	        int answer=0;
	        int[] sum=new int[nums.length];
	        for(int i=0; i<nums.length; i++)
	        {
	            for(int j=0; j<nums.length; j++)
	            {
	                if(j==i)continue;
	                for(int s=0; s<nums.length; s++)
	                {
	                    if(s==j || s==i)continue;
	                    sum[i]=nums[i]+nums[j]+nums[s];
	                }
	            }
	            if(sum[i]%2!=0) 
	            {
	                answer++;
	                for(int j=i+1; j<sum.length; j++)
	                {
	                    if(sum[j]==sum[i])answer--;
	                }
	            }
	        }
	        return answer;
	    }
	}
}
