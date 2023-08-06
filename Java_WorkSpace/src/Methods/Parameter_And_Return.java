package Methods;

public class Parameter_And_Return {

	public static int getPower(int number) {
		int result = number * number;
		return result;
		// return number * number; 위 두줄 한줄로 줄여서 표현가능
	}

	public static int getPowerByExp(int number, int exponent) {
		int result = 1; // 변수 초기값 선언
		for(int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// Parameter And Return
		// 전달값과 반환값이 있는 메소드
		int retVal = getPower(2); // retVal : return power value 줄임 // 2 * 2 = 4;
		System.out.println(retVal);
		
		retVal = getPower(3);
		System.out.println(retVal); // 3 * 3 = 9

		retVal = getPowerByExp(3,3); 
		System.out.println(retVal); // 3 * 3 * 3 = 27
		
		System.out.println(getPowerByExp(2,4)); // 2 * 2 * 2 * 2 = 16
	} 

}
