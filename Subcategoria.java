import java.util.ArrayList;

class Subcategoria {
    private String modeloItem;
    private ArrayList<String> listaSubcategorias = new ArrayList();

    
    
    
    
    
    public void inserirSubcategoria(String novaSubcategoria){
        this.listaSubcategorias.add(novaSubcategoria);
    }

    public ArrayList<String> getListaSubcategorias() {
        return listaSubcategorias;
    }

    public void setlistaSubcategorias(ArrayList<String> listaSubcategorias) {
        this.listaSubcategorias = listaSubcategorias;
    }

    public String getModeloItem() {
        return modeloItem;
    }

    public void setModeloItem(String modeloItem) {
        this.modeloItem = modeloItem;
    }
      
}