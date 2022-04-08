package br.inatel.cdg.brownie;

public class BrownieDoceDeLeite extends Brownie{

    public BrownieDoceDeLeite(String nome, double preco, String sabor){
        super(nome, preco, sabor);
    }

    public void addDoceDeLeite(){
        System.out.println("Bownie agora tem Doce De Leite!");
    }

    @Override
    public void addCarrinhoDeCompras(){
        System.out.println("Browniezao Do adicionado ao carrinho.");
    }
}
