package Control;

public class If {
	public static void main(String[] args) {
//		 <사례1>
//		 오후 2시 이전에 모닝커피를 마신 경우 "아이스 아메리카노 +1"은 안뜨고 "커피 주문 완료"만 출력
//		 오후 2시 이전에 모닝커피를 마시지 않은 경우 "아이스 아메리카노 +1"과 "커피 주문 완료" 둘다 출력
		
		// 조건문 If
		int hour = 15; // 오후 3시
		
		//if문 내에서 하나의 문장만 실행할때는 중괄호{} 생략 가능
		if (hour < 14) 
			System.out.println("아이스 아메리카노 +1");


		//if문 내에서 2개 이상의 문장을 실행할때는 중괄호{} 생략 불가
		if (hour <14) {
			System.out.println("아이스 아메리카노 +1");
			System.out.println("샷추가");
		}
		System.out.println("커피 주문 완료");
		
		
//		 <사례2>
//		 오후 2시 이전, 모닝커피를 마시지 않은 경우?
			hour =10;
			boolean morningCoffee = false; //모닝커피 마신 유무
			//if (hour < 14 && morningCoffee == false){
			if (hour < 14 && !morningCoffee){ // ! 논리부정연산자 사용
				System.out.println("아이스 아메리카노 +1");
		      }
			System.out.println("커피 주문 완료 #1");
		
//		  <사례3-1>
//        오후 2시 이전, 모닝커피를 마신 경우?
			hour =10;
			boolean morningCoffee1 = true; //모닝커피 마신 유무
			if (hour < 14 && morningCoffee1 == false){
				System.out.println("아이스 아메리카노 +1");
		      }
			System.out.println("커피 주문 완료 #2_1");
			
//		  <사례3-2>
//		  오후 2시 이전, 모닝커피를 마신 경우?
			hour =15;
			boolean morningCoffee2 = true; //모닝커피 마신 유무
			if (hour < 14 && morningCoffee2 == false){
				System.out.println("아이스 아메리카노 +1");
		      }
			System.out.println("커피 주문 완료 #2_2");
			
//		  <사례4-1>
//		  오후 2시 이후이거나 모닝 커피를 마신 경우? 디카페인을 마실 예정
			hour =15;
			morningCoffee = true; //모닝커피 마신 유무
			//if (hour >= 14 || morningCoffee == true){
			if (hour >= 14 || morningCoffee){ // morningCoffee = true값이 이미 true여서 생략 가능
				System.out.println("아이스 아메리카노 (디카페인) +1");
			  }
			System.out.println("커피 주문 완료 #3-1");	
			
//		  <사례4-2>
//		  오후 2시 이후이거나 모닝 커피를 마신 경우? 디카페인을 마실 예정
			hour =15;
			morningCoffee = false; //모닝커피 마신 유무
			//if (hour >= 14 || morningCoffee == false){
			if (hour >= 14 || morningCoffee){ // morningCoffee = false값이 이미 false여서 생략 가능
				System.out.println("아이스 아메리카노 (디카페인) +1");
			  }
			System.out.println("커피 주문 완료 #3-2");		 
	}
	

}

