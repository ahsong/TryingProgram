import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ModifyTextField 
{
    public static void createAndDisplayGUI()
    {
        JFrame frame = new JFrame("MODIFY TEXTFIELD");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);

        final JPanel contentPane = new JPanel();

        final JTextField tfield = new JTextField(10);
        tfield.setEnabled(false);

        final JCheckBox cbox = new JCheckBox("Enable TEXTFIELD", false);

        ItemListener itemListener = new ItemListener()
        {
            public void itemStateChanged(ItemEvent ie)
            {
                tfield.setEnabled(ie.getStateChange() == ItemEvent.SELECTED)
            }
        };
        cbox.addItemListener(itemListener);

        contentPane.add(cbox);
        contentPane.add(tfield);

        frame.getContentPane().add(contentPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndDisplayGUI();
            }
        });
    }
}