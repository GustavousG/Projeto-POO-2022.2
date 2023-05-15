package grupo.urna;

public class PessoaFisica extends Pessoa {
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


}
