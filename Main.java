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
        cadastro.setNomeArquivo("step1.txt");
        cadastro.cadastroFornecedor();
        cadastro.lerDados();




    }
}