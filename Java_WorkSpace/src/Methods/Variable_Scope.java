package Methods;

public class Variable_Scope {
//	public static void methodA() {
	public static void methodA(int number) {  // 매개변수에 넣어서 다른 값에서 불러서 출력가능
//		System.out.println(number);
//		System.out.println(result);
	}
	
	public static void methodB() {
		int result = 1; // 지역 변수 : 중괄호 사이에 선언된 것만 출력가능
	}
	
	public static void main(String[] args) {
		// Variable_Scope
		int number = 3;
		
//		System.out.println(result);

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
//		System.out.println(i);
		
		{
			int j = 0;
			System.out.println(j);
		}
//		System.out.println(j);
	}

}
