
public abstract class Pessoa {
	
	private String nome;
	private String protocolo;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String protocolo) {
		this.nome = nome;
		this.protocolo = protocolo;
	}
	
	public String getProtocolo() {
		return protocolo;
	}
	
	public String getNome() {
		return nome;
	}
	
}
