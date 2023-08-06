package Control;

public class Switch_Case {

	public static void main(String[] args) {
		// Switch Case

		// 석차에 따른 장학금 지급
		// 1등 : 전액 장학금
		// 2등 : 반액 장학금
		// 3등 : 반액 장학금
		// 그 외 : 장학금 대상 아님

//		<사례1>
		int ranking = 1; // 등수
		if (ranking == 1) {
			System.out.println("전액 장학금");
		} else if (ranking == 2) {
			System.out.println("반액 장학금");
		} else if (ranking == 3) {
			System.out.println("반액 장학금");
		} else {
			System.out.println("장학금 대상 아님");
		}
		System.out.println("조회 완료 #1_1");
		
//		<사례2>
		int ranking2 = 2; // 등수
		if (ranking2 == 1) {
			System.out.println("전액 장학금");
		} else if (ranking2 == 2) {
			System.out.println("반액 장학금");
		} else if (ranking2 == 3) {
			System.out.println("반액 장학금");
		} else {
			System.out.println("장학금 대상 아님");
		}
		System.out.println("조회 완료 #1_2");
		
//		<사례3>
		int ranking3 = 3; // 등수
		if (ranking3 == 1) {
			System.out.println("전액 장학금");
		} else if (ranking3 == 2) {
			System.out.println("반액 장학금");
		} else if (ranking3 == 3) {
			System.out.println("반액 장학금");
		} else {
			System.out.println("장학금 대상 아님");
		}
		System.out.println("조회 완료 #1_3");

//		<사례4>
		int ranking4 = 4; // 등수
		if (ranking4 == 1) {
			System.out.println("전액 장학금");
		} else if (ranking4 == 2) {
			System.out.println("반액 장학금");
		} else if (ranking4 == 3) {
			System.out.println("반액 장학금");
		} else {
			System.out.println("장학금 대상 아님");
		}
		System.out.println("조회 완료 #1_4_1");
		
//		<사례5>
		// If Else 문을 이용  ( 여러 조건 또는 범위에 해당하는 조건)

		int ranking5 = 4; // 등수
		if (ranking == 1) {
			System.out.println("전액 장학금");
		} else if (ranking == 2 || ranking == 3) {
			System.out.println("반액 장학금");
		} else {
			System.out.println("장학금 대상 아님");
		}
		System.out.println("조회 완료 #1_4_2");
		
		
//		<사례6>
		// Switch Case 문을 이용 (명확한 케이스가 있는 경우)
/*		switch ( exprssion ){
			case A: ...수행할 명령...
				break;
			case B: ...수행할 명령...
				break;
			case C: ...수행할 명령...
				break;
			default: ...수행할 명령...
		}
*/
		// Switch Case 문을 이용
		ranking = 1;
		switch ( ranking ){
			case 1: 
				System.out.println("전액 장학금");
				break;
			case 2: 
				System.out.println("반액 장학금");
				break;
			case 3: 
				System.out.println("반액 장학금");
				break;
			default:
				System.out.println("장학금 대상 아님");
		}
		System.out.println("조회 완료 #2");
		
//		<사례7>
		// case 2와 3 을 통합
		// case 2와 case 3의 출력 내용이 같아서 통합가능

//		7-1) 
		ranking = 2;
		switch ( ranking ){ 
			case 1: 
				System.out.println("전액 장학금");
				break;
			case 2: 
			case 3: 
				System.out.println("반액 장학금");
				break;
			default:
				System.out.println("장학금 대상 아님");
		}
		System.out.println("조회 완료 #3_1");
		
//		7-2) 
		ranking = 3;
		switch ( ranking ){
			case 1: 
				System.out.println("전액 장학금");
				break;
			case 2: 
			case 3: 
//			case 4: 
//			case 5: 뒤에 더 적어도 상관없다.
				System.out.println("반액 장학금");
				break;
			default:
				System.out.println("장학금 대상 아님");
		}
		System.out.println("조회 완료 #3_2");
		
		
		
//		<사례8>
		// 중고 상품의 등급에 따라 가격을 책정 (1급 : 최상 , 4급 : 최하)
		 
		int grade = 1; // 등급
		int price = 7000; // 기본가격
		switch (grade) {
			case 1:
				price += 1000; //price = price+1000;
			case 2:
				price += 1000;
			case 3:
				price += 1000;
				break;
		}
		System.out.println(grade + "등급 제품의 가격 : " + price + "원");
//		=> 1등급 제품의 가격 : 10000원
		
		
//		<사례9>
		int score = 95;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else {
		System.out.println("C");
		}
		
//		즉	=> If Else문은 여러조건 또는 범위에 사용
//		 	   Switch Case문은 명확한 케이스가 있는 경우
	}
}

