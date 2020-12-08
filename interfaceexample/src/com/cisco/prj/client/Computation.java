package com.cisco.prj.client;

@FunctionalInterface
public interface Computation<T> {
	int compute(int x , int y);
}
