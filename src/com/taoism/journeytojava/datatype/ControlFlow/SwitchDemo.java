package com.taoism.journeytojava.datatype.ControlFlow;

/**
 * Created by chenfei on 14-11-12.
 */
public class SwitchDemo {
	enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

	public static void main(String[] args) {
		Size size = Size.EXTRA_LARGE;
		switch (size) {
			case SMALL:
				System.out.println("选的尺码为" + Size.SMALL);
				break;
			case MEDIUM:
				System.out.println("选的尺码为" + Size.MEDIUM);
				break;
			case LARGE:
				System.out.println("选的尺码为" + Size.LARGE);
				break;
			case EXTRA_LARGE:
				System.out.println("选的尺码为" + Size.EXTRA_LARGE);
				break;
			default:
				System.out.println("没有所选的尺码");
		}
	}


}
