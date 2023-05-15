package grupo.urna;

import View.PrimeiraTela;

public class Main {
     public static void main(String[] args) {
        //Validação da integridade dos arquivos
        ValidaHash validatorArquivo = new ValidaHash();
        ValidaHash validatorArquivoN = new ValidaHash();
        ValidaLinha validadorLinha = new ValidaLinha("src\\main\\java\\arqs\\Eleitores.txt");
        if(validatorArquivoN.ValidaHash("src\\main\\java\\arqs\\Notas.txt", "src\\main\\java\\arqs\\hashNotas.txt")){
            System.out.println("ARQUIVO COM INTEGRIDADE CONFIRMADA--");
        }
        else System.out.println("INTEGRIDADE DO ARQUIVO COMPROMETIDA--");
        if(validatorArquivo.ValidaHash("src\\main\\java\\arqs\\Eleitores.txt", "src\\main\\java\\arqs\\hashEleitores.txt")&&validadorLinha.isValid()){
        System.out.println("ARQUIVO COM INTEGRIDADE CONFIRMADA");
        new PrimeiraTela().setVisible(true);
        }
        else System.out.println("INTEGRIDADE DO ARQUIVO COMPROMETIDA");
     }
}
