package prob1;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		//
		for(int i=1; i<array.length; i++) {
			for(int j=0; j<array.length-i; j++) {
				if(array[j]<array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					// 인접한 2개의 값들을 비교하교 앞에 있는 값이 더 클경우					
					// swap을 써서 위치를 바꿔준다.					
				}
			}
		}
		
		// 결과 출력
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}		
	}
}