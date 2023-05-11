/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo.urna;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Luiz
 */
public class CriaArq {
    
    public static void salvaNotas(String camArq, String notas){
       
        try(
                
                FileWriter criaArquivo = new FileWriter(camArq, false);
                BufferedWriter buffer = new BufferedWriter(criaArquivo);
                PrintWriter escreverNotas = new PrintWriter(buffer);
                ){
            
            escreverNotas.append(notas);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
