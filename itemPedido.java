package produto;

public class itemPedido {
    private Produto produto;
    private int qtde;
 
    public itemPedido(Produto produto, int qtde){
        this.produto = produto;
        this.qtde = qtde;
    }
    
    public int getQuantidade(){
        return qtde;
    }
    
    public void setQuantidade(int qtde){
        this.qtde = qtde;
    }
    
    public int getProduto(){
        return produto;
    }
    
    public void setProduto(int produto){
        
    }
}

    



