import java.util.Scanner;

public class AllEvenDigits {

	public static void main(String[] args) {
		int initialRange;
		int finalRange;
		Scanner sc = new Scanner(System.in);

		System.out.print("Podaj pocz¹tkow¹ wartoœæ zakresu: ");
		initialRange = sc.nextInt();

		System.out.print("Podaj koñcow¹ wartoœæ zakresu: ");
		finalRange = sc.nextInt();
		
		sc.close();

		for (int i = initialRange + 1; i < finalRange; i++) {

			int insideVariable = i; // is for operations on number, without changing for-loop

			while (insideVariable % 2 == 0) {

				// positive numbers
				if (insideVariable < 10 && insideVariable >= 0) {
					System.out.println(i);
					break;
				}

				// negative numbers
				if (insideVariable > -10 && insideVariable < 0) {
					System.out.println(i);
					break;
				}

				insideVariable = insideVariable / 10;
			}
		}
	}
}
