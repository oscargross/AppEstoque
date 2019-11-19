import java.util.ArrayList;

class Categoria {
    ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
    ArrayList<Subcategoria> listaSubcategorias = new ArrayList<Subcategoria>();
    private String nome;

    public void adicionarListaCategorias(Categoria categoria) {
        listaCategorias.add(categoria);
    }

    public void adicionarListaSub(Subcategoria subcategoria) {
        listaSubcategorias.add(subcategoria);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /*public ArrayList<Subcategoria> getListaSubcategorias() {
        return listaSubcategorias;
    }

    public void setListaSubcategorias(ArrayList<Subcategoria> listaSubcategorias) {
        this.listaSubcategorias = listaSubcategorias;
    }   

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
    */
    

}
    
    
    