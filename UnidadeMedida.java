import java.util.ArrayList;
//import java.util.Map;

class UnidadeMedida {
    private ArrayList<String> unidadeMedida = new ArrayList<String>();

    public void adicionarUnidade(String novaUnidade){
        unidadeMedida.add(novaUnidade);
    }    
    
    public ArrayList<String> getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(ArrayList<String> unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }





}