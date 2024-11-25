import javax.swing.JOptionPane;

public class GuiIntro {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what's your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you ?"));
        float height=Float.parseFloat(JOptionPane.showInputDialog(null,"height ?"));
        
        JOptionPane.showMessageDialog(null, "hello :" + name + " You are :" + age + " years old"+" and you height is :"+height);
    }
}