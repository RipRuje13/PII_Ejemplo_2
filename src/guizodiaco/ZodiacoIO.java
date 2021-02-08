package guizodiaco;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ZodiacoIO{
    
    public static void leerArchivo(Zodiaco z, String nombreArchivo)throws FileNotFoundException{
        File f;
        
        f = new File(nombreArchivo);
        Scanner sc;
        SignoZodiaco s;
        String nombre, simbolo, planeta, pH,pM;
        
        int noSuerte;
        
        //System.out.println("hola erika");
        try{
            int i = 0;
            System.out.println(nombreArchivo);
            
            sc = new Scanner(f);
            while(sc.hasNext()){
                nombre = sc.nextLine();             
                System.out.println("1: "+nombre);
                simbolo = sc.nextLine();
                System.out.println("2: "+simbolo);
                noSuerte = sc.nextInt();
                sc.nextLine();
                System.out.println("3: "+noSuerte);
                planeta = sc.nextLine();
                System.out.println("4: "+planeta);
                pH = sc.nextLine();
                System.out.println("5: "+pH);
                pM = sc.nextLine();
                System.out.println("6: "+pM);
                s = new SignoZodiaco(nombre, simbolo, noSuerte, planeta, pH, pM);
                z.agregarSigno(s);
                System.out.println(z);
                
            }            
            sc.close();
        }
        catch(FileNotFoundException e){
            throw e;
        }
        
    }
}
