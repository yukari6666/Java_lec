package triangle;

public class triangle {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < (4 + i); j++) {
				if (i + j < 4) {
					System.out.print(" ");
				} else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
		System.out.println();
//		for (int i = 0; i < 7-2; i--) {
//			for (int j = 0; j < (4 + i); j++) {
//				if (i + j < 4) {
//					System.out.print(" ");
//				} else {
//					System.out.print("@");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println();
	}
}
