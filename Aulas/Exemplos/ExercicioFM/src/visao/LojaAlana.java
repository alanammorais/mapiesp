package visao;

import javax.swing.JOptionPane;

import model.SaudacaoFabrica;
import model.Usuario;

public class LojaAlana {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		String genero = JOptionPane.showInputDialog("Digite seu genero(m, f ou -):");
		
		SaudacaoFabrica fabrica = new SaudacaoFabrica(genero);
		
		Usuario u = fabrica.getUsuario(nome);
		//Usuario u = new Homem()
		
		JOptionPane.showMessageDialog(null, u.saudacao());
		

	}

}
;