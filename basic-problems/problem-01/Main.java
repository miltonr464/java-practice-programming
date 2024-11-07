import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int x = read.nextInt();
		int n = x;
		
		for (int i = 1; i <= n; i++) {
			if (x % i == 0) {
				if (i != n) {
					System.out.print(i + ", ");
				} else {
					System.out.println(i + ".");
				}
			}
		}
	}

}
