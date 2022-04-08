package br.inatel.cdg;


import br.inatel.cdg.brownie.BrownieCafe;
import br.inatel.cdg.brownie.BrownieDoceDeLeite;
import br.inatel.cdg.brownie.BrownieNutella;

public class Main {
    public static void main(String[] args) {
        BrownieNutella brownieNutella = new BrownieNutella("Bowniezao nu", 5, "Nutella");
        BrownieDoceDeLeite brownieDoceDeLeite = new BrownieDoceDeLeite("Bowniezao do", 4, "Doce de Leite");
        BrownieCafe brownieCafe = new BrownieCafe("Bowniezao coffe", 5, "Cafe");

        Comprador comprador = new Comprador("Matheus Julidori", 100);

        brownieNutella.mostraInfo();
        brownieNutella.addNutella();
        //brownieNutella.mostraInfo();
        brownieCafe.mostraInfo();
        brownieCafe.addCafe();
        //brownieCafe.mostraInfo();
        brownieDoceDeLeite.mostraInfo();
        brownieDoceDeLeite.addDoceDeLeite();
        //brownieDoceDeLeite.mostraInfo();

        brownieNutella.addCarrinhoDeCompras();
        brownieCafe.addCarrinhoDeCompras();
        brownieDoceDeLeite.addCarrinhoDeCompras();

        comprador.efetuarCompra(brownieCafe);
        comprador.efetuarCompra(brownieNutella);
    }
}
