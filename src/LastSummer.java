import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, answer + " I know what you did last summer");
}
}
