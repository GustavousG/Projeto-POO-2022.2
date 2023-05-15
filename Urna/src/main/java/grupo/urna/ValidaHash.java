
package grupo.urna;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//Verificar se a hash salva corresponde a hash do arquivo
public class ValidaHash {
    public boolean ValidaHash(String caminhoArquivo, String caminhoHash){
        try {
            // Gera o hash do arquivo original
            String currentFileHash = getFileHash(caminhoArquivo);
            String storedFileHash = new BufferedReader(new FileReader(caminhoHash)).readLine();
            return validateFileHash(caminhoArquivo, storedFileHash);
        
        }
        catch (IOException e) {
            return false;
        }
        
    }
    private static String getFileHash(String filename) throws IOException {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hash: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                md.update(line.getBytes());
            }
            byte[] hash = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        }
    }
    private static boolean validateFileHash(String filename, String storedFileHash) throws IOException {
        String currentFileHash = getFileHash(filename);
        return currentFileHash.equals(storedFileHash);
    }
}
