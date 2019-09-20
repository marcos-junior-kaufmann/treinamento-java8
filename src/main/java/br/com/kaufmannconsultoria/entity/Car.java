package br.com.kaufmannconsultoria.entity;

public class Car {

	public Integer hp;
	public Integer km;
	public String marca;
	public String nome;

	private Car(Integer hp, Integer km, String marca, String nome) {
		this.hp = hp;
		this.km = km;
		this.marca = marca;
		this.nome = nome;
	}

	public static Car of(Integer hp, Integer km, String marca, String nome) {
		return new Car(hp, km, marca, nome);
	}

	@Override
	public String toString() {
		return "Car [hp=" + hp + ", km=" + km + ", marca=" + marca + ", nome=" + nome + "]";
	}
}
