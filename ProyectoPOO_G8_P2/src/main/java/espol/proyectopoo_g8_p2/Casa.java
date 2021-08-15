package espol.proyectopoo_g8_p2;
public class Casa {
    private String manzana;
    private Ubicacion coordenadas;
    private String villa;
    private String residente;
     /**
     * Constructor para la clase Propiedad
     * @param manzana - Define la manzana 
     * @param villa - Define la villa donde se encuentra
     * @param coordenadas - Define la ubicacion en coordenadas de la casa
     * @param residente - Define el residente de la casa
     
     */
    
    public Casa(String manzana,Ubicacion coordenadas,String villa,String residente){
        this.manzana=manzana;
        this.coordenadas=coordenadas;
        this.villa=villa;
        this.residente=residente;
        
    }
    public Casa(String manzana,Ubicacion coordenadas,String villa){
        this.manzana=manzana;
        this.coordenadas=coordenadas;
        this.villa=villa;
        residente="";
    }
    public String getManzana(){
    return manzana;
    }
     public Ubicacion getCoordenadas(){
    return coordenadas;
    }
      public String getVilla(){
    return villa;
    }
       public String getResidente(){
    return residente;
    }
    }
    
    


