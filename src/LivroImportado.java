
public class LivroImportado extends ProdutorImportado{

    public LivroImportado(double taxaAlfandega, String codigo, String descricao, double precoCusto) {
        super(taxaAlfandega, codigo, descricao, precoCusto);
    }
    
    @Override
    public double calculaPrecoVenda(){
        return (getPrecoCusto() + getTaxaAlfandega()) * 1.15;
    }
}
