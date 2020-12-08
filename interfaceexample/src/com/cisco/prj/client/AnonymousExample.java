package com.cisco.prj.client;

public class AnonymousExample {

	public static void main(String[] args) {
		Computation add = new Computation() {
			@Override
			public int compute(int x, int y) {
				return x + y;
			}
		};
		
		Computation sub = new Computation() {
			@Override
			public int compute(int x, int y) {
				return x - y;
			}
		};
		
		doTask(add);
		doTask(sub);
	}

	public static void doTask(Computation comp) {
		System.out.println(comp.compute(4 , 5 ));
	}
}
