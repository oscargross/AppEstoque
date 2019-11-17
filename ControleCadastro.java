import java.util.ArrayList;
import java.util.Scanner;

class ControleCadastro{
    Scanner scan = new Scanner(System.in);

    public int verificaProdutoNome(String nomeProduto, ArrayList<Produto> listaProdutos){
        for(Produto produtoTemp : listaProdutos){                   
            if (nomeProduto==produtoTemp.getNome()){
                System.out.println(produtoTemp.toString()+"/nConfirme se este é o fornecedor digitando 1: ");
                String confirmar = scan.next();
                if (confirmar == "1"){
                    return 1; 
                }else{
                    return 0;
                }                  
            }        
        }
        return 0;
    }
    

    public int verificaFornecedorNome(String nomeFornecedor, ArrayList<Fornecedor> listaFornecedores){
        for(Fornecedor fornecedorTemp : listaFornecedores){                   
            if (nomeFornecedor==fornecedorTemp.getNome()){
                if(confirmaFornecedorCadastrado(fornecedorTemp)){
                    System.out.println("Fornecedor já cadastrado!");
                    return 1;
                }
            }        
        }
        return 0;
    }
    public int verificaFornecedorCnpj(String cnpfFornecedor, ArrayList<Fornecedor> listaFornecedores){
        for(Fornecedor fornecedorTemp : listaFornecedores){                   
            if (cnpfFornecedor==fornecedorTemp.getCnpj()){
                if(confirmaFornecedorCadastrado(fornecedorTemp)){
                    System.out.println("Fornecedor já cadastrado!");
                    return 1;
                }
            }        
        }
        return 0;
    }
    public int verificaFornecedorCidade(String cidadeFornecedor, ArrayList<Fornecedor> listaFornecedores){
        for(Fornecedor fornecedorTemp : listaFornecedores){                   
            if (cidadeFornecedor==fornecedorTemp.getCidade()){
                if(confirmaFornecedorCadastrado(fornecedorTemp)){
                    System.out.println("Fornecedor já cadastrado!");

                    return 1;
                }
            }        
        }
        return 0;
    }

    public boolean confirmaFornecedorCadastrado(Fornecedor temp){
        System.out.println(temp.toString()+"/nConfirme se este é o fornecedor digitando 1: ");
        String confirmar = scan.next();
        if (confirmar == "1"){
            return true; 
        }else{
            return false;
        }      


    }
	   
    
}