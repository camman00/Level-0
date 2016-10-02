
public class Fibonacci {
	public static void main(String[] args) {
		int start = 0;
		int second = 0;
		int end = 1;
		
		//0
		for (int i = 0; i < 10; i++) {
		
			
			start += second;
			second = start;
			end = start + second;
			System.out.println(end);
			second = end;
		
		}
			
	}

}
