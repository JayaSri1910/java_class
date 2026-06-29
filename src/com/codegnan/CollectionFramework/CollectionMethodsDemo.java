package com.codegnan.CollectionFramework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionMethodsDemo {

	public static void main(String[] args) {
		Collection<String> fruits=new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("Cherry");
		fruits.add("Kiwi");
		fruits.add("Pineapple");
		System.out.println("Fruits after add()" + fruits);
		System.out.println("-----------addAll()-----------");
		Collection<String> moreFruits=new ArrayList<>();
		moreFruits.add("Mango");
		moreFruits.add("Grapes");
		moreFruits.add("Orange");
		moreFruits.add("Papaya");
		fruits.addAll(moreFruits);
		System.out.println("Fruits after addAll()"+fruits);
		System.out.println("---------------remove()--------------");
		fruits.remove("Banana");
		System.out.println("Fruits after remove(Banana)"+fruits);
		Collection <String> removeList=new ArrayList<String>();
		removeList.add("Mango");
		removeList.add("Cherry");
		removeList.add("Papaya");
		fruits.removeAll(removeList);
		System.out.println("Fruits after removeAll(Mango,Cherry,Papaya):"+fruits);
		System.out.println("-----------------retainAll()----------------");
		Collection<String>retainList=new ArrayList<>();
		retainList.add("Apple");
		retainList.add("Grapes");
		retainList.add("Orange");
		fruits.retainAll(retainList);
		System.out.println("Fruits after retainAll()"+fruits);
		System.out.println("------------contain()------------");
		System.out.println("Contains Apple? "+fruits.contains("Apple"));
		System.out.println("------------containsAll()-------------");
		Collection<String>checkList=new ArrayList<>();
		checkList.add("Apples");
		checkList.add("Grapes");
		System.out.println("Contains all(Apple,Grapes)?"+fruits.containsAll(checkList));
		System.out.println("----------size()------------");
		System.out.println("Number of Fruits:"+fruits.size());
		System.out.println("-----------isEmpty()-------------");
		System.out.println("Is Collection Empty?"+fruits.isEmpty());
		System.out.println("----------toArray()------------");
		Object[] fruitArray=fruits.toArray();
		for(int i=0;i<fruitArray.length;i++) {
			System.out.println(fruitArray[i]+" ");
		}
		System.out.println();
		System.out.println("--------iterator()--------------");
		System.out.println("Iterating using iterator");
		Iterator<String> itr=fruits.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		System.out.println("\n\n---------clear()----------");
		fruits.clear();
		System.out.println("Fruits after clear():"+fruits);
		System.out.println("Is collection empty after clear?"+fruits.isEmpty());
		
		}
		
		
		

	}

  
