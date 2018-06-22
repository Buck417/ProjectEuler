
public class SmallestMultiple {

	public static void main(String[] args) {
		System.out.println("Min number is " + smallestMultiple());

	}
	
	public static long smallestMultiple() {
		long max = factorial(20L);
		long n = 20;
		while(n < max){
			if(n % 20 == 0) {
				if(n % 19 == 0) {
					if(n % 18 == 0) {
						if(n % 17 == 0) {
							if(n % 16 == 0) {
								if( n % 15 == 0) {
									if(n % 14 == 0) {
										if(n % 13 == 0) {
											if(n % 12 == 0) {
												if(n % 11 == 0) {
													return n;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			n++;
		}
		return -1;
	}
	
	public static long factorial(long n)
	{
	    if(n == 1)
	    {
	        return 1;
	    }               
	    return n * factorial(n-1);
	}

}
