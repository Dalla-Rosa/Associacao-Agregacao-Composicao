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
    
    public Produto getProduto(){
        return produto;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public double getValor(){
        return produto.getValor() * qtde;
        
    }
}

    


