package com.siddhi.exceptionhandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		/*try {
            otherMethod();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		otherMethod2();
	}

	private static void otherMethod2() throws RuntimeException {
		
	}
	private static void otherMethod() throws InterruptedException {
		Thread.sleep(2000);	
	}

}
