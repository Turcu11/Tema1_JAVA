import java.util.Scanner;

public class MyFirstClass {

	/** Documentatie pentru cod pentru ca am pus 2 astarix-uri */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
//		System.out.print("Please enter a number: ");
//		int n = s.nextInt();
//		Check5_1(n);
//		System.out.println("---------------------");
//		NumberInLetters_2(n);
//		System.out.println("---------------------");
//		System.out.print("Please enter the value of A & B: ");
//		int a = s.nextInt();					
//		int b = s.nextInt();
//		Problem3(a, b);				
//		System.out.println("---------------------");
//		System.out.print("Please enter the value of A & B & C: ");
//		int a4 = s.nextInt();					
//		int b4 = s.nextInt();		
//		int c4 = s.nextInt();		
//		System.out.println(Problem4(a4, b4, c4));
//		System.out.println("---------------------");
//		Problem5(s);
//		Problem6(s);
//		Problem7(s);
//		Problem8(s);
//		Problem9(n);
//		Problem10();
//		Problem11(80);
//		Problem12(1001);
//		Problem13();
//		Problem14();
//		Problem15();
//		Problem16(s);
//		Problem17(s);
//		Problem18(s);
//		Problem19(s);
		Problem20(s);
	}

	public static void Check5_1(int n) {
		if (n >= 5 && n <= 10)
			System.out.println("ADMIS");
		else if (n < 5 && n >= 1)
			System.out.println("RESPINS");
		else
			System.out.println("INVALID");
	}

	public static void NumberInLetters_2(int n) {

		switch (n) {
		case 1:
			System.out.println("UNU");
			break;
		case 2:
			System.out.println("DOI");
			break;
		case 3:
			System.out.println("TREI");
			break;
		case 4:
			System.out.println("PATRU");
			break;
		case 5:
			System.out.println("CINCI");
			break;
		default:
			System.out.println("INVALID");

		}
	}

	public static void Problem3(int a, int b) {
		if (a % 2 == 0 && b % 2 == 0)
			System.out.println((a + b) / 2);
		else if (a % 2 != 0 && b % 2 != 0)
			System.out.println(a * b);
		else
			System.out.println(a + b);
	}

	public static int Problem4(int a, int b, int c) {
		if (a < b)
			if (a < c)
				return a;
		if (b < a)
			if (b < c)
				return b;
		if (c < a)
			if (c < b)
				return c;
		return 0;

	}

	public static int Problem5(Scanner s) {
		System.out.print("How many numbers wold you like to insert ? : ");
		int n = s.nextInt();
		int num = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			num = s.nextInt();
			if (num % 2 == 0)
				sum = sum + num;
		}
		System.out.println("The sum of the even numbers : " + sum);
		return sum;
	}

	public static int Problem6(Scanner s) {
		System.out.print("How many numbers wold you like to insert ? : ");
		int n = s.nextInt();
		int num = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			num = s.nextInt();
			if (num % 2 != 0)
				sum = sum + num;
		}
		System.out.println("The sum of the odd numbers : " + sum);
		return sum;
	}

	public static int Problem7(Scanner s) {
		System.out.print("How many numbers wold you like to insert ? : ");
		int n = s.nextInt();
		int num = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			num = s.nextInt();
			sum = sum + num;
		}
		System.out.println("The Average of the numbers : " + sum / n);
		return sum / n;
	}

	public static void Problem8(Scanner s) {
		System.out.print("Factorial of: ");
		int n = s.nextInt();
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial = " + factorial);
	}

	public static boolean Problem9(int n) {
		boolean flag = true;
		if (n % 2 == 0) {
			return false;
		}
		for (int div = 3; div <= Math.sqrt(n); div++) {
			if (n % div == 0) {
				flag = false;
//				System.out.println("Am gasit un prim divizor " + div);
				break;
			}
			div++;
		}
		return flag;
	}

	public static void Problem10() {
		int n = 1001;
		while (true) {
			if (Problem9(n)) {
				System.out.println("Am gasit primul nr: " + n);
				break;
			} else
				n++;
		}
	}

	public static boolean Problem11(int n) {
		boolean flag = true;
		int div = 2;
		System.out.println("Numar: " + n);
		while (n != 1) {
			while (n % div == 0) {
				if (n % div == 0) {
					n = n / div;
					// flag = false;
					System.out.println("Am gasit divizor: " + div);
					System.out.println("Numar: " + n);
				}
			}
			div++;
		}
		return flag;
	}

	public static boolean Problem12(int n) {
		boolean flag = true;
		int div = 2;
		System.out.println("Numar: " + n);
		while (n != 1) {
			while (n % div == 0) {
				if (n % div == 0) {
					n = n / div;
					// flag = false;
					if (Problem9(div)) {
						System.out.println("Divizorii primi: " + div);
						div += 2;
					}
					System.out.println("Numar: " + n);
				}
			}
			div++;
		}
		return flag;
	}

	public static void Problem13() {
		int n = 1000;
		int n1 = 0;
		int n2 = n;

		while (n1 <= n) {
			if (n1 % 17 == 0 && n2 % 19 == 0) {
				System.out.println("N1: " + n1 + "\n" + "N2: " + n2);
				System.out.println();
			}
			++n1;
			--n2;
		}
	}

	public static void Problem14() {
		int n = 1000;
		int n1 = 1;
		int n2 = n - 1;

		while (n1 < n) {
			if (n1 + n2 == n) {
				if ((n1 % 17 == 0 || n1 % 13 == 0) && (n2 % 19 == 0 || n2 % 7 == 0)) {
					System.out.println("N1: " + n1 + "\n" + "N2: " + n2);
					System.out.println();
				}
				n1++;
				n2--;
			}
		}
	}

	public static void Problem15() {
		int n = 1000;
		for (int i = 1000; i < 10000; i++) {
			if (n % 9 == 0) {
				System.out.println("N: " + n);
			}
			n++;
		}
	}

	public static void Problem16(Scanner s) {
		System.out.println("Enter a multi-digit number");
		int n = s.nextInt();
		int nCopy = n;
		while (n > 10) {
			nCopy = n % 10;
			System.out.println(nCopy);
			n = n / 10;
		}
		System.out.println(n);

	}

	public static void Problem17(Scanner s) {
		System.out.println("Enter a multi-digit number");
		int n = s.nextInt();
		int nCopy = n;
		int max = 0;
		while (n > 10) {
			nCopy = n % 10;
			if (nCopy > max)
				max = nCopy;
			n = n / 10;
		}
		System.out.println("Max digit: " + max);
	}

	public static void Problem18(Scanner s) {
		System.out.println("Enter a multi-digit number");
		int n = s.nextInt();
		int nCopy = n;
		int min = 100000;
		while (n > 10) {
			nCopy = n % 10;
			if (nCopy < min)
				min = nCopy;
			n = n / 10;
		}
		System.out.println("Min digit: " + min);
	}

	public static void Problem19(Scanner s) {
		System.out.print("Enter a multi-digit number ");
		int n = s.nextInt();
		int reversed = 0;
		while (n != 0) {
			int nCopy = n % 10;
			reversed = reversed * 10 + nCopy;
			n = n / 10;
		}
		System.out.println("Reeversed: " + reversed);
	}

	public static void Problem20(Scanner s) {
		System.out.print("Enter a multi-digit number ");
		int n = s.nextInt();
		int n2 = n;
		int reversed = 0;
		while (n != 0) {
			int nCopy = n % 10;
			reversed = reversed * 10 + nCopy;
			n = n / 10;
		}
		if (reversed == n2)
			System.out.println(n2 + " Is a plaindrom number");

	}
}
