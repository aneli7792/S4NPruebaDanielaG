package com.s4n.pruebaDanielaG.util;

public class WaitResponse {
	private static int UN_SEGUNDO = 1000;

	public static void forAWhile() {
		forAWhile(UN_SEGUNDO);
	}

	public static void forAWhile(int waitTime) {
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}