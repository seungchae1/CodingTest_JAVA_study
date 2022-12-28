package Lv1;

public class Main_test {

	public static void main(String[] args) {
		Lv1_28 lv = new Lv1_28();
		int[] arr= {2,2,3,3,4,4,5,5};
		int[] answer=lv.solution(arr);
		for(int i=0; i<answer.length; i++)
			System.out.print(answer[i]);
	}
}
