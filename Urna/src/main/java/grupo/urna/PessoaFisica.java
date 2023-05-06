/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo.urna;

/**
 *
 * @author vitic
 */
public class PessoaFisica extends Pessoa implements Autenticacao{
	private String cpf;
	
        public PessoaFisica (String cpf, String nome, String protocolo){
            super(nome,protocolo);
            this.cpf = cpf;
        }
        public String getCpf() {
    		return cpf;
 	 }

 	 public void setCpf(String cpf) {
    		this.cpf = cpf;
  	}
	@Override
	public boolean autentica() {
		// TODO Auto-generated method stub
		return false;
	}

}