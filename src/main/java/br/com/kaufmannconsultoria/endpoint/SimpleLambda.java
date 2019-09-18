package br.com.kaufmannconsultoria.endpoint;
import java.util.Arrays;

public class SimpleLambda {

	public static void main(String[] args) {
		final String[] cars= {"ferrari","bmw","fiat" };
		Arrays.sort(cars, (c1,c2)->c1.compareTo(c2));
		for (String string : cars) {
			System.out.println(string);
		}
	}

}
