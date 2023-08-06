package String;

public class EscapeSequence {

	public static void main(String[] args) {
		// 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
		// \n \t \\ \" \'
		System.out.println("자바가");
		System.out.println("너무");
		System.out.println("재밌어요");

		// \n : 줄바꿈
		System.out.println("자바가\n너무\n재밌어요."); 

		// \t : 탭
		// 해물파전	9000원
		// 김치전		8000원
		// 부추전		8000원
		System.out.println("해물파전\t\t9000원");
		System.out.println("김치전\t\t8000원");
		System.out.println("부추전\t\t8000원");
		
		// \\ : 역슬래시 (파일명 등에 \표기가 필요할 때 \(역슬래시) 두번해야 출력시 \(역슬래시) 하나가 나옴)
		System.out.println("c:\\Program Files\\Java");
		
		// \" : 큰따옴표
		// 단비가 "냐옹"이라고 했어요
		System.out.println("단비가 \"냐옹\"이라고 했어요");

		// \' : 작은따옴표
		// 단비가 '뭘 봐?' 라는 표정을 지었어요
		System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
		// \(역슬래시)가 없어도 작은따옴표 출력됨.
		System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");
		
		char c = 'A';
		c = '\'';  // char c에 '(작은따옴표)를 넣고 싶을 때 c = '''; 이렇게 적으면 오류남 
		System.out.println(c);

	}

}
