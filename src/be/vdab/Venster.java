package be.vdab;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Venster extends JFrame {
    private static final long serialVersionUID = 1L;
    public Venster(){
        super("Adapter");
        setSize(300,300);
        JPanel panel = new JPanel();
        panel.setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        panel.addMouseListener(new MuisAdapter());
    }


    private class MuisAdapter extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e){
            JOptionPane.showMessageDialog(Venster.this, "X-coordinaat: " + e.getX(), "x-coordinaat", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
