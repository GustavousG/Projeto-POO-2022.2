package grupo.urna;


public abstract class Pessoa {
	
        private int id;
	private String nome;
	private String protocolo;
        private String voto;
	
	public Pessoa() {
		
	}	
	public Pessoa(int id,String nome, String protocolo, String voto) {
                this.id= id;
		this.nome = nome;
		this.protocolo = protocolo;
                this.voto = voto;
	}
        public String getVoto(){
            return voto;
        }
        public int getId(){
                return id;
        }
