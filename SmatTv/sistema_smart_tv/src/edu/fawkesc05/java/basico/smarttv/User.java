package edu.fawkesc05.java.basico.smarttv;

public class User {
	
	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV ON: " + smartTv.onOff);
		System.out.println("Current Channel: " + smartTv.currentChannel);
		System.out.println("Current Volume: " + smartTv.currentVolume);
		
		smartTv.turnOn();
		
		System.out.println("TV ON: " + smartTv.onOff);
		
		smartTv.changeVolumeUp();
		smartTv.changeVolumeUp();
		smartTv.changeVolumeUp();
		smartTv.changeVolumeUp();
		smartTv.changeVolumeUp();
		smartTv.changeVolumeUp();
		
		System.out.println("Current Volume: " + smartTv.currentVolume);
		
		smartTv.changeVolumeDown();
		
		System.out.println("Current Volume: " + smartTv.currentVolume);
		
		smartTv.selectChannel(9);
		
		smartTv.changeChannelUp();
		smartTv.changeChannelUp();
		
		System.out.println("Current Channel: " + smartTv.currentChannel);
		
	}

}
