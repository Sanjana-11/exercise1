package ex01;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Browser{
	private static String[] array;
	List<String> list1 = new ArrayList();
			
	Browser(){
		
	}
	
	Browser(String[] arr){
		this.array = arr;
	}
	
//	void test() {
//		for (int i=0;i<4;i++)
//		{
//			System.out.println(a[i]);
//		}
//	}
	
	void setArray(String[] arr) {
		this.array = arr;
	}
	
	String[] getArray() {
		return array;
	}
	
	void add(List<String> list, String str) {
		list1.addAll(list);
		list1.add(str);
		System.out.println(list1);
	}
	
}
	
class Main{

	public static void main(String[] args) {
		String[] arr = new String[4];
		String[] getmozilla = new String[4];
		String[] getchrome = new String[4];
		
		for (int i=0; i<4; i++)
		{
			Scanner s = new Scanner(System.in);
			arr[i] = s.nextLine();
		}
//		for (int i=0; i<4; i++)
//		{
//			Scanner s = new Scanner(System.in);
//	
//		}
		
		
		Browser chrome = new Browser();
		Browser mozilla = new Browser(arr);
//		Browser chrome = new Browser(arrnew);

//		mozilla.test();
		
		mozilla.setArray(arr);
		getmozilla = mozilla.getArray();
		
//		chrome.setArray(arr);
//		getchrome = chrome.getArray();
		
		for (int i=0; i<4; i++) {
			System.out.println(getmozilla[i]);
		}
		
		List<String> list = Arrays.asList(arr);   
		
		Scanner s = new Scanner(System.in); 
		String str= s.nextLine();
		
	    mozilla.add(list, str);

		
 	}
}