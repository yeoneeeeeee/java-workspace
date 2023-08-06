package Control;

public class Else {

	public static void main(String[] args) {
		// 조건문 If Else
//		<사례5-1>
		int hour = 10;
		if(hour < 14){ // 오후 2시 이전이면
			System.out.println("아이스 아메리카노 +1");
			} else { // 그 외의 경우이면
			System.out.println("아이스 아메리카노 (디카페인) +1");
			}
			System.out.println("커피 주문 완료 #5_1");
		
//		<사례5-2>
		int hour1 = 15;
		if(hour1 < 14){ // 오후 2시 이전이면
			System.out.println("아이스 아메리카노 +1");
			} else { // 그 외의 경우이면
				System.out.println("아이스 아메리카노 (디카페인) +1");
			}
			System.out.println("커피 주문 완료 #5_2");
	
//		<사례6-1>
//		오후 2시 이후이거나 모닝 커피를 마신 경우?
		hour = 15;
		boolean morningCoffee = true;
		if(hour >=14 || morningCoffee == true){ //	오후 2시 이후이거나 모닝 커피를 마신 경우?
			System.out.println("아이스 아메리카노 (디카페인) +1");
		} else { // 그 외의 경우이면
	   		System.out.println("아이스 아메리카노 +1");
	   	}
		System.out.println("커피 주문 완료 #6_1");

//		<사례6-1>
//		오후 2시 이전이거나 모닝 커피를 마시지 않은 경우?
		hour = 10;
		boolean morningCoffee1 = false;
		if(hour >=14 || morningCoffee1 == true){ // 오후 2시 이후이거나 모닝 커피를 마신 경우?
			System.out.println("아이스 아메리카노 (디카페인) +1");
		} else { // 그 외의 경우이면
	   		System.out.println("아이스 아메리카노 +1");
	   	}
		System.out.println("커피 주문 완료 #6_2");
	}
}
