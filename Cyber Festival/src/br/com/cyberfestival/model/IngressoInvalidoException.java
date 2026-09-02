package br.com.cyberfestival.model;

//Classe que retorna o erro de caso um ingresso seja inválido
public class IngressoInvalidoException extends RuntimeException {
    
    //Construtor que substituí o valor da classe de Runtime Exception
    public IngressoInvalidoException()
    {

        super("\nErro de Segurança: Ingresso já validado ou código duplicado!");

    }

}
