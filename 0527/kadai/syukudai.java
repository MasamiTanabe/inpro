package kadai;

import java.util.Scanner;

public class syukudai {
	static int gcdOfArray(int[] a) {
		int ans = 1;
		int flag = 0;
		for (int i = 2; flag == 0; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] % i == 0) {
					if (j == a.length - 1) {
						ans *= i;
						for (int k = 0; k < a.length; k++) {
							a[k] = a[k] / i;
						}
						i = 1;
					}
				} else {
					break;
				}

			}
			for (int j = 0; j < a.length; j++) {
				if (a[j] < i) {
					flag = 1;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("配列aの要素数:");
		int num = stdIn.nextInt();
		int[] a = new int[num];
		int i;
		for (i = 0; i < num; i++) {
			System.out.println("a[" + i + "]の要素");
			a[i] = stdIn.nextInt();
		}
		System.out.print("入力した値は[");
		for (i = 0; i < num; i++) {
			System.out.print(a[i]);
			if (i < num - 1)
				System.out.print(", ");
		}
		System.out.print("]です。");
		System.out.println("最大公約数は" + gcdOfArray(a) + "です。");
	}
}