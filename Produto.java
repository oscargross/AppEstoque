
class Produto {
    private String marca = "";
    private String produto;
    private Double peso;
    private Double valorNota;
    private Local local;








    public String getMarca() {
        return marca;
    }
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local2) {
        this.local = local2;
    }

    public Double getValorNota() {
        return valorNota;
    }

    public void setValorNota(Double valorNota) {
        this.valorNota = valorNota;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }




}