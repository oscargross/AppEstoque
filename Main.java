/*
Classes:
Produto
Local
Transacoes
Conferencia

O import não carrega o sistema Java mais que o normal - apenasda o acesso ao outro arqivo de outro diretorio

import java.lang.import java.lang.

Aspas duplas em strings vai para um local especial na memoria, toda vez que a variavel é chamada, ela apontara para o objeto string que está na memoria
new string leva diretamente memoria

Apenas ojeto pode ser Null, não primitivas

import java.util.ArrayList;
import java.util.Scanner;
*/
class Main {
    public static void main(String[] args) {
        Transacoes transacoes = new Transacoes();

        Cadastro cadastro = new Cadastro();
        

        cadastro.cadastroFornecedor("Alimentos SA", "00 000 000/0001-00", "Passo Fundo");
        cadastro.cadastroFornecedor("Sadia", "11 111 111/0001-11", "POA");
        cadastro.adicionarDepartamento("Refrigeradores -5C");
        cadastro.adicionarDepartamento("Refrigeradores -10");
        cadastro.adicionarDepartamento("Refrigeradores 0C");
        cadastro.adicionarPrateleira("A1");
        cadastro.adicionarPrateleira("A2");
        cadastro.adicionarPrateleira("B1");
        cadastro.adicionarPrateleira("B2");
        cadastro.adicionarPrateleira("B3");
        cadastro.adicionarPrateleira("B4");
        cadastro.adicionarPrateleira("C1");
        cadastro.adicionarUnidade("Kg");
        cadastro.adicionarUnidade("g");
        cadastro.adicionarUnidade("ml");
        cadastro.adicionarUnidade("L");



        Categoria categoria1 = cadastro.cadastrarCategoria ("Bebidas");
        Categoria categoria2 = cadastro.cadastrarCategoria ("Enlatados");
        Categoria categoria3 = cadastro.cadastrarCategoria ("Embutidos");

        cadastro.cadastrarSubcategoria("Refrigerante", categoria1);
        cadastro.cadastrarSubcategoria("Vodca", categoria1);
        cadastro.cadastrarSubcategoria("Vinho", categoria1);
        
        cadastro.cadastrarSubcategoria("Milho", categoria2);
        cadastro.cadastrarSubcategoria("Ervilha", categoria2);
        cadastro.cadastrarSubcategoria("Sardinha", categoria2);

        cadastro.cadastrarSubcategoria("Salame", categoria3);
        cadastro.cadastrarSubcategoria("Vodcas", categoria3);
        cadastro.cadastrarSubcategoria("Vinhos", categoria3);
        cadastro.listarCategorias();
        cadastro.listarSubcategorias();


        Categoria categoria = cadastro.escolherCategorias(); 
        Subcategoria subcategoria = cadastro.escolherSubcategorias(categoria);


        cadastro.cadastroFornecedor2();
        cadastro.listaFornecedores();

        
                                //  Nome - valor de compra - taxa de ganho
        cadastro.cadastrarProduto("Cola 2L", 2.5 , "Coca Cola", 0.4);
        





    }
}