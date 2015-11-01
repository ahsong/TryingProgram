import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

public class KeyListenerExample implements KeyListener {
public void keyTyped(KeyEvent e) {
System.out.println(e);
}

public void keyPressed(KeyEvent e) {
System.out.println(e);
}

public void keyReleased(KeyEvent e) {
System.out.println(e);
}

public static void main(String[] args) {
JTextField textField = new JTextField(30);
textField.addKeyListener(new KeyListenerExample());

final JFrame f = new JFrame();
f.setJMenuBar(createMenuBar());
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.getContentPane().add(textField);
f.pack();
SwingUtilities.invokeLater(new Runnable(){
public void run() {
f.setLocationRelativeTo(null);
f.setVisible(true);
}
});
}

static JMenuBar createMenuBar() {
JMenuBar mb = new JMenuBar();
JMenu menu = new JMenu("Edit");
JMenuItem item = new JMenuItem("Paste");
item.addActionListener(new DefaultEditorKit.PasteAction());
menu.add(item);
mb.add(menu);
return mb;
}
}