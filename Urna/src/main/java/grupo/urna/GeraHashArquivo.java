package grupo.urna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeraHashArquivo {
    //Método para gerar a hash do arquivo
    public static void gerarHashArquivo(String caminhoEntrada, String caminhoSaida) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoEntrada))) {
            String linha;
            StringBuilder sb = new StringBuilder();
            while ((linha = reader.readLine()) != null) {
                sb.append(linha);
            }
            String arquivo = sb.toString();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(arquivo.getBytes(StandardCharsets.UTF_8));
            String hash = bytesToHex(hashBytes);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoSaida))) {
                writer.write(hash);
            }
        } catch (IOException | NoSuchAlgorithmException e) {
            throw new RuntimeException("Error generating hash: " + e.getMessage());
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
