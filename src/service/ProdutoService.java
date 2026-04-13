package service;

import model.Produto;

public class ProdutoService {

    private Produto produto;

    public void cadastrar(Produto p) {
        this.produto = p;
    }

    public void mostrar() {
        if(produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Nenhum produto cadastrado.");
        }
    }

    public Produto getProduto() {
        return produto;
    }
}