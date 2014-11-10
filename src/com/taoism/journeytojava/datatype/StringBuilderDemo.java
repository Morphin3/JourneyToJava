package com.taoism.journeytojava.datatype;

/**
 * Created by chenfei on 14-11-10.
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();

		StringBuffer stringBuffer = new StringBuffer();


		stringBuilder.append("StringBuilder");
		stringBuilder.append("测试");
		stringBuilder.append('哈');
		System.out.println(stringBuilder.toString());

		stringBuilder.insert(6,"强势插入");
		System.out.println(stringBuilder.toString());

		stringBuilder.delete(6,10);
		System.out.println(stringBuilder.toString());


		stringBuffer.append("StringBuffer");
		stringBuffer.append("测试");
		stringBuffer.append('哈');
		System.out.println(stringBuffer.toString());


	}
}
