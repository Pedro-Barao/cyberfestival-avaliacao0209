package br.com.cyberfestival.model;

import java.util.HashMap;
import java.util.Map;

public class Bilheteria {
    
    Map<String, Ingresso> ingressosVendidos = new HashMap<>();


    public void venderIngresso(Ingresso ingresso)
    {

        if(ingressosVendidos.containsKey(ingresso.getCodigoId()) || ingresso == null)
        {

            throw new IngressoInvalidoException("\nErro de Segurança: Ingresso já validado ou código duplicado!");

        }

        
        System.out.println("\nIngresso: " + ingresso.getCodigoId() + "\nTipo: " + ingresso.getTipo() + " | Valor: " + ingresso.getValor());

        ingressosVendidos.put(ingresso.getCodigoId(), ingresso);

    }

    public double calcularReceitaVIP()
    {

        double receitaVIP = ingressosVendidos.values().stream()
            .filter(ingressosVendidos -> ingressosVendidos.getTipo().equals("VIP"))
            .mapToDouble(Ingresso::getValor)
            .sum();

        return receitaVIP;

    }

}
