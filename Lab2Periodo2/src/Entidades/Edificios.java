
package Entidades;

public class Edificios extends Construccion implements Equipo,Administrativo{
    protected String TipoEdificio;
    
    
    public Edificios(String NombreProyecto, String MedidasTerreno, String AreaCOnstruccion, String TipoEdificio){
        super(NombreProyecto, MedidasTerreno, AreaCOnstruccion);
        this.TipoEdificio=TipoEdificio;
    }
    

    public String getTipoEdificio() {
        return TipoEdificio;
    }

    public void setTipoEdificio(String TipoEdificio) {
        this.TipoEdificio = TipoEdificio;
    }
    
    public void MostraDatos(){
        System.out.println("DATOS GENERALES\n:"+
                           "\nNOMBRE DEL PROYECTO: "+this.NombreProyecto+
                           "\nMEDIDAS DEL TERRENO: "+this.MedidasTerreno+
                           "\nDIRECCIÓN DE LA CONSTRUCCIÓN: "+this.AreaCOnstruccion+
                           "\nTIPO DE EDIFICIO: "+this.TipoEdificio);
    }
    
   
    
    public static void main(String[]args){
        //Edificio Polideportivo
        Edificios edificio1 = new Edificios("Jugando", "680 mts * 1500 mts", "Santa Ana", "Edificio Polideportivo");
        edificio1.MostraDatos();
        edificio1.EncargadoProyecto("Ing. William Pleitez", 54, 10);
        edificio1.GastosProyecto(170, 340, 1200, 2000000);
        System.out.println("*************************************************************");
        //Edificio Hospiltalario
        Edificios edificio2 = new Edificios("#COVID19", "350 mts * 800 mts", "San Salvador", "Edificio Hospitalario");
        edificio2.MostraDatos();
        edificio2.EncargadoProyecto("Ing. Farid Montalvo", 36, 9);
        edificio2.GastosProyecto(320, 360, 2500, 3500000);
        System.out.println("**************************************************************");
        //Edificio Educativo
        Edificios edificio3 = new Edificios("Aprendiendo", "150 mts * 560 mts", "Santa Tecla", "Edificio Educativo");
        edificio3.MostraDatos();
        edificio3.EncargadoProyecto("Ing. Santiago Sosa", 46, 14);
        edificio3.GastosProyecto(78, 250, 3200, 560000);
    }

    @Override
    public void EncargadoProyecto(String Nombre, int edad, int experiencia) {
        System.out.println("DATOS ENCARGADO DEL PROYECTO: \n"+
                           "NOMBRE: "+Nombre+
                           "\nEDAD: "+edad+" años"+
                           "\nAÑOS DE EXPERIENCIA: "+experiencia+" años");
    }

    @Override
    public void GastosProyecto(int CantidadObreros, double salarioObreros, double SalarioEncargado, double CostoProyecto) {
       double Total=(CantidadObreros*salarioObreros)+SalarioEncargado+CostoProyecto;
        System.out.println("DATOS ECONÓMICOS: \n"+
                           "CANTIDAD DE OBREROS: "+CantidadObreros+
                           "\nSALARIO DE OBREROS: $"+salarioObreros+
                           "\nSALARIO DEL ENCARGADO: $"+SalarioEncargado+
                           "\nCOSTO DEL PROYECTO: $"+CostoProyecto+
                           "\nTOTAL A PAGAR: $"+Total);
    }

}
