package guizodiaco;

public class SignoZodiaco {
    private String nombre;
    private String simbolo;
    private int noSuerte;
    private String planeta;
    private String personalidadH;
    private String personalidadM;

    public SignoZodiaco(String nombre, String simbolo, int noSuerte, String planeta, String pH, String pM) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.noSuerte = noSuerte;
        this.planeta = planeta;
        personalidadH = pH;
        personalidadM = pM;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getNoSuerte() {
        return noSuerte;
    }

    public void setNoSuerte(int noSuerte) {
        this.noSuerte = noSuerte;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getPersonalidadH() {
        return personalidadH;
    }

    public void setPersonalidadH(String personalidad) {
        this.personalidadH = personalidad;
    }    
    public String getPersonalidadM() {
        return personalidadM;
    }

    public void setPersonalidadM(String personalidad) {
        this.personalidadM = personalidad;
    }

    @Override
    public String toString() {
        return "\nSigno Zodiaco: " +  nombre + "\n\tSimbolo: " + simbolo + "\n\tNo. suerte: " + noSuerte + "\n\tPlaneta: " + planeta + "\n\tPersonalidadH: " + personalidadH + "\n\tPersonalidadM: " + personalidadM;
    }
    
}
