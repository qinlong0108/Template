package cn.qinlong.demo01;

/*
 * ���ģʽ֮ģ�����ģʽ(������)
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
		System.out.println(time +"����");
	}

	public abstract void code();
		
}
