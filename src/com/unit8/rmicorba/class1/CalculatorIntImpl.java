package com.unit8.rmicorba.class1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorIntImpl extends UnicastRemoteObject implements CalculatorInt {

	protected CalculatorIntImpl() throws RemoteException {
		super();
	}

	public int add(int num1, int num2) throws RemoteException {
		return num1+num2;
	}

	public double div(double num1, double num2) throws RemoteException {
		return num1/num2;
	}

	public int mul(int num1, int num2) throws RemoteException {
		return num1*num2;
	}

	public String reverseData(String input) throws RemoteException {
		return new StringBuilder(input).reverse().toString();
	}

	public int factorial(int num) throws RemoteException {

		int fact= 1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		return fact;
	}

}
