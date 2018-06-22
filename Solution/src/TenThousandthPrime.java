
public class TenThousandthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long count = 2;
		long ans = 0;
		for(long i = 5; i < Long.MAX_VALUE; i++) {
			if(isPrime(i)) {
				count++;
				if(count == 10001) {
					ans = i;
					break;
				}
			}
			
		}
		System.out.println(ans);

	}
	
	public static boolean isPrime(long n) {
		if(n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		long i = 5;
		while( i * i <= n) {
			if(n % i == 0 || n % (i+2) == 0) {
				return false;
			}
			i +=6;
		}
		return true;
	}

}
