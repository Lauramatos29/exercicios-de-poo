package empregados;

public class Main {

	public static void main(String[] args) {
		Assalariado assalariado = new Assalariado("Violet Sorrengail", "287.487.567-34", 200.00);
		Horista horista = new Horista("Xaden Riorson", "978-556-034-27", 100.00, 6);
		
		assalariado.exibirInfo();
		assalariado.calcularSalario();
		
		System.out.println("----------------------");
		
		horista.exibirInfo();
		horista.calcularSalario();

	}

}
