package Control;

public class While {

	public static void main(String[] args) {
		// 반복문 While
		
/*		while(조건){

		}
*/
		
//		<사례1>
		// 수영장에서 수영을 하는 모습

		int distance = 25; // 전체 거리 25m
		int move = 0; // 현재 이동 거리 0m

		   while(move < distance){	// 현재 이동거리가 전체거리보다 작다는 조건이 참인 동안 반복 수행
			   System.out.println("발차기를 계속 합니다.");
			   System.out.println("현재 이동 거리 : " + move);
			   move += 3; // 3미터 이동
		   }
		   System.out.println("도착하였습니다.");
		  
/*		=> 발차기를 계속 합니다.
		   현재 이동 거리 : 0
		     발차기를 계속 합니다.
		     현재 이동 거리 : 3
			.
			.
			.
		   발차기를 계속 합니다.     
		     현재 이동 거리 : 24	// 24+3은 27로 move가 distance(25)보다 커지므로 조건문을 만족시키지 않아 while 문을 빠져나옴
		     도착하였습니다. */
	
	
//	<사례2>
	// 무한 루트
	move = 0;

	while(move < distance){	// 현재 이동거리가 전체거리보다 작다는 조건이 참인 동안 반복 수행
		   System.out.println("발차기를 계속 합니다.");
		   System.out.println("현재 이동 거리 : " + move);
	   }
	   System.out.println("도착하였습니다.");
	}
}