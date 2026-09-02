package br.com.cyberfestival.main;

import br.com.cyberfestival.model.Bilheteria;
import br.com.cyberfestival.model.Ingresso;
import br.com.cyberfestival.model.IngressoInvalidoException;

public class Main {
    
    public static void main(String[] args)
    {

        //Instanciação da Bilheteria
        Bilheteria bilheteria = new Bilheteria();

        //Criação dos ingressos
        Ingresso Ingresso_1 = new Ingresso("A-01", "VIP", 500.00);
        Ingresso Ingresso_2 = new Ingresso("A-02", "PISTA", 200.00);
        Ingresso Ingresso_3 = new Ingresso("A-01", "VIP", 200.00);


        //Validação dos ingressos
        try
        {

            bilheteria.venderIngresso(Ingresso_1);
            bilheteria.venderIngresso(Ingresso_2);
            bilheteria.venderIngresso(Ingresso_3);

        }

        catch (IngressoInvalidoException error)
        {

            System.out.println(error.getMessage());

        }

        //Retorando o valor do calculo dos VIP
        System.out.println("\n" + bilheteria.calcularReceitaVIP());

    }

}
