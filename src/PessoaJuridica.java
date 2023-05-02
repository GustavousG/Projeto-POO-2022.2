
public class PessoaJuridica extends Pessoa implements Autenticacao {
	private String cnpj;
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
