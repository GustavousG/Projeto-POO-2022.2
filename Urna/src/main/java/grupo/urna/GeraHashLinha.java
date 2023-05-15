
package grupo.urna;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeraHashLinha {
    public static String geraHashLinha(String input) {
        //Gerando hash a cada voto
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error generating hash: " + e.getMessage());
        }
    }
    
}
