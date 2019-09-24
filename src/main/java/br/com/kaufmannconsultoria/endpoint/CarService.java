package br.com.kaufmannconsultoria.endpoint;

import java.util.stream.Stream;

import br.com.kaufmannconsultoria.entity.Car;

public class CarService {

	public static void main(String[] args) {
		Stream.of(Car.of(160, 50000, "fiat", "147"), Car.of(230, 100000, "chevrolet", "astra"),
				Car.of(210, 100000, "chevrolet", "blazer")).peek(System.out::println)
				.filter(s -> s.marca.equals("chevrolet")).map(s -> s.nome).forEach(System.out::println);
	}
}
