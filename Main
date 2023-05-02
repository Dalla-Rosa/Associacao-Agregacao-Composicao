package produto;

public class Main {
    public static void main(String[] args){
        Produto cha = new Produto(1, 3.00, "sache");
        Produto cafe = new Produto(2, 10.00, "garrafa de cafe");
        Produto doritos = new Produto(3, 12.00, "pacote de doritos");
        
        itemPedido qtdeCha = new itemPedido(cha,10);
        itemPedido qtdeCafe = new itemPedido(cafe, 20);
        itemPedido qtdeDoritos = new itemPedido(doritos, 5);
        
        Pedido bernardo = new Pedido();
        
        bernardo.adicionarItem(qtdeCha);
        bernardo.adicionarItem(qtdeCafe);
        bernardo.adicionarItem(qtdeDoritos);
        
        System.out.print("Pedidos");
        System.out.print(valorTotal());
        
        
    }
}
