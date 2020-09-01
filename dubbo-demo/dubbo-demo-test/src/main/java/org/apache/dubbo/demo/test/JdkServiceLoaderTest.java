package org.apache.dubbo.demo.test;


import sun.reflect.Reflection;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Author: ggox
 * @Date: 2020/9/1 19:46
 * @Description:
 */
public class JdkServiceLoaderTest {

	public static void main(String[] args) {
		ServiceLoader<Driver> load = ServiceLoader.load(Driver.class);
		Iterator<Driver> iterator = load.iterator();
		while (iterator.hasNext()) {
			Driver driver = iterator.next();
			System.out.println("driver:" + driver.getClass() + ",loader:" + driver.getClass().getClassLoader());
		}
		System.out.println("current thread contextClassloader:" + Thread.currentThread().getContextClassLoader());
		System.out.println("ServiceLoader loader:" + ServiceLoader.class.getClassLoader());
	}

}
