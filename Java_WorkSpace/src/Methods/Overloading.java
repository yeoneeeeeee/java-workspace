package Methods;

public class Overloading {
	public static int getPower(int number) {
		int result = number * number;
		return result;
		// return number * number; 위 두줄 한줄로 줄여서 표현가능
	}

	
//	public static double getPower(int number) { 이미 int 정수형으로 선언이 되어 있어서 중복 선언이 안됨.(즉, 반환형은 오버로딩과 상관없다.)
//		return 0.0;
//	}
	
	
//	public static int getPowerStr(String strNumber) { // 문자열을 넣겠다
	public static int getPower(String strNumber) { // 문자열을 넣겠다  (즉, 매개변수의 타입이 다름) 
		int number = Integer.parseInt(strNumber); // 문자열을 정수형으로 변환
		return number * number;
	}
	
//	public static int getPowerByExp(int number, int exponent) {
	public static int getPower(int number, int exponent) { // (즉, 매개변수의 갯수가 다름) 
		int result = 1; // 변수 초기값 선언
		for(int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}

	public static void main(String[] args) {
		// Overloading 메소드 오버로딩
		// 같은 이름의 메소드를 여러 번 선언
		// 1. 전달값(매개변수)의 타입이 다르거나 
		// 2. 전달값(매개변수)의 갯수가 다르거나 
		// 일때 가능
		// + 반환형은 상관없다.
		System.out.println(getPower(3)); // 3 * 3 = 9
//		System.out.println(getPowerStr("4")); // 문자열은 "" 안에 값넣음. // 4 * 4 = 16
		System.out.println(getPower("4")); // 문자열은 "" 안에 값넣음. // 4 * 4 = 16
//		System.out.println(getPowerByExp(3,3)); // 3 * 3 * 3 = 27
		System.out.println(getPower(3,3)); // 3 * 3 * 3 = 27

//		메소드명을 바꿔서 출력문 메소드명과 일치하게 만들면, 이전 다른 메소드명일 떄와 출력값이 일치한다.
//		==> 똑같은 이름의 메소드를 여러번 중복해서 사용하는 것을 오버로딩이라고 한다.
				
	}

}
