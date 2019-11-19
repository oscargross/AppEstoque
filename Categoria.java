import java.util.ArrayList;

class Categoria {
    private ArrayList<Categoria> listaCategorias = new ArrayList();
    private ArrayList<Subcategoria> listaSubcategorias = new ArrayList();
    private String nome;

    public void adicionarListaSub(Subcategoria subcategoria){
        listaSubcategorias.add(subcategoria);
    }   
  
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public ArrayList<String> getListaCategorias() {
        return listaCategorias;
    }
    public void setListaCategorias(ArrayList<String> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }   
    public ArrayList<Subcategoria> getListaSubcategorias() {
        return listaSubcategorias;
    }
    public void setListaSubcategorias(ArrayList<Subcategoria> listaSubcategorias) {
        this.listaSubcategorias = listaSubcategorias;
    }

}
    
    
    