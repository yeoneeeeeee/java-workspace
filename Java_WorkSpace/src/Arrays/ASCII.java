package Arrays;

public class ASCII {

	public static void main(String[] args) {
		// 아스키코드 (ANSI) : 미국 표준 코드
		char c = 'A'; // 알파벳 대문자(A)는 65 부터 시작, 소문자(a)는 97 부터 시작, 숫자(0)는 48 부터 시작 
		System.out.println(c); // A
		System.out.println((int)c); // 65

		c = 'B';
		System.out.println(c); // B
		System.out.println((int)c); // 66
		
		c++;
		System.out.println(c); // C
		System.out.println((int)c); // 67
		
		// 소문자
//		char c = 'a';
//		System.out.println(c); // a
//		System.out.println((int)c); // 97
//
//		c = 'b';
//		System.out.println(c); //b
//		System.out.println((int)c); // 98
//		
//		c++;
//		System.out.println(c); // c
//		System.out.println((int)c); // 99
		
		// 숫자
//		char c = '0';
//		System.out.println(c); // 0
//		System.out.println((int)c); // 48
//
//		c = '1';
//		System.out.println(c); // 1
//		System.out.println((int)c); // 49
//		
//		c++;
//		System.out.println(c); // 2
//		System.out.println((int)c); // 50
		
		// 세로 크기 10 x 가로 크기 15 에 해당하는 영화관 좌석
		String[][] seats3 = new String[10][15];
		char ch = 'A';
		for(int i = 0; i<seats3.length; i++) { //세로
			for(int j = 0; j<seats3[i].length; j++) {
				seats3[i][j] = String.valueOf(ch) + (j + 1);  // ch => 문자열로 넣기 String.valueOf(ch)
			}
			ch++;
		}
		
		// 영화관 좌석 번호 확인
		for (int i=0; i < seats3.length; i++) { // 세로
			for (int j=0; j < seats3[i].length; j++) { // 가로
					System.out.print(seats3[i][j] + " "); // A1 A2 A3....
				}
				System.out.println();
			}
	}

}
