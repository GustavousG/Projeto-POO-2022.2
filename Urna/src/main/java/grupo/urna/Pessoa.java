package grupo.urna;


public abstract class Pessoa {

    private int id;
    private String nome;
    private String protocolo;
    

    public Pessoa() {

    }	
    public Pessoa(int id,String nome, String protocolo) {
            this.id= id;
            this.nome = nome;
            this.protocolo = protocolo;
            
    }    
    public int getId(){
            return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }
        
}
