
public abstract class Pessoa {
	
	private String nome;
	private String senha;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getNome() {
		return nome;
	}
	
}
