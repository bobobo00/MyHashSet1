package cn.test.mycollection;

import java.util.HashMap;

/**
 * 自定义实现hashset;
 * @author dell
 *
 */

public class MyHashSet {
	HashMap map;
	private static final Object PRESENT=new Object();
	public MyHashSet() {
		map=new HashMap();
	}
	public void add(Object o) {
		map.put(o, PRESENT);
	}
	public int size() {
		return map.size();
	}
	public String toString() {
		return map.keySet().toString();
	}
	
	public static void main(String[] args) {
		MyHashSet ms=new MyHashSet();
		ms.add(1);
		ms.add(2);
		ms.add(3);
		ms.add(4);
		ms.add(1);
		System.out.println(ms);
		System.out.println(ms.size());
		
		
	}

}
