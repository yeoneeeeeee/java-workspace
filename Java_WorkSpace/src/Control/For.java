package Control;

public class For {

	public static void main(String[] args) {
//		반복문 For
		
		// 츄 매장 방문
		System.out.println("어서오세요. 츄입니다.");
		// 또 다른 손님들이 들어오면 인사반복
		System.out.println("어서오세요. 츄입니다.");
		System.out.println("어서오세요. 츄입니다.");
		System.out.println("어서오세요. 츄입니다.");
		System.out.println("어서오세요. 츄입니다.");
		System.out.println("어서오세요. 츄입니다.");
		// 만약에 인사 법이 바뀌면?
		System.out.println("환영합니다. 츄입니다.");
		System.out.println("환영합니다. 츄입니다.");
		System.out.println("환영합니다. 츄입니다.");
		//alt누르고 수정할부분(츄)만 블럭 드래그 한 뒤 한 번에 고칠 수 있다.

		// 매장 이름이 바뀌면?
		// 츄 - 슈
		System.out.println("환영합니다. 슈입니다.");
		System.out.println("환영합니다. 슈입니다.");
		System.out.println("환영합니다. 슈입니다.");

		// 반복문 For 사용
/*		for ( 선언; 조건; 증감 ) {
			...수행 명령...
		}
*/
		
		for ( int i=0; i<10; i++ ) {
			//System.out.println("어서오세요. 츄입니다." + i);
			//System.out.println("환영합니다. 츄입니다." + i);
			System.out.println("환영합니다. 슈입니다." + i);
		}
	
		
		// 짝수만 출력
		// 0, 2, 4, 6, 8
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		System.out.println(); // 줄바꿈 역할
		
		// 홀수만 출력
		// 1, 3, 5, 7, 9
		for(int i = 1; i < 10; i += 2) {
			System.out.print(i);
		}
		
		System.out.println(); // 줄바꿈 역할

		// 거꾸로 숫자 
		// 5, 4, 3, 2, 1
		for(int i = 5; i > 0; i--) {
			System.out.print(i);
		}
			
		System.out.println(); // 줄바꿈 역할
		
		// 1부터 10까지의 수들의 합
		// 1 + 2 + ... + 10 = 55
		int sum = 0; // sum 초기화
		for (int i = 1; i <= 10; i++) { // i < 11도 가능
			sum += i;
			System.out.println("현재까지 총합은 " + sum + "입니다.");
		}
		System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
	}	
}