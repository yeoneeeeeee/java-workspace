package com.kh.Collection.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.Collection.practice.list.music.model.vo.Music;

public class MusicController {

	// ArrayList 객체 생성

	private List<Music> list = new ArrayList();

	public int addList(Music music) {
		int result = 0;
		try {
			list.add(music);
			result = 1;
		} catch (Exception e) {
		}
		return result;
		// 마지막 리스트에 객체 저장, 1 리턴
	}

	public int addAtZero(Music music) {
		int result=0;
		try {
			list.add(0,music);
			return 1;
		} catch (Exception e) {
		}
		return 1;
		// 첫 번째 리스트에 객체 저장, 1 리턴
	}

	public List printAll() {
		return list;
		// List 반환
	}

	public Music searchMusic(String title) {
		Music m = null;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				m=list.get(i);
			}
		}
		return m;
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 리턴, 없으면 null 리턴
	}

	public Music removeMusic(String title) {
		Music m = null;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				m=list.remove(i);
				break;
			}
		}
		return m;
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
	}

	public Music setMusic(String title, Music music) {
		Music m = null;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				m=list.get(i);
				list.set(i,music);
			}
		}
		return m;
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴
	}

	public int ascTitle() {
		Collections.sort(list,new AscTitle());
		return 1;
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
	}

	public int descSinger() {
		Collections.sort(list);
		return 1;
		// 리스트 가수 명 내림차순 정렬, 1 리턴
	}

}
