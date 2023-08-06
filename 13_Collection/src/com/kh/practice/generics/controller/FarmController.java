package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {
	// 마트에서 농산물 저장용 HashMap 객체 생성(hMap)
	// 고객이 구매한 농산물 저장용 ArrayList 객체 생성(list)
	
	private HashMap<Farm, Integer> hMap = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount){
		if(hMap.get(f)==null){
			hMap.put(f,amount);
			return true;
		}
		return false;
		}
	// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때
	// f와 amount를 각각 키와 값으로 저장 후 true 반환, 존재할 경우 false 반환.
	
	public boolean removeKind(Farm f){
		if(hMap.get(f)!=null) {
			hMap.remove(f);
			return true;
		}
		return false;
	// 전달 받은 f가 hMap 안에 key로 존재할 때 hMap에 f 삭제 후 true 반환
	// 존재하지 않을 경우 false 반환
	}
	
	public boolean changeAmount(Farm f, int amount){
		if(hMap.get(f)!=null) {
			hMap.replace(f,amount);
			return true;
		}
		return false;
	// 전달 받은 f가 hMap 안에 key로 존재할 때 f와 amount 저장 후 true 반환
	// 존재하지 않을 경우 false 반환
	}
	
	public HashMap<Farm, Integer> printFarm() {
		return hMap;
		// 농산물 데이터가 들어가있는 컬렉션 반환
	}
	
	public boolean buyFarm(Farm f){
	// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 0개 이상일 때
	// list에 f 추가, 그리고 hMap에 f의 수량 1 감소 후 true 반환
	// 존재하지 않으면 false 반환
		if(hMap.get(f)!=null && hMap.get(f)>0) {
			list.add(f);
			hMap.replace(f, hMap.get(f) - 1);
			return true;
		}
		return false;
	}
	
	public boolean removeFarm(Farm f){
	// 전달 받은 f가 list에 존재할 때 list에 f 삭제, 그리고 hMap에 f 수량 1 증가
	// 위 경우일 때 true 반환, 아니면 false 반환
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).equals(f))
			list.remove(i);
			hMap.replace(f, hMap.get(f)+1);
			return true;
		}
		return false;
	}
	
	public ArrayList<Farm> printBuyFarm(){
		return list;
	// 농산물 구매 데이터가 들어가있는 컬렉션 반환
	}
}
