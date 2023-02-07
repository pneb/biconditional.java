import javax.swing.JOptionPane;

public class BiconditionalComponent {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog(null, "Enter your first statement.");
        String input2 = JOptionPane.showInputDialog(null, "Enter your second statement.");
        
        String input1Reversed = new StringBuffer(input1).reverse().toString();
        String input2Reversed = new StringBuffer(input2).reverse().toString();
        
        String output = input1 + " if and only if " + input2 + " is " + input1Reversed + " if and only if " + input2Reversed;
        
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }
}
