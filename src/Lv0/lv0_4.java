package Lv0;
// 최댓값 만들기
import java.util.*;

public class lv0_4 {
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = 0;

	        Arrays.sort(numbers); //자주 사용함 

	        return numbers[numbers.length-1]*numbers[numbers.length-2];
	    }
	}
}
