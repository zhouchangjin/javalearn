package javalearn.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NIOServer {
	
	public static void main(String args[]) {
		try {
			//开启
			ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
			//监听
			serverSocketChannel.socket().bind(new InetSocketAddress(9999));
			//非阻塞模式
			serverSocketChannel.configureBlocking(false);

			while(true){
			    SocketChannel socketChannel =  serverSocketChannel.accept();
			    if(socketChannel != null){
			    	System.out.println("======connected=========="+socketChannel.getRemoteAddress());
			    	ByteBuffer buf = ByteBuffer.allocate(48);
			    	buf.put(new String("hello"+socketChannel.getRemoteAddress()).getBytes());
			    	buf.flip();
			    	socketChannel.write(buf);
			    	
			    }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
