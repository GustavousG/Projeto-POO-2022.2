package grupo.urna;

/**
 *
 * @author vitic
 */
public class PessoaFisica extends Pessoa implements Autenticacao{
	private String cpf;

        public PessoaFisica (int id,String nome, String protocolo,String cpf){
            super(id,nome,protocolo);
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
