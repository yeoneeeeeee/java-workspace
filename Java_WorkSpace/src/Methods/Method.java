package Methods;

public class Method {
//	Method 메소드 정의
	public static void sayHello() { // 메소드명은 주로 동사를 씀. 낙타표기법 사용
		System.out.println("안녕하세요? 메소드입니다.");
	}
	
	
	
	public static void main(String[] args) {
		// Method 메소드 호출
		System.out.println("메소드 호출 전");
		sayHello(); // System.out.println("안녕하세요? 메소드입니다."); 이 출력문이 여기 있는 것과 같다.
		sayHello();
		sayHello();
		sayHello();
		System.out.println("메소드 호출 후");

	}

}
