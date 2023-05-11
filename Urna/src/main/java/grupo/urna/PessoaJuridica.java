/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo.urna;

/**
 *
 * @author vitic
 */
public class PessoaJuridica extends Pessoa implements Autenticacao{
	private String cnpj;

        public PessoaJuridica (int id, String nome, String protocolo,String cnpj){
            super(id,nome,protocolo);
            this.cnpj = cnpj;
        }
        public String getCnpj() {
    		return cnpj;
 	 }

 	 public void setCnpj(String cnpj) {
    		this.cnpj = cnpj;
  	}
	@Override
	public boolean autentica() {
		// TODO Auto-generated method stub
		return false;
	}
}