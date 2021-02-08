package guizodiaco;

public class Zodiaco {
    private SignoZodiaco [] signos;
    private int ns;
    
    public Zodiaco(){
        signos = new SignoZodiaco[4];
        ns = 0;
    }
//    public SignoZodiaco[] getSignos(){
//        return signos;
//    }
    public void agregarSigno(SignoZodiaco s){
        signos[ns++] = s;
    }
    public SignoZodiaco getSignoIndice(int i){
        return signos[i];
    }
    @Override
    public String toString(){
        int i;
        String cad = "";
        for(i = 0; i < signos.length; i++){
            cad += signos[i];
        }
        return cad;
    }
}
