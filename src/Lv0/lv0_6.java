package Lv0;
// �迭�� ��հ�
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
