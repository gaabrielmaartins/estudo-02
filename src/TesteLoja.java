
public class TesteLoja {
    public static void main(String[] args) {
        EletronicoImportado ei = new EletronicoImportado(10.50, "123132", "Esse é um produto, de fato", 15.50);
        LivroImportado li = new LivroImportado(15.50, "321321", "Esse é um livro, de fato", 15.50);
        
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        
        carrinho.adicionaProduto(li);
        carrinho.adicionaProduto(ei);
        
        System.out.println(carrinho.getValorTotalCarrinho());
    }
}
