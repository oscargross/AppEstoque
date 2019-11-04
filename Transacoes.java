
class Transacoes {
    private int quantidadeEstoque;
    private int disponivelEstoque;
    private int quantidadePerda;

    
    public void entradaProduto(String nomeProduto, String marca, Double peso, Double valorNota, String prateleira, String Departamento, String dataChegada, String dataSaida, int quantidade, int quantidadePerda) {
        conferirProdutoEstoque(nomeProduto, marca);

        Produto produto = new Produto();
        Local local = new Local();
        Conferencia historico = new Conferencia();

        
        local.setDepartamento(departamento);
        local.setPrateleira(prateleira);
        produto.setMarca(marca);
        produto.setProduto(nomeProduto);
        produto.setPeso(peso);
        produto.setValorNota(valorNota);
        produto.setLocal(local);
        historico.setDataChegada(dataChegada);
        historico.setDataSaida(dataSaida);

        acrescentarQuantidade(produto, quantidade);        
        historico.movimentacao(produto);
       
    }

    public void conferirProdutoEstoque(String nomeProduto, String marca){
         



    }




    public void acrescentarQuantidade(Produto produto, int quantidade){
        this.quantidadeEstoque+=quantidade;
    }






    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public int getQuantidadePerda() {
        return quantidadePerda;
    }

    public void setQuantidadePerda(int quantidadePerda) {
        this.quantidadePerda = quantidadePerda;
    }

    public int getDisponivelEstoque() {
        return disponivelEstoque;
    }

    public void setDisponivelEstoque(int disponivelEstoque) {
        this.disponivelEstoque = disponivelEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    




}