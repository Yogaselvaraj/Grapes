package org.proj;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am learning learning java java java programming";
		String[] arr = s.split(" ");
		int count;
		
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i].equals(arr[j])) {
				count++;
				arr[j]="0";
			}
		}
			System.out.println("the word"+arr[i]+" : "+count+" times");
		}
		
		
	}

	}

