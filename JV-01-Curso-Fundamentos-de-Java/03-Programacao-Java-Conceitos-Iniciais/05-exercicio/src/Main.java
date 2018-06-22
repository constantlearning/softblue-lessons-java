import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		while (x < 1000) {
			
			if(x % 2 == 0) {
				x += 5;
			}
			else {
				x *= 2;
			}
			System.out.println(x);
		}
	}
}
