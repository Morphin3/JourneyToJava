package com.taoism.journeytojava.datatype;

import java.io.Console;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by chenfei on 14-11-10.
 * <p/>
 * Scanner & Console
 */
public class InputTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name?");
		String name = scanner.nextLine();

		System.out.print("How old are you?");
		int age = scanner.nextInt();

		System.out.println("Hello," + name + ". Next year,you'll be " + (age + 1));


		Console console = System.console();
		if (console == null) {
			System.out.println("不能使用控制台");
		} else {
			String username = console.readLine("User name:");
			char[] password = console.readPassword("Password:");
		}

	}

}
