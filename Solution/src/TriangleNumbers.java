
public class TriangleNumbers {
	
	private static boolean ansFound = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startingSize = 50;
		long ans = 0;
		while(!ansFound) {
			ans = triangleNum(startingSize);
			startingSize++;
			//System.out.println(startingSize);
		}
		System.out.println(ans);
	}
	
	public static long triangleNum(int start) {
		long sum = 0;
		for(int i = 1; i <= start; i++) {
			sum += i;
		}
		fiveHundredDivisors(sum);
		return sum;
	}
	
	public static void fiveHundredDivisors(long n) {
		int count = 0;
		for(int i = 1; i < (int) Math.sqrt(n); i++) {
			if((n % i) == 0) {
				count+=2;
			}
		}
		//System.out.println(count);
		if(count >= 500) {
			ansFound = true;
		}
	}

}
