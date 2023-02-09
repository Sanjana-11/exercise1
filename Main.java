package ex01;
import java.util.Scanner;

class Browser{
	private static String[] array;
//	static String[] arraynew;
			
	Browser(){
		
	}
	
	Browser(String[] arr){
		this.array = arr;
//		this.arraynew = arr;
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
	
	
	
}
	
class Main{

	public static void main(String[] args) {
		String[] arr = new String[4];
//		String[] arrnew = new String[4];
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
//		for (int i=0; i<4; i++) {
//			System.out.println(getchrome[i]);
//		}
//		
//		for(int i = 0; i<4; i++)
//		{
//			System.out.println(Browser.arraynew);
//		}
	
		
 	}
}