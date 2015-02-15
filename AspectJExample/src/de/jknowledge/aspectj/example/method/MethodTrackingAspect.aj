package de.jknowledge.aspectj.example.method;


public aspect MethodTrackingAspect {
	
	pointcut trackedMethods() : execution(@de.jknowledge.aspectj.example.Tracked  * *.*(..));
	
	Object around() : trackedMethods() {
		System.out.println("start " + thisJoinPoint.getSignature());
		long timeBefore = System.currentTimeMillis();
		Object result = proceed();
		long timeAfter = System.currentTimeMillis();
		long processTime = timeAfter - timeBefore;
		System.out.println("finish " + thisJoinPoint.getSignature() + " - processing time: " + processTime);
		return result;
	}
	
}
