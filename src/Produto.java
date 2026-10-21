
public abstract class Produto {
    private String codigo;
    private String descricao;
    private double precoCusto;

    public Produto(String codigo, String descricao, double precoCusto) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    public abstract double calculaPrecoVenda();
}
