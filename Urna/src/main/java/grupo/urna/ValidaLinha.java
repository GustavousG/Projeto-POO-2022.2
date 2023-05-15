package grupo.urna;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//Verifica se a hash da linha corresponde 
public class ValidaLinha {
    private boolean isValid;

    public ValidaLinha(String arquivo){
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            isValid = true;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";\\|\\|");
                String texto = partes[0];
                String hash = partes[1];
                boolean linhaValida = validateFileHash(texto,hash);
                if (!linhaValida) {
                    System.out.println("A linha '" + linha + "' é inválida");
                    isValid = false;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo" + e.getMessage());
            isValid = false;
        }
    }

    public boolean isValid() {
        return isValid;
    }

    public static String hashTexto(String texto){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(texto.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hash: " + e.getMessage());
        }
    }

    private static boolean validateFileHash(String filename, String storedFileHash) throws IOException {
        String currentFileHash = hashTexto(filename);
        return currentFileHash.equals(storedFileHash);
    }
}
