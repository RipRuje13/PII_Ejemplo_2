package guizodiaco;

import java.awt.*;
import javax.swing.*;

public class VistaZodiaco extends JFrame{
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel11;
    private JPanel panel21;
    private JComboBox signo;//-----------------------CB
    private JRadioButton f;//-----------------------
    private JRadioButton m;//-----------------------
    private ImageIcon img;//-----------------------
    private JLabel imagen;
    private JLabel noSuerte;
    private JLabel planeta;
    private JTextArea texto;//-----------------------
    private JScrollPane personalidad;//-----------------------
    
    public VistaZodiaco(){
        
        //Instanciar objetos
        String signos[] = {"","Aries","Tauro","Géminis","Cáncer"};//-----------------------CB
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel11 = new JPanel();
        panel21 = new JPanel();
        signo = new JComboBox(signos);        //-----------------------CB
        f = new JRadioButton("Femenino",false);//-----------------------RB
        m = new JRadioButton("Masculino",false);//-----------------------RB
        img = new ImageIcon("blanco.png");//-----------------------RB
        imagen = new JLabel(img);////-----------------------
        noSuerte = new JLabel("");
        planeta = new JLabel("");
        texto = new JTextArea(5,1);//-----------------------
        personalidad = new JScrollPane(texto);//-----------------------
        
        establecerDiseño();
        configurarComponentes();
        agregarComponentes();
        configurarVentana();
    }

    public JComboBox getSigno() {
        return signo;
    }

    public JRadioButton getF() {
        return f;
    }

    public JRadioButton getM() {
        return m;
    }

    public ImageIcon getImg() {
        return img;
    }

    public JLabel getImagen() {
        return imagen;
    }

    public JLabel getNoSuerte() {
        return noSuerte;
    }

    public JLabel getPlaneta() {
        return planeta;
    }

    public JTextArea getTexto() {
        return texto;
    }
    
    public void establecerDiseño(){
        this.setLayout(new BorderLayout());
        panel1.setLayout(new GridLayout(2,2));
        panel11.setLayout(new GridLayout(2,1));
        panel2.setLayout(new BorderLayout());
        panel21.setLayout(new GridLayout(2,2));
    }
    public void configurarComponentes(){
        panel1.setBorder(BorderFactory.createTitledBorder("Datos"));//-----------------------
        panel2.setBorder(BorderFactory.createTitledBorder("Horóscopo"));//-----------------------
        ButtonGroup bg= new ButtonGroup();//-----------------------
        bg.add(f);//-----------------------
        bg.add(m);//-----------------------
        
        texto.setLineWrap(true);//-----------------------
        texto.setWrapStyleWord(true);//-----------------------
        texto.setEditable(false);
        personalidad.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//-----------------------
    }
    public void agregarComponentes(){
        //Panel panel1
        panel1.add(new JLabel("Seleccion tu signo:"));
        panel1.add(signo);
        panel1.add(new JLabel("Seleccion tu género:"));
        panel11.add(f);
        panel11.add(m);
        panel1.add(panel11);
        this.add(panel1,BorderLayout.NORTH);
        //Panel panel2
        panel21.add(new JLabel("    No. suerte: "));
        panel21.add(noSuerte);
        panel21.add(new JLabel("    Planeta: "));
        panel21.add(planeta);
        panel2.add(imagen,BorderLayout.WEST);
        panel2.add(panel21,BorderLayout.CENTER);
        panel2.add(personalidad,BorderLayout.SOUTH);
        this.add(panel2, BorderLayout.CENTER);
    }
    public void configurarVentana(){
        this.setTitle("Horóscopo");
        this.setSize(300,370);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
