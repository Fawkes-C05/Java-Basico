package edu.fawkesc05.java.basico.smarttv;

public class SmartTv {

	 	boolean onOff = false;
		int currentChannel = 1;
		int currentVolume = 25;
		
		public void turnOn() {
			onOff = true;
		}
		
		public void turnOff() {
			onOff = false;
		}
		
		public void changeVolumeUp() {
			currentVolume++;
			System.out.println("Increasing Volume...");
		}
		
		public void changeVolumeDown() {
			currentVolume--;
			System.out.println("Decreasing Volume...");
		}
		
		public void selectChannel(int newChannel) {
			currentChannel = newChannel;
			System.out.println("Selecting New Channel: " + currentChannel);
		}
		
		public void changeChannelUp() {
			currentChannel++;
			System.out.println("Channel Up...");
		}
		
		public void changeChannelDown() {
			currentChannel--;
			System.out.println("Channel Down...");
		}

}
