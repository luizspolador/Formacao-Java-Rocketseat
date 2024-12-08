package OriObjetos;

public class TrabalhandoComEnum {
    public static void main(String[] args) {

        EstadoBrasileiro estadoBrasileiro = EstadoBrasileiro.PARANA;
        System.out.println(estadoBrasileiro.getNome()); // Paraná
        System.out.println(estadoBrasileiro.getSigla()); //PR

        EstadoBrasileiro estadoBrasileiro2 = EstadoBrasileiro.valueOf("SAO_PAULO");
        System.out.println(estadoBrasileiro2); // SAO_PAULO
        System.out.println();

        System.out.println("Estados: ");
        for (EstadoBrasileiro eb : EstadoBrasileiro.values()){
            System.out.println(eb.getNome() + " - " + eb.getSigla());
        }
    }

}
