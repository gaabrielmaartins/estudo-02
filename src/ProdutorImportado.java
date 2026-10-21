
public abstract class ProdutorImportado extends Produto {

    private double taxaAlfandega;

    public ProdutorImportado(double taxaAlfandega, String codigo, String descricao, double precoCusto) {
        super(codigo, descricao, precoCusto);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double getTaxaAlfandega() {
        return taxaAlfandega;
    }

}
