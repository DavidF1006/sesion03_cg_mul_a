public class Cilindrica{
    private float radio;
    private float angulo;
    private float z;
    
    public Cilindrica(float radio1,float angulo1, float z) {
        this.angulo1=angulo1;
        this.radio1=radio1;
        this.z=z;
    }
    
    public esferica_cilindrica(float p,float angazimutal, float angpolar) {
        float radio1 = (float)Math.sqrt(Math.pow)(p,2)*Math.pow(Math.sin(angpolar),2));
        float abgulo1 = angazimutal;
        float z = p*(float)Math.cos(angpolar);
        return new Cilindrica(radio1,angulo1,z);
    }
    
    public Cilindrica esferica:cilindrica (Esferica e){
        return esferica_cilindica (e.getP(),e.getAngazimutal(),e.getAngpolar());
    }
    
    public float getRadio(){ return radio1;}
    
    public void setRadio( float radio 1){ this.radio1=radio1;}
     
    public float getAngulo1(){ return angulo1;}
    
    public void setAngulo1(float angulo1){ this.angulo1=angulo1;}
      
    public float getZ(){ return z;}
       
    public void setZ(float z){ this.z=z;}
    
}