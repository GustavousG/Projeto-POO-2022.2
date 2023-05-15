package grupo.urna;

public class PessoaJuridica extends Pessoa {
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

}