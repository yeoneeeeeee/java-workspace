package Basic;

public class Variables {

	public static void main(String[] args) {
//		String name; // name 문자열 변수가 선언되었음
//		name = "여니";
		
		// 변수 선언시 동시에 초기화
		String name = "여니";
		int hour = 15;
		
		
		
//		System.out.println("여니님, 배송이 시작됩니다. 15시에 방문 예정입니다.");
		System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
		
		System.out.println(name + "님, 배송이 완료되었습니다.");
//		System.out.println("여니님, 배송이 완료되었습니다.");
		
		double score = 90.5;
		char grade = 'A';
		name = "강백호"; // 중간에 변수 값을 변경하면 이후 출력값이 변경된 변수값으로 출력됨
		System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
		System.out.println("학점은 " + grade + "입니다.");
		
		boolean pass = true;
		System.out.println("이번 시험에 합격했을까요? " +pass);
		
		boolean pass1 = false;
		System.out.println("이번 시험에 합격했을까요? " +pass1);
	
	
		double d = 3.14;
//		float f = 3.14;  //float은 뒤에 f 혹은 F를 붙여줘야한다.
		float f = 3.14F;
		
		double d1 = 3.14123456789;
		float f1 = 3.14123456789F;
		System.out.println(d1);
		System.out.println(f1);
		
//		int i = 1000000000000; // int 자료형에 넣기에 값이 너무 커서 오류남 
		long l = 1000000000000L;
		l = 1000000000000L;
		System.out.println(l);

		// 눈으로 보기 편하게 _ 삽입
		l = 1_000_000_000_000L;
		System.out.println(l);

	}

}
