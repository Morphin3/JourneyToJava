package com.taoism.journeytojava.datatype;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by chenfei on 14-11-11.
 */
public class FileInputOutputDemo {
	public static void main(String[] args) {
		try {
//			Scanner scanner = new Scanner(new File("/Users/chenfei/Javaworks/JourneyToJava/myfile.txt"));
			Scanner scanner = new Scanner(new File("myfile.txt"));
			System.out.println(scanner.hasNext());
			int i = 0;
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
				i++;
			}
			System.out.println("行号:" + i);
		} catch (Exception e) {

		}

		String dir = System.getProperty("user.dir");
		System.out.println(dir);

		final char[] arr={'a', 'b', 'c', 'd', 'e' };
		try {
//			PrintWriter printWriter = new PrintWriter(new File("myfile_write.txt"));
			PrintWriter printWriter = new PrintWriter("myfile_write.txt");
			printWriter.print(arr);
			printWriter.print("啦啦啦啦啦啦");
			printWriter.printf("%s", "哈哈哈哈");
			printWriter.println("写入文件啦啦啦");
			printWriter.println("写入文件啦啦啦");
			printWriter.println("写入文件啦啦啦");
			printWriter.println("hahaha");
			printWriter.close();
		} catch (FileNotFoundException e) {

		}

	}
}
