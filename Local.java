import java.util.ArrayList;

class Local {
    private ArrayList<String> listaPrateleiras = new ArrayList();
    private ArrayList<String> listaDepartamentos = new ArrayList();

    public void adicionarDepartamento(String novoDepartamente) {
        listaDepartamentos.add(novoDepartamente);
    }
    public void adicionarPrateleira(String novaPrateleira) {
        listaPrateleiras.add(novaPrateleira);
    }
    public ArrayList<String> getListaPrateleiras() {
        return listaPrateleiras;
    }

    public void setListaPrateleiras(ArrayList<String> listaPrateleiras) {
        this.listaPrateleiras = listaPrateleiras;
    }

    public ArrayList<String> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public void setListaDepartamentos(ArrayList<String> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }
}