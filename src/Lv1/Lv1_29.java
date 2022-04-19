package Lv1;

public class Lv1_29 {
    public int solution(int[] nums) {
        int[] nums2=nums;
        int cnt=nums.length;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums2.length; j++){
                if(nums[i]==nums2[j]){
                    cnt--;
                    break;
                }
            }
        }
        return cnt;
    }
}