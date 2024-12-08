package nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try{

            Path path = Paths.get("C:\\Rocketseat\\java-rocketseat\\aula-java.txt");
            byte[] bytesArquivos = Files.readAllBytes(path); // pega os bytes do arquivo
            String conteudo = new String(bytesArquivos); // converte em string
            System.out.println(conteudo); // iprime o conteúdo/string

            // outra alternativa de leitura
            String conteudo2 = Files.readString(path);
            System.out.println(conteudo2);

            // escrevendo no arquivo
            String conteudo3 = "Luiz Henrique";
            Files.write(path, conteudo3.getBytes(StandardCharsets.UTF_8));

            // escrevendo no arquivo com lista
            List<String> nomes = new ArrayList<>();
            nomes.add("Steccey Estrella");
            nomes.add("Eddie Thor");
            nomes.add("Chico Nino");

            StringBuilder conteudo5 = new StringBuilder();
            nomes.forEach(n -> conteudo5.append(n + "\n"));
            Files.write(path, conteudo5.toString().getBytes(StandardCharsets.UTF_8));

            // leitura: caso o conteúdo seja uma lista(várias linhas)
            List<String> linhas = Files.readAllLines(path);
            linhas.forEach(l -> System.out.println(l));

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
