
public class Funcionario {

	private String nome;
	private String cpf;
	private String cargo;
	private double salario;
	private boolean ativo;
	
	public Funcionario(String nome, String cpf, String cargo, double salario) {
	
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.ativo = true;
	}

	
	public Funcionario() {
		
		this.nome = "indefinido";
		this.cpf = "000.000.000-00";
		this.cargo = "Indefinido";
		this.salario = 0.0;
		this.ativo = false;
	}
	
	
	public void alterarDados(String nomeNovo, String cpfNovo, String cargoNovo, double salarioNovo) {
		
		this.nome = nomeNovo;
		this.cpf = cpfNovo;
		this.cargo = cargoNovo;
		this.salario = salarioNovo;
	
		

	}
	
	
	public void aplicarReajuste(double percentual) {
		
		double valorPercentual = salario * (percentual /100);
		
		this.salario = salario + valorPercentual;
		
		System.out.println("Reajuste de " + percentual + "% realizado com sucesso...\n");
		
	}
	
	
	
	public void demitir() {
		
		this.ativo = false;
		
		System.out.println("Funcionário demitido com sucesso...\n");
		
	}
	
	
	public void exibirDados() {
		
		System.out.println("Nome do funcionário: " + this.nome);
		System.out.println("CPF do funcionário: " + this.cpf);
		System.out.println("Cargo do funcionário: " + this.cargo);
		System.out.println("Salário do funcionário: " + this.salario);
		System.out.print("Estado do funcionário: ");

		if(this.ativo == true) {
			System.out.println("ATIVO\n");

		}else {
			System.out.println("INATIVO\n");

			
		}

		
	}

	//////////////////////////////////////////////////////////////
	public boolean isAtivo() {
		return ativo;
	}

	//unica forma de acessar o atributo privado

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	//////////////////////////////////////////////////////////////
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
