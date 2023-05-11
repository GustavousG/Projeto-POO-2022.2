package grupo.urna;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarregarPessoas {
    private List<Pessoa> pessoas = new ArrayList<>();
    
    public CarregarPessoas(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = br.readLine();
            while (linha != null) {
                String[] campos = linha.split(";");
                if (campos[0].equals("0")) {
                    PessoaFisica pessoa = new PessoaFisica(Integer.parseInt(campos[0]), campos[1], campos[2], campos[3]);
                    pessoas.add(pessoa);
                } else if (campos[0].equals("1")) {
                    PessoaJuridica pessoa = new PessoaJuridica(Integer.parseInt(campos[0]), campos[1], campos[2], campos[3]);
                    pessoas.add(pessoa);
                }
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
    
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}