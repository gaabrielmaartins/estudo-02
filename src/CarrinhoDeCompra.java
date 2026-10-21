
public class CarrinhoDeCompra {

    private double valorTotalCarrinho;

    public double adicionaProduto(Produto p) {
        return valorTotalCarrinho += p.calculaPrecoVenda();
    }

    public double getValorTotalCarrinho() {
        return valorTotalCarrinho;
    }

}
