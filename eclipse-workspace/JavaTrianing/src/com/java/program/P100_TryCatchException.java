package com.java.program;

public class P100_TryCatchException {
	public void tryCatchException() {
		try {
			int Number = 23;
			System.out.println("try Statement Blocks");
			System.out.println(Number);
		} catch (ArithmeticException a) {// child exception
			System.out.println(a.getClass());
		} catch (Exception a) { // parent Exception it should be in last Catch
			System.out.println(a.getMessage());

		} finally {
			System.out.println("Try Block ");
		}
	}

	public static void main(String[] args) {

		P100_TryCatchException obj = new P100_TryCatchException();
		obj.tryCatchException();
	}
}
