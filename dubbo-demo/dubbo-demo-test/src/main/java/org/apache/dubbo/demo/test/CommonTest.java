package org.apache.dubbo.demo.test;

import java.util.Arrays;

/**
 * @Author: ggox
 * @Date: 2020/9/6 03:34
 * @Description:
 */
public class CommonTest {

	public static void main(String[] args) {
		testMethodParameter("test");
	}

	static void testMethodParameter(String name, int... nums) {
		System.out.println(Arrays.toString(nums));
	}

}
