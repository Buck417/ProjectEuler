
public class ThreeDigitPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome();
		System.out.println("Simple sol is: " + simpleSolution());

	}
	
	public static void palindrome() {
		int firstMult = 999;
		int secondMult = 999;
		int maxSum = 0;
		int maxFirst = 0;
		int maxSecond = 0;
		for(int i = firstMult; i > 99; i--) {
			for(int j = secondMult; j > 99; j--) {
				int ans = i * j;
				if(isPalindrome(ans)) {
					System.out.println(i + " " + j);
					if(maxSum < i+j) {
						maxSum = i+j;
						maxFirst = i;
						maxSecond = j;
					}
					break;
				}
				
			}
		}
		System.out.println("Max is " + maxFirst * maxSecond);
	}
	
	public static boolean isPalindrome(int n) {
		int temp = n;
		int numDigits = 0;
		while(temp > 0) {
			temp /= 10;
			numDigits++;
		}
		int[] vals = new int[numDigits];

		temp = n;
		for(int i = numDigits-1; i >= 0; i--) {
			vals[i] = temp % 10;
			temp /= 10;
		}
		
		int leftpos = 0;
		int rightpos = numDigits-1;
		while(leftpos < rightpos) {
			if(rightpos == -1) {
				rightpos--;
			}
			else {
				if(vals[leftpos] == vals[rightpos]) {
					leftpos++;
					rightpos--;
				}
				else {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static int simpleSolution() {
		int maxSol = 0;
		for(int i = 999; i > 99; i--) {
			for(int j = 999; j > 99; j--) {
				int sol = i * j;
				int tempSol = sol;
				int rev = 0;
				while(tempSol > 0) {
					rev = rev*10 + (tempSol % 10);
					tempSol /= 10;
				}
				if(rev == sol) {
					if(sol > maxSol) {
						maxSol = sol;
					}
				}
			}
		}
		
		return maxSol;
	}

}
