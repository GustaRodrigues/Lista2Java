package nencapsulado;

import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        testeIO();
    }
    
    public static void teste(){
        
        Lampada lampada1 = new Lampada();
        lampada1.preco = 10.2f;
        lampada1.estaAcesa = false;
        
        Empregado empregado1 = new Empregado();
        empregado1.id = 1;
        empregado1.primeiroNome = "Gustavo";
        empregado1.sobrenome = "Rodrigues";
        empregado1.salario = 1000f;
        
        Botao botao1 = new Botao();
        botao1.altura = 2f;
        botao1.largura = 4f;
        botao1.formato = 2;
        botao1.posX = 5.3f;
        botao1.posY = 7.3f;
        botao1.texto = "Clique Aqui!!!!";
    
    }
    
    public static void testeIO(){
        Scanner sc = new Scanner(System.in);
        
        Lampada lp = new Lampada();
        
        System.out.println("Qual o preço da lâmpada?");
        lp.preco = sc.nextFloat();
        
        System.out.println("A lâmpada está acesa?");
        lp.estaAcesa = sc.nextBoolean();
        
        System.out.println("O preço é: "+lp.preco);
        System.out.println("A lâmpada está acesa? "+lp.estaAcesa);
        
        Empregado ep1 = new Empregado();
        
        System.out.print("Digite o primeiro nome: ");
        ep1.primeiroNome = sc.next();
        
        System.out.print("Digite o sobrenome: ");
        ep1.sobrenome = sc.next();
        
        System.out.print("ID: ");
        ep1.id = sc.nextInt();
        
        System.out.print("Informe o salário: ");
        ep1.salario = sc.nextFloat();
        
        System.out.println("Nome do funcionário: " + ep1.primeiroNome + " " + ep1.sobrenome);
        System.out.println("ID do funcionário: " + ep1.id);
        System.out.println("Salário do funcionário: " + ep1.salario);
        
        Botao btn = new Botao();
        
        System.out.print("Posição X: ");
        btn.posX = sc.nextFloat();
        
        System.out.print("Posição Y: ");
        btn.posY = sc.nextFloat();
        
        System.out.print("Largura do botão: ");
        btn.largura = sc.nextFloat();
        
        System.out.print("Altura do botão: ");
        btn.altura = sc.nextFloat();
        
        System.out.print("Texto do botão: ");
        btn.texto = sc.next();
        
        System.out.print("Formato do botão: ");
        btn.formato = sc.nextInt();
        
        System.out.println("Posição X do botão: " + btn.posX);
        System.out.println("Posição Y do botão: " + btn.posY);
        System.out.println("Largura do botão: " + btn.largura);
        System.out.println("Altura do botão: " + btn.altura);
        System.out.println("Texto do botão: " + btn.texto);
        System.out.println("Formato do botão: " + btn.formato);
        
    }
    
     public static void testeIOConstrutor(){
        Scanner sc = new Scanner(System.in);
        
        float preco, salario, posX, posY, largura, altura;
        boolean estaAcesa;      
        int id, formato;
        String primeiroNome, sobrenome, texto;
        
        System.out.println("Qual o preço da lâmpada?");
        preco = sc.nextFloat();
        
        System.out.println("A lâmpada está acesa?");
        estaAcesa = sc.nextBoolean();
        
        Lampada lp = new Lampada(preco, estaAcesa);
        
        System.out.print("Digite o primeiro nome: ");
        primeiroNome = sc.next();
        
        System.out.print("Digite o sobrenome: ");
        sobrenome = sc.next();
        
        System.out.print("ID: ");
        id = sc.nextInt();
        
        System.out.print("Informe o salário: ");
        salario = sc.nextFloat();
        
        Empregado ep1 = new Empregado(id, primeiroNome, sobrenome, salario);
        
        System.out.print("Posição X: ");
        posX = sc.nextFloat();
        
        System.out.print("Posição Y: ");
        posY = sc.nextFloat();
        
        System.out.print("Largura do botão: ");
        largura = sc.nextFloat();
        
        System.out.print("Altura do botão: ");
        altura = sc.nextFloat();
        
        System.out.print("Texto do botão: ");
        texto = sc.next();
        
        System.out.print("Formato do botão: ");
        formato = sc.nextInt();
        
        Botao btn = new Botao(posX, posY, largura, altura, texto, formato);
        
        System.out.println("\n EXIBIÇÃO");
        
        System.out.println("O preço é: "+lp.preco);
        System.out.println("A lâmpada está acesa? "+lp.estaAcesa);
        
        System.out.println("Nome do funcionário: " + ep1.primeiroNome + " " + ep1.sobrenome);
        System.out.println("ID do funcionário: " + ep1.id);
        System.out.println("Salário do funcionário: " + ep1.salario);
        
        System.out.println("Posição X do botão: " + btn.posX);
        System.out.println("Posição Y do botão: " + btn.posY);
        System.out.println("Largura do botão: " + btn.largura);
        System.out.println("Altura do botão: " + btn.altura);
        System.out.println("Texto do botão: " + btn.texto);
        System.out.println("Formato do botão: " + btn.formato);
        
        
     }
    
}
