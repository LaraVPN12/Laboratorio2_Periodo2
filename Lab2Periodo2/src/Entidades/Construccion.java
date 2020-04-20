
package Entidades;

public abstract class Construccion {
    protected String NombreProyecto;
    protected String MedidasTerreno;
    protected String AreaCOnstruccion;

    public Construccion(String NombreProyecto, String MedidasTerreno, String AreaCOnstruccion) {
        this.NombreProyecto = NombreProyecto;
        this.MedidasTerreno = MedidasTerreno;
        this.AreaCOnstruccion = AreaCOnstruccion;
    }

    public String getNombreProyecto() {
        return NombreProyecto;
    }

    public void setNombreProyecto(String NombreProyecto) {
        this.NombreProyecto = NombreProyecto;
    }

    public String getMedidasTerreno() {
        return MedidasTerreno;
    }

    public void setMedidasTerreno(String MedidasTerreno) {
        this.MedidasTerreno = MedidasTerreno;
    }

    public String getAreaCOnstruccion() {
        return AreaCOnstruccion;
    }

    public void setAreaCOnstruccion(String AreaCOnstruccion) {
        this.AreaCOnstruccion = AreaCOnstruccion;
    }
    
    
    
}
