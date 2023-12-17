package com.unit8.rmicorba.class1;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerProgram {
	
	public static void main(String[] args) {
		
		try {
			CalculatorIntImpl obj = new CalculatorIntImpl();
			LocateRegistry.createRegistry(4345);
			Naming.rebind("rmi://localhost:4345/demo", obj);
			System.out.println("Server Started...");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
