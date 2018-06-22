
public class LargestPrimeFactor {

	public static void main(String[] args) {
		System.out.println(largestFactor(600851475143L));

	}
	
	public static long largestFactor(long l) {
		long largestPrime = -1;
		while(l % 2 == 0) {
			l = l / 2;
		}
		
		for(int i = 3; i < Math.sqrt(l); i+= 2) {
			while( l % i == 0) {
				l = l / i;
			}
			largestPrime = l;
		}
		return largestPrime;
	}

}
