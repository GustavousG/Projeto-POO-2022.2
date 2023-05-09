package grupo.urna;

import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Notas muitoRuim = new Notas(1, "Muito Ruim");
        Notas ruim = new Notas(2,"Ruim");
        Notas regular = new Notas(3, "Regular");
        Notas bom = new Notas(4, "Bom");
        Notas muitoBom = new Notas(5, "Muito Bom");
        // Carrega as pessoas do arquivo
        CarregarPessoas carregarPessoas = new CarregarPessoas("C:\\Users\\vitic\\OneDrive\\Documentos\\NetBeansProjects\\Urna\\src\\main\\java\\arqs\\Eleitores.txt");
        List<Pessoa> pessoas = carregarPessoas.getPessoas();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o protocolo do eleitor: ");
        String protocolo = scanner.nextLine();
        
        System.out.println(muitoRuim.getId()+muitoRuim.getNome());
        System.out.println(ruim.getId()+ruim.getNome());
        System.out.println(regular.getId()+regular.getNome());
        System.out.println(bom.getId()+ bom.getNome());
        System.out.println(muitoBom.getId()+ muitoBom.getNome());
        
        
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getProtocolo().equals(protocolo)) {
                if (pessoa.getVoto().equals("0")) {
                    System.out.print("Digite o número do candidato (diferente de zero): ");
                    int voto = scanner.nextInt();
                    pessoa.setVoto(Integer.toString(voto));
                    System.out.println("Voto computado com sucesso!");
                } else {
                    System.out.println("Erro: protocolo já votou!");
                }
                
            }
        }
    }        


}
