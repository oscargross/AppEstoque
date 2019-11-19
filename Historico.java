import java.util.ArrayList;

class Historico{
    private String dataChegada;
    private String dataSaida;
    public ArrayList<Produto> historicoChegadaESaida = new ArrayList<Produto>();

    
    
    public void movimentacao(Produto produto){
        historicoChegadaESaida.add(produto);
    }

    public String getDataSaida() {
        return dataSaida;  
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

}