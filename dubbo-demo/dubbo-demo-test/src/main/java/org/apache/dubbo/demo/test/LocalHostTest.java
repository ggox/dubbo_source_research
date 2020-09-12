package org.apache.dubbo.demo.test;

import org.apache.dubbo.common.utils.NetUtils;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @Author: ggox
 * @Date: 2020/9/6 02:48
 * @Description:
 */
public class LocalHostTest {

	public static void main(String[] args) throws IOException {
		System.out.println(NetUtils.getLocalHost());
		Socket socket = new Socket();
		InetSocketAddress inetSocketAddress = new InetSocketAddress("www.baidu.com", 80);
		socket.connect(inetSocketAddress, 3000);
		String hostAddress = socket.getLocalAddress().getHostAddress();
		System.out.println(hostAddress);
		socket.close();
	}

}
