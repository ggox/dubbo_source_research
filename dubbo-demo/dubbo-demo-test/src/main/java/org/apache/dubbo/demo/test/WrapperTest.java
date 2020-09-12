package org.apache.dubbo.demo.test;

import org.apache.dubbo.common.bytecode.Wrapper;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author: ggox
 * @Date: 2020/9/6 04:22
 * @Description:
 */
public class WrapperTest {

	static class TestApi{

		public String test() {
			return "Hello World!";
		}
	}

	public static void main(String[] args) throws InvocationTargetException {
		TestApi api = new TestApi();
		Wrapper wrapper = Wrapper.getWrapper(TestApi.class);
		Object test = wrapper.invokeMethod(api, "test", new Class[0], new Object[0]);
		System.out.println(test);
	}

}
