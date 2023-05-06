/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo.urna;

/**
 *
 * @author vitic
 */
public class SistemaAvaliacao {
    private int id;
    private String nota;
   // private int tipoPessoa;
    private int votos;
    
    public SistemaAvaliacao(int id, String nota/*, int tipoPessoa*/){
        this.id= id;
        this.nota= nota;
        //this.tipoPessoa = tipoPessoa;  //implementação para separar votos PJ de PF
        this.votos = 0;
    }
}
