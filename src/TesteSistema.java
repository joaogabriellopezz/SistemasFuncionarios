
public class TesteSistema {

	public static void main(String[] args) {
		
		Departamento d1 = new Departamento("Tecnologia da Informação");
		
		Funcionario f1 = new Funcionario("João", "060124", "Aprendiz de feitiçeiro", 50000);
		Funcionario f2 = new Funcionario("Coly", "180315", "Professora de portugol", 50000);
		Funcionario f3 = new Funcionario("Rodrigo", "12345678909", "Dev Supremo", 100000);
		Funcionario f4 = new Funcionario();
		
		f4.alterarDados("Pouças", "23123123123", "Somelier", 24000);
		
		d1.adicionarFuncionario(f1);
		d1.adicionarFuncionario(f2);
		d1.adicionarFuncionario(f3);
		d1.adicionarFuncionario(f4);
		
		
		f1.aplicarReajuste(15);
		
		f3.demitir();
		
		d1.listarFuncionarios();
		
		System.out.println("Folha salarial: " + d1.calcularFolhaSalarial());
		
	}

}
