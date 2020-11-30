package modelo;
import java.util.*;

public class Pedido {
	
         private Set<String> dentroDaCaixa = new HashSet<String>();
         private Set<String> foraDaCaixa = new HashSet<String>();

         public void adicionarDentroDaCaixa(String item) {
                  dentroDaCaixa.add(item);
         }
         public void adicionarForaDaCaixa(String item) {
                  foraDaCaixa.add(item);
         }
         public String toString() {
                  StringBuffer buffer = new StringBuffer();
                  buffer.append("Seu pedido:\n");
                  buffer.append("Dentro da caixa:\n");
                  for (String item : dentroDaCaixa)
                           buffer.append("\t" + item + "\n");
                  buffer.append("Fora da caixa:\n");
                  
                  for (String item : foraDaCaixa)
                           buffer.append("\t" + item + "\n");
                  buffer.append("\nTenha um bom dia!\n\n");
                  
                  return buffer.toString();
         }
}
