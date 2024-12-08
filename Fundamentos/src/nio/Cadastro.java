package nio;

import java.time.LocalDate;

public class Cadastro {
    String  nome;
    String  sexo;
    Long    telefone;
    LocalDate dataNascimento;
    Double valorSugerido;
    boolean cliente;

    // este construtor é somente para ilustrar este exemplo
    // evite propagar esta estratégia ao longo dos seus estudos e projetos
    public Cadastro(String nome, String sexo, Long telefone, LocalDate dataNascimento, Double valorSugerido, boolean cliente) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.valorSugerido = valorSugerido;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public Long getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Double getValorSugerido() {
        return valorSugerido;
    }

    public boolean isCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", telefone=" + telefone +
                ", dataNascimento=" + dataNascimento +
                ", valorSugerido=" + valorSugerido +
                ", cliente=" + cliente +
                '}';
    }
}
