package nio;

import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    public static void main(String[] args) {

        File diretorio = new File("c:\\Rocketseat\\java-rocketseat");
        System.out.println("diretório existe? " + diretorio.exists());

        // condição para criar diretório
        if(!diretorio.exists()){
            diretorio.mkdirs(); // cria a cadeia de diretórios
            System.out.println("diretório criado com sucesso");
        } else {
            System.out.println("diretório já existe");
        }


        // criando arquivo
        try {
            File arquivo = new File(diretorio, "aula-java.txt");
            arquivo.createNewFile();
            System.out.println("Arquivo criado com sucesso: " + arquivo.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
