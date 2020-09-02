package org.apache.dubbo.demo.test;

import sun.misc.ProxyGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author: ggox
 * @Date: 2020/9/2 23:54
 * @Description:
 */
public class JdkProxyTest {

	interface ProxyInterface{
		// 待代理方法
		void test();
	}

	public static void main(String[] args) {
		byte[] bytes = ProxyGenerator.generateProxyClass("org.apache.dubbo.demo.test.ProxyInterface$Proxy0", new Class[] { ProxyInterface.class });
		try {
			Files.write(Paths.get("/Users/ggox/Desktop/test.class"), bytes);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
