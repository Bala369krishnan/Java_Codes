package java_program_2;

import java.util.ArrayList;
import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(new ArrayList<Integer>(Arrays.asList(11, 2, 4)));
		arr.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
		arr.add(new ArrayList<Integer>(Arrays.asList(10, 8, -12)));
		
		int leadingDiagonal = 0;
		int antiDiagonal = 0;
		int size = arr.size();
		
		for(int i =0 ; i < size ; i++) {
			leadingDiagonal += arr.get(i).get(i);
			antiDiagonal += arr.get(i).get(size - i -1);
		}
		
		System.out.println(arr);
		
		System.out.println(leadingDiagonal);
		System.out.println(antiDiagonal);
		
		int absoluteValue = Math.abs(leadingDiagonal-antiDiagonal);
		
		System.out.println(absoluteValue);
	}
}
