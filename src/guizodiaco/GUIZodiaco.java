package guizodiaco;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileNotFoundException;

public class GUIZodiaco {
    Zodiaco z;
    VistaZodiaco vz;
    
    public GUIZodiaco(){
        //Instanciar objetos
        z = new Zodiaco();
        try{
            ZodiacoIO.leerArchivo(z,"archivoSignosZodiaco.txt");
            //System.out.println(z);
            vz = new VistaZodiaco();
            EscuchaBR e = new EscuchaBR();
            vz.getSigno().addItemListener(new EscuchaCB());
            vz.getF().addActionListener(e);
            vz.getM().addActionListener(e);
        }
        catch(FileNotFoundException f){
            JOptionPane.showMessageDialog(null, "La aplicación no puede ser abierta. \nEl archivo no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }       
    }
    public void actualizarAreaTexto(int i){
        if(vz.getF().isSelected()){
            vz.getTexto().setText(z.getSignoIndice(i).getPersonalidadM());
            System.out.println("cambio");
        }
        else{
            if(vz.getM().isSelected()){
                vz.getTexto().setText(z.getSignoIndice(i).getPersonalidadH());
            }
        }
    }
    public static void main(String[] args) {
        GUIZodiaco gz = new GUIZodiaco();      
    }
    public class EscuchaBR implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e1){
            int i = vz.getSigno().getSelectedIndex();
            if(vz.getF() == ((JRadioButton)e1.getSource())){
                if(i == 1 || i == 2 || i == 3 || i == 4){
                        vz.getTexto().setText(z.getSignoIndice(i-1).getPersonalidadM());
                    }
            }
            else{
                if(vz.getM()== ((JRadioButton)e1.getSource())){
                    if(i == 1 || i == 2 || i == 3 || i == 4){
                        vz.getTexto().setText(z.getSignoIndice(i-1).getPersonalidadH());
                    }
                }
            }
        }
    }
    public class EscuchaCB implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e2){
            if (e2.getStateChange() == ItemEvent.SELECTED){
                int i = vz.getSigno().getSelectedIndex();
                if(i == 0){
                    vz.getImagen().setIcon(new ImageIcon("blanco.png"));
                    vz.getNoSuerte().setText("");
                    vz.getPlaneta().setText("");
                    vz.getTexto().setText("");
                }
                else{
                    vz.getImagen().setIcon(new ImageIcon(z.getSignoIndice(i-1).getSimbolo()));
                    vz.getNoSuerte().setText(z.getSignoIndice(i-1).getNoSuerte()+"");
                    vz.getPlaneta().setText(z.getSignoIndice(i-1).getPlaneta());
                    actualizarAreaTexto(i-1);
                }
            }             
        }
    }
}
