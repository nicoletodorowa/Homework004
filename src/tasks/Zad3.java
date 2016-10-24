package tasks;


public class Zad3 {

	public static void main(String[] args) {
//		Напишете програма, която създава масив с 10 елемента от 
//		целочислен тип и инициализира елементите със стойност 
//		индекса  умножен по 10
		
		int[] arr = new int [10];
		for (int i = 0; i < arr.length; i++){
			arr [i] = i*10; 
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
