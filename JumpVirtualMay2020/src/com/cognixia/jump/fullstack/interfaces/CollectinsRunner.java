package com.cognixia.jump.fullstack.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectinsRunner {

	public static void main(String[] args) {
		
		// Wrapper Classes
		int i = 1;          Integer I = i;
		double d = 2.0;     Double D = d;
		boolean b = true;   Boolean B = b; 
		char c = '3';       Character C = c;
		
		
		int j = Integer.valueOf(c).intValue();
		
		// List
		List<Animal> animalList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
		animalList.add(new WolfHybrid());
		animalList.add(new Elephants());
		animalList.add(new Elephants());
		
		Integer[] ints = {2,4,6,8,10,2,14,2,18,2};
		
		intList = Arrays.asList(ints);
		System.out.println(intList);
		List<Animal> animlLL = new LinkedList<>(animalList);
		
		// Set = unordered list/ no duplicates
		Set<Animal> animalSet = new HashSet<>(animalList);
		// this is how you remove duplicates
		Set<Integer> intsSet = new HashSet<>(intList);
		System.out.println(intsSet);
		// Queu
		Queue<Animal> animalQ = new LinkedList<>();	
		animalQ.stream();
		
		// Deque
		Deque<Animal> animalDq = new LinkedList<>();
		
		// Map
		Map<Integer, String> map = new HashMap<>();
		
		List<Integer> mapList = new ArrayList<>(map.keySet());
		
////		for (Integer integer: mapList) {
////			
//////			if (map.containsKey(4)) {
//////				map.remove(key, value);
////			}
//		}
	
	 // how arry list list works
		ArrayList<Integer> aL = new ArrayList<>(5);
		// al.add * 10 fill my starting array
		// i go to add the 11th item, but out of space ( don't worry)
		// a 2nd array is created, at 50% increased size (size = 15)
		// the items of the old array are copied over the same order
		// now i can fill items 12 - 15 without resizing and then
		// at 15, i repeat the 50% growth process, and this keeps repeating
		aL.add(9,9);
	}

}
