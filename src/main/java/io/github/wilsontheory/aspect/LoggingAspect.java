package io.github.wilsontheory.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

//	@Before("execution(public String getName())") executes for all that match this method signature
	@Before("execution(public String io.github.wilsontheory.model.RussianBlue.getName())") 
	//Advice only runs for RussianBlue.getName(), these are 'Point Cuts'
	public void loggingAdvice(){
		//Advices refer to methods (cross-cutting concerns) in an Aspect
		System.out.println("Advice run for RussianBlue. Get method called");
	}
	
	@After("execution(* get*())") //wildcards in/as return type and method name
	//add * in method sig arg for 1 or more arg of any kind, add .. for 0 or more
	public void loggingAdviceGetters(){
		System.out.println("A getter method was just run!");
	}
	
	@Before("siameseGetters()")
	public void printBeforeSetter(){
		System.out.println("Advice to print before getting the siamese name");
	}
	
	@Before("siameseGetters() && allSiameseMethodsExample()") //good practice
	public void printCombinedSiamese(){
		System.out.println("Advice triggered before Siamese getter AND siamese method");
	}
	
	@Pointcut("execution(* io.github.wilsontheory.*.Siamese.getName(..))")
	public void siameseGetters(){}
	
	@Pointcut("execution(* io.github.wilsontheory.model.Siamese.*(..))")
	public void allSiameseMethodsExample(){};
	//same as
	@Pointcut("within(io.github.wilsontheory.model.Siamese)")
	public void allSiamesePointcutWithinExample(){};
	
//	@Pointcut("within(io.github.wilsontheory.model..*") would include all subpackages within model

}
