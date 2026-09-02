package br.com.cyberfestival.model;

import java.util.HashMap;
import java.util.Map;

//Classe da bilheteria
public class Bilheteria {
    
    //Map que guarda todos os ingressos
    Map<String, Ingresso> ingressosVendidos = new HashMap<>();


    //Método que vender e registra a venda dos ingressos
    public void venderIngresso(Ingresso ingresso)
    {

        //Validação  do ingresso: Se ele é existente
        if(ingresso == null)
        {

            throw new IllegalArgumentException("O ingresso não pode ser nulo.");

        }

        //Validação  do ingresso: Se ele é válido
        if(ingressosVendidos.containsKey(ingresso.getCodigoId()) || ingresso == null)
        {

            throw new IngressoInvalidoException();

        }

        //Coloca dentro do Map os valores
        ingressosVendidos.put(ingresso.getCodigoId(), ingresso);

        //Comprovação de ingresso salvo
        System.out.println("\nIngresso: " + ingresso.getCodigoId() + "\nTipo: " + ingresso.getTipo() + " | Valor: " + ingresso.getValor());

    }

    //
    public double calcularReceitaVIP()
    {

        double receitaVIP = ingressosVendidos.values().stream()
            .filter(ingressosVendidos -> ingressosVendidos.getTipo().equals("VIP"))
            .mapToDouble(Ingresso::getValor)
            .sum();

        return receitaVIP;

    }

}
