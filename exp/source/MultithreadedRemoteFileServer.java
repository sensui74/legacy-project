/*
 * 创建日期 2004-10-21
 *
 * 更改所生成文件模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */

/**
 * @author Administrator
 *
 * 更改所生成类型注释的模板为
 * 窗口 > 首选项 > Java > 代码生成 > 代码和注释
 */
 
import java.io.*;
import java.net.*;

public class MultithreadedRemoteFileServer {
	protected int listenPort;
	public MultithreadedRemoteFileServer(int aListenPort) {
		listenPort = aListenPort;
	}
	public void acceptConnections() {
		try {
			ServerSocket server = new ServerSocket(listenPort, 5);
			Socket incomingConnection = null;
			while (true) {
				incomingConnection = server.accept();
				handleConnection(incomingConnection);
			}
		} catch (BindException e) {
			System.out.println("Unable to bind to port " + listenPort);
		} catch (IOException e) {
			System.out.println("Unable to instantiate a ServerSocket on port: " + listenPort);
		}
	}
	public void handleConnection(Socket connectionToHandle) {
		new Thread(new ConnectionHandler(connectionToHandle)).start();
	}
	public static void main(String[] args) {
		MultithreadedRemoteFileServer server = new MultithreadedRemoteFileServer(3000);
		server.acceptConnections();
	}
}

 
