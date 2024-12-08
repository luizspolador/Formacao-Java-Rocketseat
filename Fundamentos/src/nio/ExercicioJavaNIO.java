package nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ExercicioJavaNIO {
    public static void main(String[] args) throws IOException {

        List<String> contatos = new ArrayList<>();
        contatos.add("(83) 2148-5886 Joemia Giron Lyrio Monnerat");
        contatos.add("(21) 2705-6726 Reginaldo Folly Barboza Brito");
        contatos.add("(91) 2416-8455 Mariza Gadelha Bastida Carneiro");
        contatos.add("(68) 3259-8389 Mirian Venancio Portela Ignacia");

        Path arquivoDestino = Paths.get("C:\\Rocketseat\\java-rocketseat\\lista-contatos.txt");

        StringBuilder conteudoGeral = new StringBuilder();
        for(String listaContato:contatos){
            String conteudo = listaContato + System.lineSeparator(); // retorna um caractere que representa uma quebra de linha
            conteudoGeral.append(conteudo); // esta propriedade determina que o arquivo permita incrementar seu conteúdo
        }
        Files.write(arquivoDestino, conteudoGeral.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
        // StandardOpenOption.CREATE -> Criará o arquivo caso o mesmo não exista.

        try {
            Path arquivoOrigem = Paths.get("C:\\Rocketseat\\java-rocketseat\\lista-contatos.txt");
            contatos = Files.readAllLines(arquivoOrigem);
            for (String linhaContato:contatos){
                System.out.println(linhaContato);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
