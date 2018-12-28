package javalearn.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NIOClient {

	public static void main(String[] args) {
		SocketChannel socketChannel;
		try {
			socketChannel = SocketChannel.open();
			socketChannel.connect(new InetSocketAddress("127.0.0.1", 9999));
			ByteBuffer buf = ByteBuffer.allocate(48);
			int bytesRead = socketChannel.read(buf);
			System.out.println(bytesRead);
			buf.flip();
			byte[] array=new byte[bytesRead];
			int index=0;
			while(buf.hasRemaining()) {
				array[index]=buf.get();
				//System.out.print((char)buf.get());
				index++;
			}
			buf.clear();
			System.out.println(new String(array));
			socketChannel.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
