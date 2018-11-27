import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T, N;
		int[] A;
		T = scanner.nextInt();

		for (int Test = 1; Test <= T; Test++) {
			N = scanner.nextInt();
			A = new int[N];

			for (int I = 0; I < N; I++)
				A[I] = scanner.nextInt();
			
			if (isExistElement(A, N))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		scanner.close();
	}

	static boolean isExistElement(int[] A, int n) {

		int half, sumLeft, sumRight, contender;
		boolean found = false;

		half = (n % 2 == 0) ? (n / 2 - 1) : n / 2;
		sumLeft = 0;
		sumRight = 0;

		contender = 0;

	
		for (int I = contender + 1; I < n; I++)
			sumRight += A[I];
		
		while ((contender < n) && (sumLeft != sumRight)) {
			if (sumRight > sumLeft) {
				contender += 1;
				sumRight -= A[contender];
				sumLeft += A[contender-1];
			}else {
				contender += 1;
			}
		}
		return (sumLeft == sumRight);
	}
}
