package br.com.kaufmannconsultoria.endpoint;

import java.util.stream.Stream;

public class Car {

	Integer hp;
	Integer km;
	String marca;
	String nome;

	private Car(Integer hp, Integer km, String marca, String nome) {
		this.hp = hp;
		this.km = km;
		this.marca = marca;
		this.nome = nome;
	}

	static Car of(Integer hp, Integer km, String marca, String nome) {
		return new Car(hp, km, marca, nome);
	}

	public static void main(String[] args) {
		Stream.of(Car.of(160, 50000, "fiat", "147"), Car.of(230, 100000, "chevrolet", "astra"),
				Car.of(210, 100000, "chevrolet", "blazer")).peek(System.out::println)
				.filter(s -> s.marca.equals("chevrolet")).map(s -> s.nome).forEach(System.out::println);
	}

	@Override
	public String toString() {
		return "Car [hp=" + hp + ", km=" + km + ", marca=" + marca + ", nome=" + nome + "]";
	}
}
