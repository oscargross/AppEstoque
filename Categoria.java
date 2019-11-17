import java.util.ArrayList;

class Categoria {
    private Subcategoria Subcategoria;
    private ArrayList<String> listaCategorias = new ArrayList();

    
    
    
    
    
    
    
    public void inserirCategoria(String novaCategoria){
        this.listaCategorias.add(novaCategoria);
    }

    public Subcategoria getSubcategoria() {
        return Subcategoria;
    }

    public ArrayList<String> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<String> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public void setSubcategoria(Subcategoria subcategoria) {
        this.Subcategoria = subcategoria;
    }

}
    
    
    