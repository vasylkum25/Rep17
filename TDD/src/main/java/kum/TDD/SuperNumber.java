package kum.TDD;


import java.util.ArrayList;
import java.util.List;

public class SuperNumber {

	private int number;
	
	public SuperNumber(int number) {
		this.number = number;
		if(number<=0){
			throw new IllegalArgumentException("Number is minus");
		}
	}

	public boolean toDivide(int i) {
		return number%i==0;
	}

	public int[] arraySimpl(){
		List<Integer> lists = new ArrayList<>();
		for(int i = 1 ; i<=number ; i++){
			if(toDivide(i)){
				lists.add(i);
			}
		}
		int i=0;
		int[] array = new int[lists.size()];
		for (Integer list : lists) {
			array[i++]=list;
		}
		
		return array;
	}

}
