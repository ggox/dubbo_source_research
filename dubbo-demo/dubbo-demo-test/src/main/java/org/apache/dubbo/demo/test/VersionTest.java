package org.apache.dubbo.demo.test;

/**
 * @Author: ggox
 * @Date: 2020/9/6 02:19
 * @Description:
 */
public class VersionTest {

	public static void main(String[] args) {
		Package aPackage = VersionTest.class.getPackage();
		System.out.println(aPackage.getImplementationVersion());
		System.out.println(aPackage.getSpecificationVersion());
	}

}
