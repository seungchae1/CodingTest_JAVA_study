package Lv0;
// 배열의 평균값
public class lv0_6 {
	class Solution {
	    public double solution(int[] numbers) {
	        double answer = 0;
	        for(int a : numbers){
	            answer+=a;
	        }
	        return answer/numbers.length;
	    }
	}
}
