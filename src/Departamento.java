
public class Departamento {
	
	private String nomeDepartamento;
	private Funcionario[] funcionarios;
	private int contador;
	
	
	public Departamento(String nomeDepartamento) {
		
		this.nomeDepartamento = nomeDepartamento;
		this.funcionarios = new Funcionario[5];
		this.contador = 0;
	}
	
	
	public void adicionarFuncionario(Funcionario f) {
		
		if(this.contador < this.funcionarios.length) {
			
			this.funcionarios [this.contador] = f; 
			
			this.contador++;
			
			
			
			System.out.println("Funcionário adicionado com sucesso...\n");
			
		}else {
			System.out.println("Departamento lotado. Não é possível adicionar mais funcionários...\n");
		}
		
	}
	
	
	public void listarFuncionarios() {
		for(int x = 0; x < contador; x++) {
			this.funcionarios[x].exibirDados();
		}
	}
	
	
	public double calcularFolhaSalarial() {
		
		double somaTotal = 0;
		
		for(int x = 0; x < contador; x++) {	
		if(this.funcionarios[x].isAtivo() == true) {
	
			somaTotal = somaTotal + this.funcionarios[x].getSalario();
			
			
			
			}
		}
		
		return somaTotal;

		}


	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}


	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	}

	


