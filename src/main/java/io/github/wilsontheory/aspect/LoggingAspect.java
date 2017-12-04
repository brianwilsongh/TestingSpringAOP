package io.github.wilsontheory.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void LoggingAdvice(){
		//Advices refer to methods in an Aspect
		System.out.println("Advice run. Get method called");
	}
}
