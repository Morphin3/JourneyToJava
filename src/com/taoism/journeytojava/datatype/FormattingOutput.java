package com.taoism.journeytojava.datatype;

import java.util.Date;

/**
 * Created by chenfei on 14-11-11.
 */
public class FormattingOutput {
	public static void main(String[] args){

		String name="陶喆";
		int age=40;

		double x=10000.0/3.0;
		System.out.print(x);

		System.out.printf("%8.2f",x);

		System.out.printf("Hello,%s.Next year,you'll be %d",name,age);

		System.out.printf("%d\n", 33);    //十进制整数
		System.out.printf("%x\n", 0x9f);        //十六进制整数
		System.out.printf("%o\n", 0237);        //八进制整数
		System.out.printf("%f\n", 15.9);        //定点浮点数
		System.out.printf("%e\n", 1.59e+01);  //指数浮点数
//		System.out.printf("%g\n","");				//通用浮点数
		System.out.printf("%a\n", 0x1.fccdp3);    //十六进制浮点数
		System.out.printf("%s\n", "Hello");    //字符串
		System.out.printf("%c\n", 'F');            //字符
		System.out.printf("%b\n", true);            //布尔
		System.out.printf("%h\n", "42628b2");    //散列码
		System.out.printf("%tc\n",new Date());   // 日期时间
		System.out.printf("%%\n", "");			//百分号
		System.out.printf("%n","");
		System.out.printf("%,(.2f\n", -10000000000.0 / 3.0);
		System.out.printf("% .2f\n",100000000.0/3.0);
		System.out.printf("%+.2f\n",10000/3.0);
//		System.out.printf("%_.2f",10000/3.0);
		System.out.printf("%#.2f\n",10000/3.0);
		System.out.printf("%1$d %2$x\n",223,123);
//		System.out.printf("%d%<x\n",159);
//
//		String message=String.format("Hello,%s.Next year,you'll be %d",name,age);
//
//		System.out.println(message);


		System.out.printf("%tz\n",new Date());

		System.out.printf("%1$s %2$tB %2$te,%2$tY\n","Due date:",new Date());
		System.out.printf("%s %tB %<te,%<tY\n","Due date:",new Date());
	}
}
