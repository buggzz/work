package com.gga.lesson140702.chart;

import com.gga.lesson140528.Utils;

public class SlowChatClient extends ChatClient {

	public SlowChatClient(String name) {
		super(name);
	}

	@Override
	public void sendMessage(String message) {
		Utils.pause(5000);
		super.sendMessage(message);
		Utils.pause(5000);
	}
}
