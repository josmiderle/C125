package br.inatel.cdg.brownie;

public class BrownieNutella extends Brownie{

    public BrownieNutella(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void addNutella(){
        System.out.println("Bownie agora tem nutella!");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Browniezao Nu adicionado ao carrinho.");
    }

}
