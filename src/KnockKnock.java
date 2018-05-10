import javax.swing.JOptionPane;

public class KnockKnock {
public static void main(String[] args) {
	
  JOptionPane.showMessageDialog(null, "Knock Knock");
  String answer = JOptionPane.showInputDialog(null, "Who's There?");
  String who = JOptionPane.showInputDialog(answer + "who?");
  
  
  
  
}
}
