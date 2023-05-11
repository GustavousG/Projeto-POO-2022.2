package grupo.urna;

import java.util.List;

public class Main {
     public static void main(String[] args) {
        Notas muitoInsatisfeito = new Notas(1, "Muito Insatisfeito");
        Notas insatisfeito = new Notas(2,"Insatisfeito");
        Notas neutro = new Notas(3, "Neutro");
        Notas satisfeito = new Notas(4, "Satisfeito");
        Notas muitoSatisfeito = new Notas(5, "Muito Satisfeito");
        // Carrega as pessoas do arquivo
//        CarregarPessoas carregarPessoas = new CarregarPessoas("src\\main\\java\\arqs\\Eleitores.txt");
//        List<Pessoa> pessoas = carregarPessoas.getPessoas();
//        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite o protocolo do eleitor: ");
//        String protocolo = scanner.nextLine();

        CarregarPessoas carregar = new CarregarPessoas("src\\main\\java\\arqs\\Eleitores.txt");
        List<Pessoa> pessoas = carregar.getPessoas();
        
//         for (int i = 0; i < pessoas.size(); i++) {
//             System.out.println(pessoas.get(i));
//         }
//        for (Pessoa pessoa : pessoas) {
//            if (pessoa instanceof PessoaFisica) {
//                PessoaFisica pf = (PessoaFisica) pessoa;
//                System.out.println(pf.getCpf());
//            } else if (pessoa instanceof PessoaJuridica) {
//                PessoaJuridica pj = (PessoaJuridica) pessoa;
//                System.out.println(pj.getCnpj());
//            }
//        }
        
        System.out.println(muitoInsatisfeito.getId()+muitoInsatisfeito.getNome());
        System.out.println(insatisfeito.getId()+insatisfeito.getNome());
        System.out.println(neutro.getId()+neutro.getNome());
        System.out.println(satisfeito.getId()+ satisfeito.getNome());
        System.out.println(muitoSatisfeito.getId()+ muitoSatisfeito.getNome());
        
        
//        for (Pessoa pessoa : pessoas) {
//            if (pessoa.getProtocolo().equals(protocolo)) {
//                if (pessoa.getVoto().equals("0")) {
//                    System.out.print("Digite o número do candidato (diferente de zero): ");
//                    int voto = scanner.nextInt();
//                    pessoa.setVoto(Integer.toString(voto));
//                    System.out.println("Voto computado com sucesso!");
//                } else {
//                    System.out.println("Erro: protocolo já votou!");
//                }
//                
//            }
//        }
    CriaArq.salvaNotas("src\\main\\java\\arqs\\Notas.txt", txtCC.getText());



    }        


}
