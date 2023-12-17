package com.unit8.rmicorba.class1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInt extends Remote  {
	
	public int add(int num1, int num2) throws RemoteException;
	public double div(double num1, double num2) throws RemoteException;
	public int mul(int num1, int num2) throws RemoteException;
	public String reverseData(String input) throws RemoteException;
	public int factorial(int num) throws RemoteException;

}
