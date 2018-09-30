package cn.qinlong.demo01;

/*
 * 设计模式之模板设计模式(抽象类)
 * 
 */
public abstract class Template {
	public void getTime() {
		long start = System.currentTimeMillis();
		
//		for (int x = 0; x < 1000; x++) {
//			System.out.println(x);
//		}
		code();
		
		long end = System.currentTimeMillis();
		
		long time = end - start;
		System.out.println(time +"毫秒");
	}

	public abstract void code();
		
}
