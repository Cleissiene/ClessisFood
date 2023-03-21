/*Uma classe Pizza, onde nessa classe teremos:
Atributos: nome, valor e se possui borda.
Um método que calcula e retorna o valor da pizza.
Caso tenha borda terá um acréscimo de 5 reais.
Um método que retorna o nome da pizza
*/

public class Pizza {

    public String nome;
    public Double valor;
    public Boolean borda;

  public Double Somar(){
      return((borda) ?  valor + 5 :  valor);

  }

}
