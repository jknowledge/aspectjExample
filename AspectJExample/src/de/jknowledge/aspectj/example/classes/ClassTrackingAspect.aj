package de.jknowledge.aspectj.example.classes;


public aspect ClassTrackingAspect {
	
	pointcut trackedMarkedClasses() : within(@de.jknowledge.aspectj.example.Tracked  * );
	
	pointcut methods() : execution(* *.*(..));
	
	pointcut trackedMarkedClassesMethods() : (trackedMarkedClasses() && methods());
	
	Object around() : trackedMarkedClassesMethods() {
		System.out.println("start " + thisJoinPoint.getSignature());
		long timeBefore = System.currentTimeMillis();
		Object result = proceed();
		long timeAfter = System.currentTimeMillis();
		long processTime = timeAfter - timeBefore;
		System.out.println("finish " + thisJoinPoint.getSignature() + " - processing time: " + processTime);
		return result;
	}
	
}
