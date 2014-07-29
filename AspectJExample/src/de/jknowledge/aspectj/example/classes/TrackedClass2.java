package de.jknowledge.aspectj.example.classes;

import de.jknowledge.aspectj.example.Tracked;

@Tracked
public class TrackedClass2 {

	public void medthodClass2() {
		try {
			int sleepTime =  (int) (Math.random() * (1000 - 100) + 100);
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
