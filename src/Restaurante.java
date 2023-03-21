import javax.swing.*;

public class Restaurante {
    /*Uma classe Restaurante que terá um método Principal.
Criar um Menu Via JOptionPane.
Título da Tela: Informe o pedido.
1. Hamburguer
2. Pizza
3. Sair
Caso informe 1, exibir um JOptionPane pedindo o nome, logo em seguida o valor, e logo em seguida se possui borda ou não.
Caso informe 2, exibir um JOptionPane pedindo o nome, logo em seguida o valor, e logo em seguida se seria artesanal ou não.
Ao final das opções 1 ou 2, informar uma mensagem: O seu pedido ficou no valor de: <Colocar o valor do pedido>*/
    public static void main(String[] args) {

        String menu = JOptionPane.showInputDialog(null,"1.Hamburguer \n2.Pizza \n3.Sair"
        ,"Informe o pedido", JOptionPane.PLAIN_MESSAGE);

        Hamburguer hamburguer = new Hamburguer();
        Pizza pizza = new Pizza();
        
        
        int tipo = 0;

        if(menu.equals("1")){
            tipo = Integer.parseInt(JOptionPane.showInputDialog("1.Artesanal ou 2.Simples"));
            hamburguer.nome = JOptionPane.showInputDialog("Informe o código do sabor escolhido");
            
            if (tipo == 1)
                hamburguer.artesanal = true;
            else
                hamburguer.artesanal = false;
            hamburguer.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));

            JOptionPane.showMessageDialog(null,
                    "O seu pedido ficou no valor de: " + hamburguer.Somar() + " reais",
                    " Valor", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(menu.equals("2")){
            tipo = Integer.parseInt(JOptionPane.showInputDialog("1.Com Borda ou 2.Simples"));
            pizza.nome = JOptionPane.showInputDialog("Informe o código do sabor escolhido");

            if (tipo == 1)
                pizza.borda = true;
            else
                pizza.borda = false;
            pizza.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));

            JOptionPane.showMessageDialog(null,
                    "O seu pedido ficou no valor de: " + pizza.Somar() + " reais",
                    " Valor", JOptionPane.INFORMATION_MESSAGE);
        } else if (menu.equals("3")) {
            JOptionPane.showMessageDialog(null,"Operação Finalizada");
            System.exit(0);
        }
        else
            JOptionPane.showMessageDialog(null,"Operação Inválida","Erro", JOptionPane.ERROR_MESSAGE);



    }
    
}
