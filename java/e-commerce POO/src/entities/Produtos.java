package entities;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private String nome;
    private double preco;
    private int qtde;
    private String codigo;



    public Produtos(String nome, double preco, int qtde, String codigo) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
        this.codigo = codigo;
    }
    public Produtos() {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtde() {
        return qtde;
    }
    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int remover(int valor) {
        if (valor<= this.qtde) {
           return this.qtde -= valor;
        }else {
            System.out.println("Quantidade Indisponivel!");
        }
        return this.qtde;}
    

    public ArrayList<Produtos> preencherListaProduto(){
        ArrayList<Produtos> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produtos("Teclado ",40.0, 10, " G4-1"));
        listaProdutos.add(new Produtos("Mouse   ",20.0, 10, " G4-2"));
        listaProdutos.add(new Produtos("Cadeira ",500.0, 10, " G4-3"));
        listaProdutos.add(new Produtos("Gabinete ",400.0, 10, " G4-4"));
        listaProdutos.add(new Produtos("Memoria ram",45.0, 10, " G4-5"));
        listaProdutos.add(new Produtos("Monitor ",600.0, 10, " G4-6"));
        listaProdutos.add(new Produtos("Headset  ",40.0, 10, " G4-7"));
        listaProdutos.add(new Produtos("SuporteNote",80.0, 10, " G4-8"));
        listaProdutos.add(new Produtos("Mousepad ",10.0, 10, " G4-9"));
        listaProdutos.add(new Produtos("Notebook ",2000.0, 10, " G4-10"));


        return listaProdutos;

    }
    public ArrayList<Produtos> preencherCarrinhoDeCompras(){
    	ArrayList<Produtos> carrinhoDeCompras = new ArrayList<>();
    	
    	return carrinhoDeCompras;
    }

}
