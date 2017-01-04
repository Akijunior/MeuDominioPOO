package Infra;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import Domain.Conta;

public class TestaRandom {
	public static void main(String[] args) {
		
		Random rand = new Random();
		//rand.setSeed(100);
		for (int i = 0; i < 10; i++) {
			int num = (int)(rand.nextDouble() * 100);
			System.out.println(num);
		}
	}
}
