package Lv0;
// �迭�� ��հ�
import java.util.Arrays;
public class lv0_6 {
	class Solution {
	    public double solution(int[] numbers) {
	        return Arrays.stream(numbers).average().orElse(0);
	    }
	}
}
