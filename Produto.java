package produto;

public class Produto {
    private String nome;
    private int codigo;
    private double valor;
    public String desc;

    public Produto(int codigo, double valor, String desc){
        this.codigo = codigo;
        this.valor = valor;
        this.desc = desc;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
