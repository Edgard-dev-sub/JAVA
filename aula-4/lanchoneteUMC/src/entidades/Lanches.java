package entidades;

public class Lanches {
    private final boolean status;
    private String nome;
    private String descricao;
    private String categoria;
    private double preco;
    private int quantidade;
    private boolean disponivel;

    public Lanches(boolean status, int quantidade, double preco, String categoria, String descricao, String nome) {
        this.status = status;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
        this.descricao = descricao;
        this.nome = nome;
    }
}
