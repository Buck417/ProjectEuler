
public class CollatzNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestTerms(1000000));

	}
	
	public static int longestTerms(int n) {
		int maxTerms = 0;
		int number = 0;
		for(int i = 1; i < n; i++) {
			int term = performCollatz(i);
			if(term > maxTerms) {
				maxTerms = term;
				number = i;
			}
		}
		System.out.println(number);
		return maxTerms;
	}
	
	public static int performCollatz(long n) {
		long temp = n;
		int count = 1;
		while(n != 1) {
			if(n < 1) {
				System.out.println("count is " + count + "and n is " + n);
				break;
			}
			if(n % 2 == 0) {
				n /= 2;
			}
			else {
				n = 3*n+1;
			}
			count++;
			//System.out.println("Current n is " + n + " and count is " + count);
		}
		System.out.println("Count for " + temp + " is " + count);
		return count;
	}

}
