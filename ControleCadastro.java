import java.util.ArrayList;
import java.util.Scanner;

class ControleCadastro{
    Scanner scan = new Scanner(System.in);
    
    ControleCadastro(){

    }

    public int verificaProdutoNome(String nomeProduto, ArrayList<Produto> listaProdutos){
        for(Produto temp : listaProdutos){                   
            if (nomeProduto.equals(temp.getNome())){
                System.out.println("Nome: "+temp.getNome()+"/nConfirme se este é o produto digitando 1: ");
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
            if (nomeFornecedor.equals(fornecedorTemp.getNome())){
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
            if (cnpfFornecedor.equals(fornecedorTemp.getCnpj())){
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
            if (cidadeFornecedor.equals(fornecedorTemp.getCidade())){
                if(confirmaFornecedorCadastrado(fornecedorTemp)){
                    System.out.println("Fornecedor já cadastrado!");

                    return 1;
                }
            }        
        }
        return 0;
    }

    public boolean confirmaFornecedorCadastrado(Fornecedor temp){
        System.out.println("Nome: "+temp.getNome()+"\nCNPJ: "+temp.getCnpj()+"\nCidade: "+temp.getCidade()+"\nConfirme se este é o fornecedor digitando 1: ");
        int a = scan.nextInt();
        if(a == 1){
            return true; 
        }
        return false;      


    }
	   
    
}