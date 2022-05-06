package com.ezen.ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("예외메시지 : " + ae.getMessage());
		}
		System.out.println(6);
	}

}
