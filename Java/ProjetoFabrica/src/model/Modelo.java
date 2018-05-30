package model;
public abstract class Modelo {
    //Atributos
    protected String marca;
    protected String geracao;
    protected String modelo;
    protected String tipo;
    protected int poltrona;
    
    //Construtor
    public Modelo() {}
    
    //Getters e Setters
    public String getMarca() {return marca;}
    public String getGeracao() {return geracao;}
    public String getModelo() {return modelo;}
    public String getTipo() {return tipo;}
    public int getPoltrona() {return poltrona;}
}
