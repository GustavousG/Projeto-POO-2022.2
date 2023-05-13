/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo.urna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Luiz
 */
public class CriaArq {
    
    public static void lerNotas(String camArq) {
        
        try(
                BufferedReader br = new BufferedReader(new FileReader(camArq))              
                ){
            String linha = "";
            
            while(true){
                if(linha != null){
                    System.out.println(linha);
                }else
                    break;
            }
            linha = br.readLine();
            
        }catch(IOException e){
        e.printStackTrace();
    }
    }
    
    public static void salvaNotas(String camArq, String notas){
       
        try(
                
                FileWriter criaArquivo = new FileWriter(camArq, true);
                BufferedWriter buffer = new BufferedWriter(criaArquivo);
                PrintWriter escreverNotas = new PrintWriter(buffer);
                ){
            
            escreverNotas.append(notas);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
