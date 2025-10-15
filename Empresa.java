package Aula11;

public class Empresa {

	private String nome;
	private Departamento departamento;

	public Empresa(String nome, Departamento departamento) {
		this.nome = nome;
		this.departamento = departamento;
	}

	public void mostrarInfo() {
		System.out.println("Empresa: " + nome);
		System.out.println("Departamento: " + departamento.getNome());
	}
}