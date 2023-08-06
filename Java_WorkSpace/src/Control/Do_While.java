package Control;

public class Do_While {

	public static void main(String[] args) {
		// 반복문 DoWhile
		int distance = 25; // 전체거리 25m
		int move = 0; // 현재이동거리 0m
		int height = 2; // 키가 2m

		while(move + height < distance){
			System.out.println("발차기를 계속 합니다.");
			System.out.println("현재 이동 거리 : " + move);
			move += 3; // 3m 이동
		   }
		  System.out.println("도착하였습니다");

		  System.out.println("------반복문 #1------");

		// 키가 엄청나게 큰 사람?
		 move = 0;
		 height = 25; // 키가 25m
		 while(move < distance){	// 현재 이동거리가 전체거리보다 작다는 조건이 참인 동안 반복 수행
		     System.out.println("발차기를 계속 합니다.");
		     System.out.println("현재 이동 거리 : " + move);
		     move += 3; // 3미터 이동
		     }
		     System.out.println("도착하였습니다");
		// distance값과 move값이 같아서 반복문 "한번도 실행되지 않음"
		     
		System.out.println("------반복문 #2------");
		
		
		
		// Do While 반복문
/*		do {

		} while (조건);
*/
		
		do {
			System.out.println("발차기를 계속 합니다.");
		    System.out.println("현재 이동 거리 : " + move);
			move += 3; // 3미터 이동
		} while (move + height < distance);
		System.out.println("도착했습니다.");
		// 반복문이 "한번은 실행되었음" 
   }
}