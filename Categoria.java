import java.util.ArrayList;

class Categoria {
    private Subcategoria subcategoria;
    private ArrayList<Categoria> listaCategorias = new ArrayList();
    private String nome;


    public void cadastrarCategoria(String nome){
        this.subcategoria.setSucategoria(subcategoria);
        this.nome.setNome(nome);
        listaCategorias.add(novaCategoria);
    }    
    public void listaCategorias(){
        for (Categoria a : listaCategorias){
            System.out.println(a.nome);
        }
    }   
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
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
    
    
    