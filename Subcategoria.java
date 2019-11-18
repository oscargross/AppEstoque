import java.util.ArrayList;

class Subcategoria {
    private String modeloItem;
    private ArrayList<String> listaSubcategorias = new ArrayList();
    private String nome;

    public void cadastrarSubcategoria(String nome){
        this.nome.setNome(nome);
        listaSubcategorias.add(subcategoria);
    }


    
    public void listaCategorias(){
        for (Categoria a : listaCategorias){
            System.out.println(a.getNome());
        }
    }







    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
    
    
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