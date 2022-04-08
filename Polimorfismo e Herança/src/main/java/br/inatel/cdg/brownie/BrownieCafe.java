package br.inatel.cdg.brownie;

public class BrownieCafe extends Brownie{

    public BrownieCafe(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void addCafe(){
        System.out.println("Bownie agora tem Cafe!");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Browniezao Coffe adicionado ao carrinho.");
    }

}
