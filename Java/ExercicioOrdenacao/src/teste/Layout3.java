package teste;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class Layout3 extends JFrame implements ActionListener{
    JButton jb = new JButton("Mensagem");
    JButton jb2 = new JButton("Sair");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    
    Vector<JToggleButton> vet = new Vector<>();
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jb) JOptionPane.showMessageDialog(null,"Hellow Word");
        //System.out.println("Hello Word");
        if(e.getSource()==jb2) System.exit(0);
    }
    
    
    public Layout3() {
        for (int i = 0; i < 41; i++) {
            JToggleButton aux = new JToggleButton((i+1)+"");
            if(i % 2 == 0){
                aux.setSelected(true);
//                System.out.println(aux.isSelected());
            }else{
                aux.setSelected(false);
                System.out.println(aux.isSelected());
            }
            vet.add(aux);
        }
        
        setLayout(new GridLayout(11,4));
        for (int i = 0; i < vet.size(); i++) {
            add(vet.get(i));
        }
//        for (int i = 0; i < vet.length; i++) {
//            vet[i].setText((i+1) + "");
//            add(vet[i]);
//        }
        
//        jb.addActionListener(this);
//        jb2.addActionListener(this);
        //Linhas,colunas
        
//        add(b1);
//        add(b2);
//        add(b3);
//        add(b4);
//        add(jb);
//        add(jb2);
        
        setTitle("Título da Janela");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Layout3();
        
    }
}
