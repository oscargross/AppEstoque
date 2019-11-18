
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


    
class Cadastro{ 
    Scanner scan = new Scanner(System.in);
    ControleCadastro controle = new ControleCadastro();

    ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
    ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

    
    Cadastro(){
    }

    public void listaFornecedores(){
        for (Fornecedor a : this.listaFornecedores){
            System.out.println("Nome: "+a.getNome()+"/rCidade: "+a.getCidade()+"/rCNPJ: "+a.getCnpj()+"/n");
        }
    }
    public void cadastroFornecedor(String nome, String cnpj, String cidade){
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(nome);
        fornecedor.setCnpj(cnpj);
        fornecedor.setCidade(cidade);
        this.listaFornecedores.add(fornecedor);
        System.out.println("Fornecedor adicionado com sucesso!");

        
    }
    public void cadastroFornecedor(){
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
        while (x==0){ 
            String testeNomePro = testeAtribuicaoCorreta(texto4);        
            x = controle.verificaProdutoNome(testeNomePro, listaProdutos);
            String valor = (testeAtribuicaoCorreta(texto5));
            String marca = (testeAtribuicaoCorreta(texto6));            
            x++;
        }
        Produto produto = new Produto();
        produto.cadastrarCategoria();
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
}
    