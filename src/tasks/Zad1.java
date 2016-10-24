package tasks;

public class Zad1 {

	public static void main(String[] args) {

//		Напишете програма, която намира сбора на всичките четни елементи в масив.
		
		int arr [] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		int sum = 0;
			for (int i = 0; i < arr.length; i++){
				if (arr[i] % 2 == 0){
					sum += arr[i];
				}
				
			}
			System.out.println(sum);
			
		}
	}
