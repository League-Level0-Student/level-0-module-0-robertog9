import javax.swing.JOptionPane;

public class EverythingisAwsome {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What do you like?");
	JOptionPane.showMessageDialog(null, answer +" is awesome");
}
}
