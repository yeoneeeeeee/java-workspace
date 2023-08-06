package String;

public class String1 {

	public static void main(String[] args) {
		String s = "I Like Java and Python and C.";
		System.out.println(s); // I Like Java and Python and C.
		
		
//		1) 문자열 길이
		System.out.println(s.length()); // 0부터 세기 시작
		// 29
		
//		2) 대소문자 변환
		System.out.println(s.toUpperCase()); // 대문자로 
		// I LIKE JAVA AND PYTHON AND C.

		System.out.println(s.toUpperCase()); // 소문자로 
		// i like java and python and c.

//		3) 포함관계
		System.out.println(s.contains("Java")); // 포함된다면 true
		// true

		System.out.println(s.contains("C#")); // 포함되지 않는다면 false
		// false

		System.out.println(s.indexOf("Java")); // 위치정보 (포함된 글자가 시작하는 위치(0부터 세기 시작))
		// 7

		System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1
		// -1

		System.out.println(s.indexOf("ane")); // 처음 일치하는 위치 정보
		// 12

		System.out.println(s.lastIndexOf("and")); // 마지막에 위치하는 위치 정보
		// 23

		System.out.println(s.startsWith("I Like")); // 이 문자열로 시작하면 true 아니면 false
		// true

		System.out.println(s.endsWith(".")); // 이 문자열로 시작하면 true 아니면 false
		// true

	}

}
