package com.gga.lesson140702.chart;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.gga.lesson140528.Utils;

public class Chat {
	
	static final String[] phrase = {"yo", "okay", "shut up", "oh, really", "yes", "no"};
	
	static class ClientImitator implements Runnable {
		private ChatClient _client;
		
		public ClientImitator(ChatClient client) {
		    _client = client;	
		}
		
		@Override
		public void run() {
			Random random = new Random();
			while(true) {
				Utils.pause(5000 + random.nextInt(10000));
				_client.received(phrase[random.nextInt(phrase.length)]);
			}
		}
		
	}
	
    public static void main(String[] args) {
    	ChatServer server = new ChatServer();
    	
    	ChatClient c1 = new ChatClient("Pete");
    	ChatClient c2 = new ChatClient("Ann");
    	ChatClient c3 = new ChatClient("John");
	
    	server.addClient(c1);
    	Utils.pause(1000);
    	server.addClient(c2);
    	Utils.pause(1000);
    	server.addClient(c3);
    	Utils.pause(1000);
    	
    	ExecutorService service = Executors.newCachedThreadPool();
    	service.execute(server);
        service.execute(new ClientImitator(c1));    	
        service.execute(new ClientImitator(c2));    	
        service.execute(new ClientImitator(c3));    	
    }
}
