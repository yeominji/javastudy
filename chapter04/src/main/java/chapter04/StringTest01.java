package chapter04;

public class StringTest01 {

	public static void main(String[] args) {
		// c:\temp
		System.out.println("c:\\temp");

		// "hello"
		System.out.println("\"hello\"");
		
		// \t : tab
		// \r : carriage return
		// \n : newline
		// \b : beep
		// 유닉스는 \r\n이 개행
		
		System.out.print("hello\tworld\n");
		System.out.println("hello\tworld");
		
		// '
		char c = '\'';
		System.out.println(c);
	}

}
