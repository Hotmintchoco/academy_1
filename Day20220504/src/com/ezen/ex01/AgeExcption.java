package com.ezen.ex01;

public class AgeExcption {

	public static void main(String[] args) {
		int a = 100;
		int b;
		
		try {
			b = a/10;
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행");
		}
	}
	
	static void method1(){
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}

}
