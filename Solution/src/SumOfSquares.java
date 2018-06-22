
public class SumOfSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumOfSquares(10));

	}
	
	public static int SumOfSquares(int n) {
		int sumOfSquares = 0;
		int squareOfSums = 0;
		for(int i = 1; i <= n; i++) {
			sumOfSquares += Math.pow(i,  2);
			squareOfSums += i;
		}
		squareOfSums = (int) Math.pow(squareOfSums, 2);
		return squareOfSums - sumOfSquares;
	}

}
