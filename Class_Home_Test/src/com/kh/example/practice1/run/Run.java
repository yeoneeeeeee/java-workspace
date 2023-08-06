package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Person;

public class Run {

	private static Object printName;

	public static void main(String[] args) {

		// Person이라는 클래스 == 나만의 자료형(여러개의 자료형의 여러개의 값들을 보관) == 사용자 정의 자료형

		Person p = new Person();
		System.out.println(p);

		p.setMemberId("id");
		p.setMemberPwd("password");
		p.setMemberName("소연");

		System.out.println(p);

	}

}
