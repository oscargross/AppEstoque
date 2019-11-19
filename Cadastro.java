
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class Cadastro{ 
    Scanner scan = new Scanner(System.in);
    ControleCadastro controle = new ControleCadastro();
    Categoria acessoCategoria = new Categoria();
    Local local = new Local();
    UnidadeMedida unidade = new UnidadeMedida();


    ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
    ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    public void cadastrarProduto(String nome, double valorEntrada, String marca, Double taxa) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setMarca(marca);
        produto.setValor(cadastrarValores(taxa , valorEntrada));
        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso");

	}

    public void adicionarDepartamento(String novoDepartamente){
        local.adicionarDepartamento(novoDepartamente);
    }
    
    public void adicionarPrateleira(String novaPrateleira){
        local.adicionarPrateleira(novaPrateleira);
    }
    
    public void adicionarUnidade(String novaUnidade){
        unidade.adicionarUnidade(novaUnidade);
    }

    public Valor cadastrarValores(Double taxa, Double valorEntrada){
        Valor valor = new Valor();
        valor.setTaxaGanho(taxa);
        valor.setValorEntrada(valorEntrada);
        valor.setValorSaida(valor.novoValor());
        return valor;
    }

    Cadastro(){
    }

    public void listarSubcategorias(){
        int j = acessoCategoria.listaSubcategorias.size();
        for(int i =0; i< j ; i++){
            System.out.println((i+1) + " - "+acessoCategoria.listaSubcategorias.get(i).getNome());
        }

    }

    public void listarCategorias(){
        int j = acessoCategoria.listaCategorias.size();
        for(int i =0; i< j ; i++){
            System.out.println((i+1) + " - "+acessoCategoria.listaCategorias.get(i).getNome());
        }
        //System.out.println(j);
        //System.out.println(acessoCategoria.listaCategorias.getNome());


    }

    public Categoria cadastrarCategoria(String nome) {
	    Categoria categoria = new Categoria();
        categoria.setNome(nome);
        acessoCategoria.adicionarListaCategorias(categoria); 
        System.out.println(nome);
        int i = 0;

        System.out.println(acessoCategoria.listaCategorias.get(i).getNome());
        i++;
        return categoria;
    }

    public void cadastrarSubcategoria(String nome, Categoria categoria1) {
	    Subcategoria subcategoria = new Subcategoria();
        subcategoria.setNome(nome);
        acessoCategoria.adicionarListaSub(subcategoria);
    }

    public Categoria escolherCategorias(){
        int j = acessoCategoria.listaCategorias.size();
        int opcao=0;
        while(true){
                
            try {
                listarCategorias();
                System.out.println("Digite o valor correspondente a categoria desejada");
                opcao = scan.nextInt();            
            }catch(Exception e){
                //System.out.println("Valor inadequado, tente novamente");
                System.out.println("Valor inadequado, tente novamente");
            }
            if (opcao > j){
                System.out.println("Valor inadequado, tente novamente");
            }else{
                break;
            }
        }
        return acessoCategoria.listaCategorias.get(opcao);
    }

    public Subcategoria escolherSubcategorias(Categoria categoria){
        int j = acessoCategoria.listaSubcategorias.size();
        int opcao=0;
        while(true){                
            try {
                listarSubcategorias();
                System.out.println("Digite o valor correspondente a Subcategoria desejada");
                opcao = scan.nextInt();
            
            }catch(Exception e){
                System.out.println("Valor inadequado, tente novamente");
            }
            if (opcao > j){
                System.out.println("Valor inadequado, tente novamente");
            }else{
                break;
            }
        }
        return acessoCategoria.listaSubcategorias.get(opcao);
    }
    
    public void listaFornecedores(){
        for (Fornecedor a : this.listaFornecedores){
            int i = 1;
            System.out.println(i + "Nome: "+a.getNome()+"\rCidade: "+a.getCidade()+"\rCNPJ: "+a.getCnpj()+"/n");
            i++;
        }
    }
    
    public void cadastroFornecedor(String nome, String cnpj, String cidade){
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(nome);
        fornecedor.setCnpj(cnpj);
        fornecedor.setCidade(cidade);
        listaFornecedores.add(fornecedor);        
    }
    
    public void cadastroFornecedor2(){
        final String texto1=("nome do Fornecedor");
        final String texto2=("CNPJ do Fornecedor");
        final String texto3=("cidade do Fornecedor");
        int x= 0;
        while(x==0){
            if (x==0){                
                
                String testeNomeFor = testeAtribuicaoCorreta(texto1);        
                x = controle.verificaFornecedorNome(testeNomeFor, listaFornecedores);
                if (x==0){  
                    String testeCnpjFor = testeAtribuicaoCorreta(texto2);
                    x = controle.verificaFornecedorCnpj(testeCnpjFor, listaFornecedores);
                    if (x==0){ 
                        String testeCidadeFor = testeAtribuicaoCorreta(texto3);
                        x = controle.verificaFornecedorCidade(testeCidadeFor, listaFornecedores);
                        if (x==0){ 

                            cadastroFornecedor(testeNomeFor, testeCnpjFor, testeCidadeFor);
                            System.out.println("Fornecedor adicionado com sucesso!");

                        }
                    }
                }
            }
            System.out.println("Deseja cadastrar mais Fornecedores? /n Digite 0 para sim.");
            x=scan.nextInt();
        }
    }
    
    public void cadastrarProduto(){
        final String texto4=("nome do produto");
        final String texto5=("valor de entrada");
        final String texto6=("marca do produto");
        int x = 0;
        String valor;
        String marca;
        while (x==0){ 
            String testeNomePro = testeAtribuicaoCorreta(texto4);        
            x = controle.verificaProdutoNome(testeNomePro, listaProdutos);
            valor = (testeAtribuicaoCorreta(texto5));
            marca = (testeAtribuicaoCorreta(texto6));            
            x++;
        }
        
        System.out.println("Digite o numero correspondente ao fornecedor:");
        listaFornecedores();
        int opcao = scan.nextInt();
        Fornecedor fornecedorEscolhido = new Fornecedor();
        fornecedorEscolhido = listaFornecedores.get(opcao-1);

        System.out.println("Digite o numero correspondente ao Local:");


    }
    
    public String testeAtribuicaoCorreta(String textoAtribuicao){
        String info;
        while (true){
            try {
                System.out.println("Digite o/a "+textoAtribuicao);
                info = scan.next();
                break;
            } catch (Exception e) {
                System.out.println("Atribuição inválida! Tente novamente");
            }
        }     
        return info;        
    }

	public void cadastrarProduto(String string, double d, String string2, double e) {
	}
		
}
    