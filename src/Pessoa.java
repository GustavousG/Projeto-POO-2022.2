
public abstract class Pessoa {
	
	private String nome;
	private int senha;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public String getNome() {
		return nome;
	}
	
}
