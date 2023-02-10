package ex01;
import java.util.Scanner;

class Browser{
	private static String[] array;
			
	Browser(){
		
	}
	
	Browser(String[] arr){
		this.array = arr;
	}
	
	
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
		String[] getmozilla = new String[4];
//		String[] getchrome = new String[4];
		
		for (int i=0; i<4; i++)
		{
			Scanner s = new Scanner(System.in);
			arr[i] = s.nextLine();
		}
		
		
		Browser chrome = new Browser();
		Browser mozilla = new Browser(arr);
		
		
		
		
		mozilla.setArray(arr);
		getmozilla = mozilla.getArray();
		

//		for (int i=0; i<4; i++) {
//					System.out.println(arr[i]);
//		}
		
		for (int i=0; i<4; i++) {
			System.out.println(getmozilla[i]);
		}

	
		
 	}
}