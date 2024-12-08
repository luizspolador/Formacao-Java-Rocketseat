package controlefluxo;

public class EstruturaRepeticaoFor {

    public static void main(String[] args) {

        String alunos[] = {"Luiz", "Henrique", "Steccey", "Estrella"};

        for(int i=0; i <=20; i++){
            System.out.println(i);
        }


        for(int x=0; x<alunos.length; x++){
            System.out.println("O Aluno do índice " + x + " é " + alunos[x]);
        }

        for(String aluno : alunos){
            System.out.println(aluno);
        }

        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3){
                break; // imprime somente 1, 2
            }
            System.out.println(numero);
        }

        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3){
                continue; // nao vai imprimir o 3, somente 1, 2, 4, 5
            }
            System.out.println(numero);
        }
    }
}
