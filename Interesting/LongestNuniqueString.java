package com.saiyan.algorithms;


import java.util.LinkedList;

public class LongestNuniqueString {



	public static void main(String[] args) {

		String str="aaabbbbbbbcccccccccccddddeeeefffffff";
		findLongestString(str,3);
	}

	private static void findLongestString(String str,int n) {

		//char[] unique = new char[n]; 
		int i=0;
		int size=0;
		LinkedList<Character> al = new LinkedList<Character>();
		StringBuilder sbulider = new StringBuilder();
		char ch;
		int maxSize=0;
		String maxString="";
		boolean found=false;

		for(;;){
			if(i>= str.length()){
				break;
			}
			if(found){
				if (size> maxSize){
					maxString = sbulider.toString();
					maxSize= size;
				}
				found=false;
				size=size-sizeRemoved(sbulider,al.get(0));
				sbulider=remove(sbulider,al.get(0));
				al.remove(0);
				System.out.println("al size "+ al.size());

			}
			else {
				ch=str.charAt(i);
				System.out.println(ch);
				if(al.contains(ch)){

					size++;
					sbulider.append(ch);
					if (size> maxSize){
						maxString = sbulider.toString();
						//	System.out.println("Changing : "+ maxString);
						maxSize= size;
					}

				}
				else{
					if(al.size()==n){
						found=true;
						continue;
					}
					al.add(ch);
					sbulider.append(ch);
					size++;
				}

				i++;

			}
		}
		System.out.println("Found: "+ maxString);
	}

	private static StringBuilder remove(StringBuilder sbulider, Character character) {

		while(sbulider.charAt(0) == character) {
			//		System.out.println("Removed "+sbulider.charAt(0));
			sbulider.deleteCharAt(0);
		}
		//	System.out.println("String"+ sbulider);
		return sbulider;

	}
	private static int sizeRemoved(StringBuilder sbulider, Character character) {

		int i=0;
		while(sbulider.charAt(i) == character) {
			i++;		
		}
		//	System.out.println("String"+ sbulider);
		return i;

	}

}