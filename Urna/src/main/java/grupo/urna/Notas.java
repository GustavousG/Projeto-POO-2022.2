package grupo.urna;

public class Notas {
    private int id;
    private String nome;
    public Notas (int id,String nome){
        this.nome = nome;
        this.id = id;    
    }
    public String getNome(){
        return nome;
    }
    public int getId(){
        return id;
    }
}
