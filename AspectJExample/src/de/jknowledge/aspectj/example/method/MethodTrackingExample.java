package de.jknowledge.aspectj.example.method;

import de.jknowledge.aspectj.example.Tracked;

public class MethodTrackingExample {
	
	public static void main(String[] args) {
		new MethodTrackingExample().trackedMethod();
		new MethodTrackingExample().trackedMethod();
		new MethodTrackingExample().trackedMethod();
	}
	
	@Tracked
	private void trackedMethod() {
		try {
			int sleepTime =  (int) (Math.random() * (1000 - 100) + 100);
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
