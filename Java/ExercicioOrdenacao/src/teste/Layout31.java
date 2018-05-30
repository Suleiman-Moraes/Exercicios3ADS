package teste;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class Layout31 extends JInternalFrame implements ActionListener{
//    JButton jb = new JButton("Mensagem");
    JButton jb2 = new JButton("Sair");
//    JButton b1 = new JButton("1");
//    JButton b2 = new JButton("2");
//    JButton b3 = new JButton("3");
//    JButton b4 = new JButton("4");
//    JButton b5 = new JButton("5");
//    JButton b6 = new JButton("6");
    private int linha;
    JDesktopPane tela;
    Vector<JButton> vet = new Vector<>();

    public Layout31(JDesktopPane tela, List<Boolean> lista) {
        jb2.addActionListener(this);
        this.tela = tela;
        
        linha = (lista.size()+2) / 4;
        
        for (int i = 0; i < lista.size(); i++) {
            
            JButton aux = new JButton((i+1)+"");
            if(lista.get(i)){
                aux.setEnabled(false);
            }
            aux.addActionListener(this);
            vet.add(aux);
        }
        
        setLayout(new GridLayout(linha,4));
        for (int i = 0; i < vet.size(); i++) {
            add(vet.get(i));
        }
        
//        add(jb2);
    }
    
    public Layout31(JDesktopPane tela) {
        jb2.addActionListener(this);
        this.tela = tela;
        
        for (int i = 0; i < 41; i++) {
            JButton aux = new JButton((i+1)+"");
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
        
//        add(jb2);
    }
    
    public void actionPerformed(ActionEvent e){
//        if(e.getSource()==jb) JOptionPane.showMessageDialog(null,"Hellow Word");
//        //System.out.println("Hello Word");
        if(e.getSource()==jb2){
            System.out.println("Aki");
            dispose();
        }
        System.out.println(e.getActionCommand());
        dispose();
    }
    
    
    public Layout31() {
        for (int i = 0; i < 41; i++) {
            JButton aux = new JButton((i+1)+"");
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
        
        add(new JButton("Sair"));
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
        //setResizable(false);
        setVisible(true);
    }
    
    public void preencher(List<Boolean> lista){
        linha = (lista.size()) / 4;
        
        for (int i = 0; i < lista.size(); i++) {
            
            JButton aux = new JButton((i+1)+"");
            if(lista.get(i)){
                aux.setEnabled(false);
//                System.out.println(aux.isSelected());
            }else{
                aux.setSelected(false);
            }
            vet.add(aux);
        }
        
        setLayout(new GridLayout(linha,4));
        for (int i = 0; i < vet.size(); i++) {
            add(vet.get(i));
        }
        
        add(jb2);
    }
//    public static void main(String[] args) {
//        new Layout31();
//        
//    }
}
