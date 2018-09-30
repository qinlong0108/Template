package cn.qinlong.demo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//≤‚ ‘
public class TemplateDemo {
	public static void main(String[] args) {
//		new Template() {
//			@Override
//			public void code() {
//				for (int x = 0; x < 1000; x++) {
//					System.out.println(x);
//				}
//			}
//		}.getTime();

		new Template() {
			public void code() {
				try {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.avi"));//∂¡
			
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.avi"));//–¥
			
			byte[] bys = new byte[1024];
			int len = 0;
			while((len = bis.read(bys))!=-1) {
				bos.write(bys, 0, len);
			}
			bos.close();
			bis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}.getTime();
	}
}
