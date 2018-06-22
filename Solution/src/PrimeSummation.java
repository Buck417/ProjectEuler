
public class PrimeSummation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 2000000;
		System.out.println(primeSums(size));

	}
	
	private static long primeSums(int n) {
		long sum = 2+3+5;
		for(int i = 7; i < n; i++) {
			if(isPrime(i)) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	private static boolean isPrime(int n) {
		if(n % 2 == 0 || n % 3 == 0 ) {
			return false;
		}
		long i = 5;
		
		while(i * i <= n) {
			if(n % i == 0 || n % (i+2) == 0) {
				return false;
			}
			i += 6;
		}
		System.out.println(n);
		return true;
	}

}
