package extra;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String input= JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, input+(" I know that you ran last summer."));
}
}
