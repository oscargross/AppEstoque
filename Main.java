/*
Classes:
Produto
Local
Transacoes
Conferencia

*/
import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Transacoes produto = new Transacoes();
        //Marca - nome produto - peso unitario , valor nota , prateleira , departamento, datachegada, datasaida, quantidade, perdas
        produto.entradaProduto("N","pneu" , 1.4, 1000.0 , "A1", "descartaveis", "04/11" , null,  10 , 0);



        
    }
}