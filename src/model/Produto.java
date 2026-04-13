package model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    public Produto() {
        this.nome = "";
        this.preco = 0;
        this.quantidade = 0;
        this.categoria = "";
    }

    public Produto(String nome, double preco, int quantidade, String categoria) {
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
        setCategoria(categoria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 0) {
            this.quantidade = quantidade;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(categoria != null && !categoria.isEmpty()) {
            this.categoria = categoria;
        }
    }

    public void adicionarEstoque(int qtd) {
        if(qtd > 0) {
            quantidade += qtd;
        }
    }

    public void removerEstoque(int qtd) {
        if(qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               " | Preço: " + preco +
               " | Quantidade: " + quantidade +
               " | Categoria: " + categoria;
    }
}