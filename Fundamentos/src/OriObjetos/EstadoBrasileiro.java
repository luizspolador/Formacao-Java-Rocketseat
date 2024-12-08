package OriObjetos;

public enum EstadoBrasileiro {
    RIO_GRANDE_DO_SUL ("Rio Grande do Sul", "RS"),
    SANTA_CATARINA ("Santa Catarina", "SC"),
    PARANA ("Paraná", "PR"),
    SAO_PAULO ("São Paulo", "SP"),
    RIO_DE_JANEIRO ("Rio de Janeiro", "RJ"),
    MINAS_GERAIS ("Minas Gerais", "MG");

    private String nome;
    private String sigla;

    EstadoBrasileiro(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
