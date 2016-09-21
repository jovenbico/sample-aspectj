package com.bicjo.aspectj;

public class SimpleHello implements Hello {

	@Override
	public void say() {
		System.out.println("World!");
	}

}
