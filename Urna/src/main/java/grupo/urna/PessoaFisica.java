package grupo.urna;

/**
 *
 * @author vitic
 */
public class PessoaJuridica extends Pessoa implements Autenticacao{
	private String cnpj;
	
        public PessoaJuridica (int id, String nome, String protocolo,String cnpj, String voto){
            super(id,nome,protocolo, voto);
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
