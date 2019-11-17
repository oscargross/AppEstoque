
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


    
class Cadastro{ 
    Scanner scan = new Scanner(System.in);
    private String nomeArquivo;
    ControleCadastro controle = new ControleCadastro();

    ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
    ArrayList<Produto> listaProdutos = new ArrayList<Produto>();



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
        while (x==0){                
            
            String testeNomeFor = testeAtribuicaoCorreta(texto1);        
            x = controle.verificaFornecedorNome(testeNomeFor, listaFornecedores);

            String testeCnpjFor = testeAtribuicaoCorreta(texto2);
            x = controle.verificaFornecedorCnpj(testeCnpjFor, listaFornecedores);

            
            String testeCidadeFor = testeAtribuicaoCorreta(texto3);
            x = controle.verificaFornecedorCidade(testeCidadeFor, listaFornecedores);

            cadastroFornecedor(testeNomeFor, testeCnpjFor, testeCidadeFor);
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
            String valor = testeAtribuicaoCorreta(texto5);            
            String marca = testeAtribuicaoCorreta(texto6);
                
            gravarProduto(testeNomePro, valor, marca);
            x++;
        }
       


    }


    
    public String testeAtribuicaoCorreta(String textoAtribuicao){
     
        while (true){
            try {
                System.out.println("Digite o/a "+textoAtribuicao);
                String info = scan.next();
                return info;                              
            } catch (Exception e) {
                System.out.println("Atribuição inválida! Tente novamente");
            }

        }

    }

    
    public void gravarProduto(String nome, String valor, String marca) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            gravarArquivo.append(nome + ";"+valor + ";"+marca + ";");
            gravarArquivo.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
    public void gravarFornecedor(ArrayList<String> atribuicoesProduto2) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo);
            PrintWriter gravarArquivo = new PrintWriter(arquivo);
            gravarArquivo.append(atribuicoesProduto2 + ";");
            gravarArquivo.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }








    public void lerDados(){
        try {
            final File arquivo = new File(nomeArquivo);
            final Scanner sc = new Scanner(arquivo);

            while(sc.hasNext()){
                System.out.print(sc.nextLine()+"\n");
                /*String c1 = sc.split(";")[0];
                String c2 = sc.split(";")[1];
                String c3 = sc.split(";")[2];
                String c4 = sc.split(";")[3];
                String c5 = sc.split(";")[4];
                */
            }
            
            sc.close();
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
}
    