package br.com.cyberfestival.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Bilheteria {
    
    Map<String, Ingresso> ingressosVendidos = new HashMap<>();


    public void venderIngresso(Ingresso ingresso)
    {

        if(ingressosVendidos.containsKey(ingresso.getCodigoId()) || ingresso == null)
        {

            throw new IngressoInvalidoException("Erro de Segurança: Ingresso já validado ou código duplicado!");

        }

    }

    public double calcularReceitaVIP()
    {

        double receitaVIP = ingressosVendidos.stream()
            .filter(ingressosVendidos -> ingressosVendidos.getTipo() == "VIP")
            .mapToDouble(Double::valor)
            .sum();

        return 0.0;

    }

}
