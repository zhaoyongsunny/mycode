package com.codeboy.myproblem;

/**
 * from 0 to 100 ,101 number have a missing in an 100 long array the array is
 * sorted, find the number continously sorted array Solution 1: Go through the
 * array if the next one is bigger than current one+1, the missing one is
 * current +1 The performance would be O(n) Solution2: BinearySearch, the
 * performance is O(log n)
 * */
public class Find_MIssing_Number_in_Sorted_Array {

	public static int findMissingNumber(int[] array) {
		int found = Integer.MIN_VALUE;
		if (array != null && array.length > 1) {

		    int left = 0;
		    int right = array.length - 1;
		    while(left<=right){
			    int middle = (right + left) /2 ;
			    int realMiddleValue = array[middle];
 
		        if(realMiddleValue != middle){
		            if(middle == 0 || 
		            		array[middle - 1] == middle - 1){
		                return middle;
		            }
		            right = middle - 1;
		        }
		        else{
		        	if (middle + 1 > array.length-1) {// last one
						return array[array.length - 1] + 1;
					} else {
						left = middle+1 ;
					}
		        }
		    }
		    

		}
	 
		return found;
	}

	public static int findMissingNumberRecursive(int[] array) {
		return findMissingNumber(array, 0, array.length - 1);
	}

	private static int findMissingNumber(int[] array, int startIndex,
			int endIndex) {
		int found = Integer.MIN_VALUE;
		if (array != null && array.length > 1) {

			//always add 1 because we have n+1 number
			int middleIndex = (startIndex+endIndex+1) / 2;
			int realMiddleValue = array[middleIndex];
			int expectedMiddleValue = array[startIndex] / 2 + array[endIndex] / 2;

			if (realMiddleValue == expectedMiddleValue) { // in right half

				if (middleIndex + 1 > endIndex) {// last one
					return array[array.length - 1] + 1;
				} else {
					return findMissingNumber(array, middleIndex , endIndex);
				}
				
			} else { // in left half
				
				if (middleIndex - 1 <0) {
					return array[0] - 1;// first one
				} else if (array[middleIndex - 1] == expectedMiddleValue - 1) {
					return expectedMiddleValue;
				} else {
					return findMissingNumber(array, startIndex, middleIndex - 1);
				}

			}

		}
		// 0 1 2 3 4 5 ->0 2 3 4 5
		// ->0 1 2 3 4
		// ->1 2 3 4 5
		return found;
	}

	public static void main(String args[]) {
		System.out.println(5 / 2);
	}
}
