package br.com.cyberfestival.main;

import br.com.cyberfestival.model.Bilheteria;
import br.com.cyberfestival.model.Ingresso;
import br.com.cyberfestival.model.IngressoInvalidoException;

public class Main {
    
    public static void main(String[] args)
    {

        Bilheteria bilheteria = new Bilheteria();

        Ingresso Ingresso_1 = new Ingresso("A-01", "VIP", 500.00);
        Ingresso Ingresso_2 = new Ingresso("A-02", "PISTA", 200.00);
        Ingresso Ingresso_3 = new Ingresso("A-01", "VIP", 200.00);

        try
        {

            bilheteria.venderIngresso(Ingresso_1);
            bilheteria.venderIngresso(Ingresso_2);
            bilheteria.venderIngresso(Ingresso_3);

        }

        catch (IngressoInvalidoException error)
        {

            error.getMessage();

        }

        System.out.println("\n" + bilheteria.calcularReceitaVIP());

    }

}
