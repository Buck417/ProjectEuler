
public class EvenFib {
	
	public static void main(String[] args) {
		System.out.println(evenSum());
	}
	
	public static int evenSum() {
		int evenSum = 2;
		int maxVal = 4000000;
		int currSum = 0;
		int firstNum = 1;
		int secondNum = 2;
		while(currSum < maxVal) {
			currSum = firstNum + secondNum;
			if(currSum > maxVal) {
				break;
			}
			if(currSum % 2 == 0) {
				evenSum += currSum;
			}
			firstNum = secondNum;
			secondNum = currSum;
			System.out.println(currSum);
		}
		currSum = firstNum;
		
		
		
		return evenSum;
	}

}
