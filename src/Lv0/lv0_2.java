package Lv0;
// 배열 뒤집기
public class lv0_2 {
	class Solution {
	    public int[] solution(int[] num_list) {
	        int left =0;
	        int right = num_list.length-1;
	        while(left<right || left==right){
	            int temp = num_list[left];
	            num_list[left]=num_list[right];
	            num_list[right] = temp;
	            left++;
	            right--;
	        }
	        return num_list;
	    }
	}
}
