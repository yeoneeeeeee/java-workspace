package Control;

public class Else_If {

	public static void main(String[] args) {
		// 조건문 Else If
		
		// 한라봉 에이드가 있으면 +1
		// 또는 망고 주스가 있으면 +1
		// 또는 아이스 아메리카노 +1
		
//		<사례1>
//		한라봉 에이드가 있고 망고 주스도 있고...
			boolean hallaAde = true; // 한라봉 에이드
			boolean mangoJuice = true; // 망고 주스

			if (hallaAde) {
				System.out.println("한라봉 에이드 +1");
			} else if (mangoJuice) {
				System.out.println("망고 주스 +1");
			} else {
				System.out.println("아이스 아메리카노 +1");
			}
			System.out.println("커피 주문 완료 #1");
//			출력 =>	한라봉 에이드 +1
//	   				커피 주문 완료 #1
	
// Else If 는 여러번 사용 가능
	
//		<사례2>
//		한라봉 에이드가 없고 망고 주스도 없고...
//			boolean hallaAde = false; // 한라봉 에이드
//			boolean mangoJuice = false; // 망고 주스
//
//			if (hallaAde) {
//				System.out.println("한라봉 에이드 +1");
//			} else if (mangoJuice) {
//				System.out.println("망고 주스 +1");
//			} else {
//				System.out.println("아이스 아메리카노 +1");
//			}
//			System.out.println("커피 주문 완료 #2");
//			
//	출력 =>	아이스 아메리카노 +1
//	   		커피 주문 완료 #2
			
//		<사례3>
//		 한라봉 에이드 없고 망고 주스도 있고...
//			boolean hallaAde = false; // 한라봉 에이드
//			boolean mangoJuice = true; // 망고 주스
//
//			if (hallaAde) {
//				System.out.println("한라봉 에이드 +1");
//			} else if (mangoJuice) {
//				System.out.println("망고 주스 +1");
//			} else {
//				System.out.println("아이스 아메리카노 +1");
//			}
//				System.out.println("커피 주문 완료 #3");
//			}
//	출력 => 	망고 주스 +1
//	   		커피 주문 완료 #3


//		<사례4>
//	 	한라봉 에이드 없고 망고 주스도 없고...
//			boolean hallaAde = false; // 한라봉 에이드
//			boolean mangoJuice = false; // 망고 주스
//
//			if (hallaAde) {
//				System.out.println("한라봉 에이드 +1");
//			} else if (mangoJuice) {
//				System.out.println("망고 주스 +1");
//			} else {
//				System.out.println("아이스 아메리카노 +1");
//			}
//			System.out.println("커피 주문 완료 #4");
//	출력 => 	아이스 아메리카노 +1
//	   		커피 주문 완료 #4
	
//		<사례5>
//	 	else if는 여러번 사용 가능
			hallaAde = false; // 한라봉 에이드
			mangoJuice = false; // 망고 주스
			boolean orangeJuice = true;

			if (hallaAde) {
				System.out.println("한라봉 에이드 +1");
			} else if (mangoJuice) {
				System.out.println("망고 주스 +1");
			} else if (orangeJuice) {
				System.out.println("오렌지 주스 +1");
			} else {
				System.out.println("아이스 아메리카노 +1");
			}
			System.out.println("커피 주문 완료 #5");
//	출력 => 	오렌지 주스 +1
//   		커피 주문 완료 #5
		
//		<사례6>
//		else 는 없어도 가능

			hallaAde = false; // 한라봉 에이드
			mangoJuice = false; // 망고 주스
			orangeJuice = false;

			if (hallaAde) {
				System.out.println("한라봉 에이드 +1");
			} else if (mangoJuice) {
				System.out.println("망고 주스 +1");
			} else if (orangeJuice) {
				System.out.println("오렌지 주스 +1");
			}
			System.out.println("커피 주문 완료 #6");
//	출력 => 	커피 주문 완료 #6
			
	}
}
