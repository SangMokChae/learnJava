package test;

public class practice{
	public static void main(String[] args) {
		int size = 4;
		
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j < size + i; j++) {
				if (size - i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for (int i = size - 1; i >= 1; i--) {
			for (int j = 1; j < size + i; j++) {
				if (size - i >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}