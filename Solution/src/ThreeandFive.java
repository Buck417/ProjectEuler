
public class ThreeandFive {
	
	public static void main(String[] args) {
		System.out.println(sumOf(3, 5, 1000));
	}
	
	private static int sumOf(int a, int b, int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(((i % a) == 0) || ((i % b) == 0)) {
				sum += i;
				//System.out.println(i);
			}
		}
		return sum;
	}

}
