package Aula11;

public class ObjetoAgregacao {

	public static void main(String[] args) {
		
	Departamento d1 = new Departamento("Recursos Humanos");
	Empresa e1 = new Empresa("Tech Solutions", d1);
	e1.mostrarInfo();
	}
	
}