package nencapsulado;

public class Empregado {
    
    public int id;
    public String primeiroNome;
    public String sobrenome;
    public float salario;
    
    public Empregado(){}
    
    public Empregado(int id, String primeiroNome, String sobrenome, float salario){
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salario= salario;
    }
    
}
