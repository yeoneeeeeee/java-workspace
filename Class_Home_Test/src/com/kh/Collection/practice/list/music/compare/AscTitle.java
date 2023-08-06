package com.kh.Collection.practice.list.music.compare;

import java.util.Comparator;

import com.kh.Collection.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{
	
	public int compare(Music o1, Music o2) {
		// Title의 내림차순으로 정렬하는 기준을 마련한다.
		int result = o1.getTitle().compareTo(o2.getTitle());
			
		if(result == 0) {
			result = o1.getSinger().compareTo(o2.getSinger());
		}
		return result;
	}
}
