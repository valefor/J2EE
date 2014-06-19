package org.alc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/*
 * Note we should annotate the class with @Component since 
 * spring auto-detect won't detect @AspectJ.
 * And In Spring AOP,it is not possible to have aspects themselves be the target of advice from
 * other aspects.The @Aspect annotation on a class marks it as an aspect,and hence excludes it
 * from auto-proxying.
 * */
@Component
@Aspect
public class TestAspect {

	
	@Before("execution(* *..dao..*(..))")
	private void doBeforeDao() {
		System.out.println("Using a dao...");
	}
	
	@Before("within(org.alc.controller..*)")
	private void doBeforeController() {
		System.out.println("Using a controller...");
	}
}
