package org.apache.dubbo.demo.test;

import org.apache.dubbo.common.extension.AdaptiveClassCodeGenerator;
import org.apache.dubbo.rpc.ProxyFactory;

/**
 * @Author: ggox
 * @Date: 2020/9/2 22:17
 * @Description:
 */
public class ProxyFactoryTest {

	public static void main(String[] args) {
		String code = new AdaptiveClassCodeGenerator(ProxyFactory.class, "javassist").generate();
		System.out.println(code);
	}

}
