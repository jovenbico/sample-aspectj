package com.bicjo.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public abstract class HelloAspectj {

	@Pointcut
	abstract void scope();

	@Before("scope() && call(* com.bicjo.aspectj.Hello.*(..))")
	public void before(JoinPoint thisJoinPoint) {
		System.out.print("Hello ");
	}

}
