package grupo.urna;

public class Notas {
    private String cpfCnpj;
    private String protocolo;
    public Notas (String cpfCnpj,String protocolo ){
        this.cpfCnpj = cpfCnpj;
        this.protocolo = protocolo;
    }
    public String getProtocolo(){
        return protocolo;
    }
    public String getCpfCnpj(){
        return cpfCnpj;
    }
}
