package com.winter.study7.ex1.client;

public class ClientMain {

	public static void main(String[] args) {

		ClientController clientController = new ClientController();
		try {
			clientController.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
