package de.jknowledge.aspectj.example.classes;

import de.jknowledge.aspectj.example.Tracked;

@Tracked
public class TrackedClass1 {
	
	public void methodClass1() {
		try {
			int sleepTime =  (int) (Math.random() * (1000 - 100) + 100);
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
