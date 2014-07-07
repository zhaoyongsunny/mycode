package com.codeboy.myproblem;

/***
 * "This is interview   question" -> "question   interview is this" multiple
 * space!
 * 
 * @author zhaoyong
 * 
 */
public class SentenceReverse {
	public static String simpleRevers(String input) {
		if (input != null) {
			char array[] = input.toCharArray();
			// O(n)
			revertCharArray(array, 0, array.length - 1);
		 
			int start =0;
			int end = 0;
			while (end < array.length) {
				end++;
				if(end>start&&(end == array.length||array[end]==' ')){
					revertCharArray(array, start, end-1);
					start=end+1;
					end = end+1;
					continue;
				}
				
				if(array[start]==' '){
					start++;
				}
				 
				
			}
			return String.valueOf(array) ;
		} else {
			return null;
		}
	}

	private static void revertCharArray(char[] array, int start, int end) {
		//System.out.print(":start =" +start+" end = "+end+": "); 
		if(end-start>0){
			for (int i = 0; i < (end - start + 1) / 2; i++) {
				char temp = array[start+i];
				array[start+i] = array[end - i];
				array[end- i] = temp;
			}
		}
	//System.out.println(array); 
	}

	public static String stringArrayRevers(String input) {
		if (input != null) {
			String array[] = input.split(" ");
			StringBuffer sb = new StringBuffer();
			for (int i = array.length - 1; i > -1; i--) {
				sb.append(array[i]).append(" ");
			}
			sb.deleteCharAt(sb.length() - 1);
			return sb.toString();
		} else {
			return input;

		}
	}

	public static void main(String args[]) {
		// String array[] = "this is   a      test".split(" ");
		// for(String value :array){
		// System.out.println("'"+value+"'");
		// }
		String str = "this is   a      test";
		System.out.println(stringArrayRevers(str));
		System.out.println(simpleRevers(str));
	}
}
