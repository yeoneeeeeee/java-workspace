package Control;

public class Break {

	public static void main(String[] args) {
		// Break
		// 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
		// 손님이 50명 대기
		
		// For문
		int max = 20;
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
			if(i == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
		}
		System.out.println("영업을 종료합니다.");
		
		System.out.println("----------------------------------");
		
		// While문
		int index = 1; // 손님대기번호
		while (index <= 50) {
			System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
			if (index == max) {
				System.out.println("금일 재료가 모두 소진되었습니다.");
				break;
			}
			index++;
		}
		System.out.println("영업을 종료합니다.");
	}
}
