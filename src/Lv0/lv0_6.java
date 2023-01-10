package Lv0;
// 배열의 평균값
import java.util.Arrays;
public class lv0_6 {
	class Solution {
	    public double solution(int[] numbers) {
	        return Arrays.stream(numbers).average().orElse(0);
	    }
	}
}
