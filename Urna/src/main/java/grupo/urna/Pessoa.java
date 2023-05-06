/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo.urna;

/**
 *
 * @author vitic
 */
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