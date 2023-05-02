package produto;


public class Pedido {
    private itemPedido itens[];
    private double valorTotal;
    private int index;
    
    public Pedido(){
        itens = new itemPedido[30];
        valorTotal = 0;
        index = 0;
    }
    
    public void adicionarItem(itemPedido item){
        valorTotal += item.getValor();
        itens[index++] = item;
        
    }
}
