/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo.urna;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarregarNotas {
    //Criação de lista para armazenar os dados da votação
    private List<Notas> notas = new ArrayList<>();
    private List<String> salvaNotas = new ArrayList<>();

    public CarregarNotas(String caminhoArquivo) {
        
        try (BufferedReader brn = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = brn.readLine();
            while (linha != null) {
                String[] campos = linha.split(";");
                salvaNotas.add(campos[2]);
                Notas nota = new Notas(campos[0], campos[1]);
                notas.add(nota);
                linha = brn.readLine();
            }            
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
    
    public List<String> getSalvaNotas(){
        return salvaNotas;
    }
    
    public List<Notas> getNotas() {
        return notas;
    }
    
}

