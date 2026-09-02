package br.com.cyberfestival.model;

//Classe dos ingressos
public class Ingresso {
    
    //Atributos de ingresso
    private String codigoId;
    private String tipo;
    private double valor;

    //Construtor para salvar os dados de ingresso
    public Ingresso(String codigoId, String tipo, double valor)
    {

        this.codigoId = codigoId;
        this.tipo = tipo;
        this.valor = valor;

    }


    //Metodos que retornam os valores de um ingresso
    public String getCodigoId()
    {

        return codigoId;

    }

    public String getTipo()
    {

        return tipo;

    }

    public double getValor()
    {

        return valor;

    }

}
