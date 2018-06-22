
public class PythagTriple {

	public static void main(String[] args) {
		System.out.println(pyTriple());

	}
	
	public static int pyTriple() {
		for(int a = 0; a < 1000; a++) {
			for(int b = 0; b < 1000; b++) {
				for(int c = 0; c < 1000; c++) {
					if(((a + b + c) == 1000) && (a < b) && (b < c)) {
						if(Math.pow(a,  2) + Math.pow(b, 2) == Math.pow(c, 2)) {
							System.out.println(a + " " + b + " " + c);
							return a*b*c;
						}
					}
				}
			}
		}
		return -1;
	}

}
