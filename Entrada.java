private String nome ;
    private double quantidade ;
    private double precoUnitario ;
    
    /*
     * a) um método construtor que inicialize os atributos por meio de parâmetros
     * (precoUnitario e quantidade não podem ser negativos);
     */
    
            public Mercadoria (double precoUnitario , double quantidade , String nome   ){
                   setQuantidade (quantidade );
                   setPrecoUnitario (precoUnitario);
                   setNome ( nome );
            }
            
           /*
            * b) um método modificador para cada atributo (precoUnitario e quantidade não
            * podem ser negativos);
            */ 
            
            public void setQuantidade (double  quantidade   ){
                if ( quantidade > 0) {
                    this.quantidade =quantidade  ;
                }
            }
            
            public void setPrecoUnitario (double  precoUnitario  )  {
                if ( precoUnitario > 0) {
                    this.precoUnitario =precoUnitario  ;
                } 
            }
            public void setNome (String nome) {
                 this.nome= nome ;
                }
               // c) um método de acesso para cada atributo;
             
            public String getNome () {
                return this.nome ;
            }
            public double getQuantidade () {
                return this.quantidade ;
            }
             public double getPrecoUnitario () {
                return this.precoUnitario ;
            }
            
            /*
             * d) o método dadosDaMercadoria(), que retorna uma String, a qual deve conter a
             * String ?Nome da Mercadoria: ?, seguida do conteúdo do atributo
             * nomeDaMercadoria, seguida da String ?\nQuantidade em Estoque: ?, seguida pelo
             * conteúdo do atributo quantidade, seguida pela String ?\nPreço Unitário (R$): ?,
             * seguida pelo conteúdo do atributo precoUnitario.
             */
            
                 public String  dadosDaMercadoria(){
                     String saida =" " ;
                     saida= saida+  (" Nome da Mercadoria : "  + getNome() + " \nQuantidade em Estoque: " +getQuantidade () + "\nPreço Unitário (R$): " + getPrecoUnitario () ) ;
                     
                     return saida ;
                    }
                }