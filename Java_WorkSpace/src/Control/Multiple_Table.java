package Control;

public class Multiple_Table {

	public static void main(String[] args) {
		// 구구단
		// 2 * 1 = 2
		// 2 * 2 = 4
		
		for (int i = 2; i < 10; i++) {
			
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			
//			int j = 1;
//			System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 1 = 2
//			j++;
//			System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 2 = 4
//			j++;
//			System.out.println(i + "x" + j + "=" + (i * j)); // 2 * 3 = 6
			
			System.out.println();
		}
		
	}

}
