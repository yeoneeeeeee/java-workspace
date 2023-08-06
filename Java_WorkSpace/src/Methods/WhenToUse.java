package Methods;

public class WhenToUse {
	
	// 메소드 내에서도 또 다른 메소드를 호출할 수 있다.
	public static int getPower(int number) {
//		int result = number * number;
//		return result;
//		return number * number; 위 두줄 한줄로 줄여서 표현가능
		return getPower(number,2);
	}
	
	public static int getPower(int number, int exponent) {
		int result = 1; // 변수 초기값 선언
		for(int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}

	public static void main(String[] args) {
		// WhenToUse
		// 메소드가 필요한 이유
		
		// 반복되는 코드가 너무 많아 중복된다. -> 코드를 간략히 줄이자
		
		// 2의 2승 구하기
//		int result = 1; // 변수 초기값 선언
//		for(int i = 0; i < 2; i++) {
//			result *= 2;
//		}
//		System.out.println(result); // 2 * 2 = 4
		System.out.println(getPower(2,2));
		
		// 3의 3승 구하기
//		result = 1; // 변수 초기값 선언
//		for(int i = 0; i < 3; i++) {
//			result *= 3;
//		}
//		System.out.println(result); // 3 * 3 * 3 = 27
		System.out.println(getPower(3,3));

		
		// 4의 2승 구하기
//		result = 1; // 변수 초기값 선언
//		for(int i = 0; i < 2; i++) {
//			result *= 4;
//		}
//		System.out.println(result); // 4 * 4 = 16
		System.out.println(getPower(4,2));

	}
}
