package controlefluxo;

public class CondicionalSimples {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 10.0;

        if (valorSolicitado <= saldo){
            saldo -= valorSolicitado;
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}