package com.solvd.laba.army.functionalInterfaces;

@FunctionalInterface
public interface ICalculateSalary<T, R> {
	Double calculate(T t, R r);
}
