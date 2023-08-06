package com.kh.practice.generics.view;

import java.util.Scanner;


import com.kh.practice.generics.controller.FarmController;

public class FarmMenu {
	// FarmController 객체 생성
	// Scanner 객체
	private Scanner sc = new Scanner(System.in);
	private FarmController fc = new FarmController();
	
	public void FarmMenu(){
	System.out.println("========== KH 마트 ==========");
}
	
	public void mainMenu() {
	
	while(true) {
	System.out.println("******* 메인 메뉴 *******");
	System.out.println("1. 직원메뉴"); // adminMenu() 실행
	System.out.println("2. 손님 메뉴"); // customerMenu()
	System.out.println("9. 종료");  // “프로그램 종료.” 출력 후 main()으로 리턴
	System.out.print("메뉴 번호 선택 : "); // 메뉴 화면 반복 실행 처리
	int num = sc.nextInt();
	sc.nextLine();
	// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
	switch(num) {
	case 1:adminMenu(); break;
	case 2:customerMenu(); break;
	case 9: System.out.println("프로그램 종료."); return;
		default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); 
		}
	}
}
	
	public void adminMenu() {
	while(true) {
	System.out.println("******* 직원 메뉴 *******");
	System.out.println("1. 새 농산물 추가"); // addNewKind() 실행
	System.out.println("2. 종류 삭제"); // removeKind()
	System.out.println("3. 수량 수정"); // changeAmount()
	System.out.println("4. 농산물 목록"); // printFarm()
	System.out.println("9. 메인으로 돌아가기"); // mainMenu()로 리턴
	System.out.print("메뉴 번호 선택 : "); // 메뉴 화면 반복 실행 처리
	int num = sc.nextInt();
	sc.nextLine();
	// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
	switch(num) {
	case 1:addNewKind(); break;
	case 2:removeKind(); break;
	case 3:changeAmount(); break;
	case 4:printFarm(); break;
	case 9:mainMenu(); return;
	default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); 
		}
	}
}
	
	public void customerMenu() {
	while(true) {
		System.out.println("현재 KH마트 농산물 수량");
		printFarm();
		System.out.println("******* 고객 메뉴 *******");
		System.out.println("1. 농산물 사기"); // 
		System.out.println("2. 농산물 빼기"); // 
		System.out.println("3. 구입한 농산물 보기"); // 
		System.out.println("4. 농산물 목록"); // 
		System.out.println("9. 메인으로 돌아가기"); // mainMenu()로 리턴
		System.out.print("메뉴 번호 선택 : "); // 메뉴 화면 반복 실행 처리
		int num = sc.nextInt();
		sc.nextLine();
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		switch(num) {
		case 1:buyFarm(); break;
		case 2:removeFarm(); break;
		case 3:printBuyFarm(); break;
		case 9:mainMenu(); return;
		default: System.out.println("잘못 입력하였습니다. 다시 입력해주세요"); 
			}
		}
	}
	
	// 1-1. 새 농산물 추가용 view 메소드
	public void addNewKind() {
	while(true) {
	System.out.println("1. 과일 / 2. 채소 / 3. 견과");
	System.out.print("추가할 종류 번호 : ");
	int num = sc.nextInt();
	
	System.out.print("이름 : ");
	String name = sc.nextLine();
	
	System.out.print("수량 : ");
	int amount = Integer.parseInt(sc.nextLine());
	
switch(num) {
case1 : Farm b1 = new Fruit("과일",name);
boolean result = 
	
	
	
	
	fc.addNewKind();
	boolean result = fc.addNewKind();
	if(result) {
		System.out.println("새 농산물이 추가되었습니다.");
	}else{
		System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
	}
	System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//	‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 추가 농산물의 이름, 수량도
//	받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//	출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름. 
//	객체 안에 종류와 이름을 저장. 데이터를 저장한 객체와 수량을 fc(FarmController)의
//	addNewKind()로 넘기고 전달 받은 반환 값이 true면 “새 농산물이 추가되었습니다.”,
//	false면 “새 농산물 추가에 실패하였습니다. 다시 입력해주세요.” 출력
	}
}
	// 1-2. 종류 삭제용 view 메소드
	public void removeKind() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			int num = sc.nextInt();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			sc.nextLine();

			fc.removeKind();
			boolean result = fc.removeKind();
			if(result) {
				System.out.println("농산물 삭제에 성공하였습니다.");
			}else {
				System.out.println("농산물 삭제에 실패하였습니다. 다시 입력해주세요.");
			}	
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
//	‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 삭제할 농산물의 이름도
//	받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//	출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름. 
//	객체 안에 종류와 이름을 저장. 데이터를 저장한 객체를 fc의 removeKind()로 넘기고
//	전달받은 반환 값이 true면 “농산물 삭제에 성공하였습니다.”,
//	false면 “새 농산물 추가에 실패하였습니다. 다시 입력해주세요.” 출력
	}
}
	
	// 1-3. 수량 수정용 view 메소드
	public void changeAmount() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			int num = sc.nextInt();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("수정할 수량 : ");
			int amount = sc.nextInt();
			sc.nextLine();

			fc.addNewKind();
			boolean result = fc.addNewKind();
			if(result) {
				System.out.println("새 농산물이 추가되었습니다.");
			}else{
				System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
			}
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
//	‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 수정 농산물의 이름, 
//	수정할 수량도 받음. 없는 번호 선택 시 “잘못 입력하셨습니다. 다시 입력해주세요.”
//	출력 후 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름. 
//	객체 안에 종류와 이름을 저장. 데이터를 저장한 객체와 수량을 fc의
//	changeAmount()로 넘기고 전달 받은 반환 값이 true면
//	“농산물 수량이 수정되었습니다.”,
//	false면 “농산물 수량 수정에 실패하였습니다. 다시 입력해주세요.” 출력
	}
	
	// 1-4. 농산물 목록 출력용 view 메소드
	public void printFarm() {
//	fc의 printFarm()의 반환 값을 이용하여 keySet()을 통해
//	“종류 : 이름(n개)” 형식으로 출력
	}
	// 2-1. 농산물 구매용 view 메소드
	public void buyFarm() {
		while(true) {
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("구매할 종류 번호 : ");
		int num = sc.nextInt();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		sc.nextLine();

		fc.buyFarm();
		boolean result = fc.buyFarm();
		if(result) {
			System.out.println("구매에 성공하였습니다.");
		}else{
			System.out.println("마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.");
		}
	}
}
//	‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 구매할 농산물의 이름도
//	받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//	출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름. 
//	객체 안에 종류와 이름을 저장. 데이터를 저장한 객체를 fc의 buyFarm()로 넘기고
//	전달받은 반환 값이 true면 “구매에 성공하였습니다.”,
//	false면 “마트에 없는 물건이거나 수량이 없습니다. 다시 입력해주세요.” 출력

	// 2-2. 농산물 구매 취소용 view 메소드
	public void removeFarm() {
		while(true) {
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매취소할 종류 번호 : ");
			int num = sc.nextInt();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			sc.nextLine();

			fc.removeFarm();
			boolean result = fc.removeFarm();
			if(result) {
				System.out.println("구매 취소에 성공하였습니다.");
			}else{
				System.out.println("구매 목록에 존재하지 않습니다. 다시 입력해주세요.");
			}
		}
	}	
//	‘1. 과일 / 2. 채소 / 3. 견과’를 통해 번호로 종류를 받고 구매취소할 농산물의 이름도
//	받음. 이때 없는 번호를 선택하면 “잘못 입력하셨습니다. 다시 입력해주세요.”가
//	출력되며 다시 번호를 받고, 선택한 종류에 따라 생성되는 객체가 다름. 
//	객체 안에 종류와 이름을 저장. 데이터 저장한 객체를 fc의 removeFarm()로 넘기고
//	전달받은 반환 값이 true면 “구매 취소에 성공하였습니다.”,
//	false면 “구매매 목록에 존재하지 않습니다. 다시 입력해주세요.” 출력

	// 2-3. 구입한 농산물 출력용 view 메소드
	public void printBuyFarm() {
//	fc의 printBuyFarm()의 반환 값을 이용하여 Iterator를 통해 출력
	}

	
}
