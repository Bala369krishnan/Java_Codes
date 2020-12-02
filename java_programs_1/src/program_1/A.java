package program_1;
import java.util.ArrayList;
public class A {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(17);
		arr1.add(28);
		arr1.add(30);
	
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(99);
		arr2.add(16);
		arr2.add(8);
		
		int alice  = 0;
		int bob = 0;
		for(int i=0 ; i<arr1.size();i++) {
			if(arr1.get(i)>arr2.get(i)) {
				alice = alice + 1;
			}else if (arr1.get(i)<arr2.get(i)) {
				bob = bob + 1;
			}else {
				
			}
		}	
		ArrayList<Integer> answer = new ArrayList<Integer>();
		answer.add(alice);
		answer.add(bob);	
		System.out.println(answer);

	}
}
