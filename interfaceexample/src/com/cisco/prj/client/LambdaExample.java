package com.cisco.prj.client;

 
public class LambdaExample {

	public static void main(String[] args) {
		
		Computation add = (int x, int y) -> {
			return x + y;
		};

		Computation sub = (x, y) -> x - y;

		doTask(add);
		doTask(sub);

		doTask((x, y) -> x * y);
	}

	public static void doTask(Computation comp) {
		System.out.println(comp.compute(4, 5));
	}

}
