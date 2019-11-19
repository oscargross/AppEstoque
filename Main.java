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

        Cadastro cadastro = new Cadastro();
        //Categoria categoria = new Categoria();
        cadastro.cadastroFornecedor();
        //cadastro.listaFornecedores();
        //cadastro.cadastrarProduto();
        String nome = "a";
        categoria.cadastrarCategoria(nome);



        categoria.listaCategorias().add(subcategoria);

        Categoria categoria1 = cadastro.cadastrarCategoria("Bebidas");
        Categoria categoria2 = cadastro.cadastrarCategoria("Enlatados");
        Categoria categoria3 = cadastro.cadastrarCategoria("Embutidos");

        cadastro.cadastrarSubcategoria("Refrigerante", categoria1);
        cadastro.cadastrarSubcategoria("Vodca", categoria1);
        cadastro.cadastrarSubcategoria("Vinho", categoria1);
        
        cadastro.cadastrarSubcategoria("Milho", categoria2);
        cadastro.cadastrarSubcategoria("Ervilha", categoria2);
        cadastro.cadastrarSubcategoria("Sardinha", categoria2);

        cadastro.cadastrarSubcategoria("Salame", categoria3);
        cadastro.cadastrarSubcategoria("Vodcas", categoria3);
        cadastro.cadastrarSubcategoria("Vinhos", categoria3);

        cadastro.cadastrarProduto();
    }
}