package de.jknowledge.aspectj.example.classes;

public class ClassTracking {
	
	public static void main(String[] args) {
		TrackedClass1 c1 = new TrackedClass1();
		TrackedClass2 c2 = new TrackedClass2();
		c1.methodClass1();
		c2.medthodClass2();
	}
	
}
