public class Hamburguer {

    public String nome;
    public Double valor;
    public Boolean artesanal;

    public Double Somar(){

        return((artesanal)? valor + 8 : valor);

    }
}
