package thread;

public class ThreadEx01 {
public static void main(String[] args) {
	//for (int i =1; i<10; i++) {
	//	System.out.println(i);
	//}
          new	DigitThread ().start();

	for (int c ='a'; c<= 'z'; c++) {
		System.out.println(c);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}

}