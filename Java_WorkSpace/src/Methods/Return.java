package Methods;

public class Return {
	// Return
	
	// 호텔 전화번호
	public static String getPhoneNumber() {
		String phoneNumber = "02-1234-5678";
		return phoneNumber; // 리턴값은 변수 명과 같아야함.
		
	}
			
	// 호텔 주소
	public static String getAddress() {
		return "서울시 어딘가"; // 값을 바로 반환할 수도 있다.
	}
			
	// 호텔 엑티비티
	public static String getActivities() {
		return "볼링장, 탁구장, 노래방";
	}
	
	public static void main(String[] args) {
	// 반환값 Return
	String contactNumber = getPhoneNumber();
	System.out.println("호텔 전화번호 : " + contactNumber);
	
	String address = getAddress();
	System.out.println("호텔 전화번호 : " + address);

	System.out.println("호텔 엑티비치 : " + getActivities()); // 바로 넣을 수도 있다.
	}

}
