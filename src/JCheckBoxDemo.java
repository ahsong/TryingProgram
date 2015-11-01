/*import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import java.util.*;


public final class JCheckBoxDemo {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                createAndShowGUI();             
            }
        });
    }

    private static void createAndShowGUI(){
        final JFrame frame = new JFrame("JCheckBox Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(JCheckAndTextPane.newInstance());
        frame.setSize(new Dimension(250, 75)); // for demonstration purposes only
        //frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static final class JCheckAndTextPane extends JPanel{
        private JCheckAndTextPane(){
            super();

            // Create components
            final JTextField textField = new JTextField("Enabled");
            final JCheckBox checkBox = new JCheckBox("Enable", true);
            checkBox.addItemListener(new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        textField.setEnabled(true);
                        textField.setText("Enabled");
                    }
                    else if(e.getStateChange() == ItemEvent.DESELECTED){
                        textField.setEnabled(false);
                        textField.setText("Disabled");
                    }

                    validate();
                    repaint();
                }

               /* @Override
               // public void itemStateChanged(ItemEvent ie) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });

            add(checkBox);
            add(textField);*/
        }

        public static final JCheckAndTextPane newInstance(){
            return new JCheckAndTextPane();
        }
    }
}
*/