public class Esferica{
    
     public class Esferica {
       private float p; 
       private float angpolar;
       private float angazimutal;
    }
    
    public Esferica(float p, float angpolar, float angazimutal ) {
        this.p = p;
        this.angpolar = angpolar;
        this.angazimutal = angazimutal;
    }
    
    public Esferica(float p, float angpolar, float angazimutal ) {
        float p = (float Math-sqrt(Math.pow(radio1,2)+Math.pow(z,2);
        float angpolar= angulo1;
        float angazimutal)(float)Math.acos(z/Math.sqrt(Math.pow(radio1,2)+Math.pow(z,2)));
        return new Esferica (p,angpolar, angazimutal);
    }
    
    public Esferica cilindrica_esferica(Cilindrica ci){
        return cilindrica_esferica (ci.getRadio1(), ci.getAngulo1, ci.getZ());
    }
    
    public float getP(){ return p;}
    
    public void setRadio( float radio 1){ this.p=p;}
     
    public float getAngpolar(){ return angpolar;}
    
    public void setAngpolar(float angpolar){ this.angpolar=angpolar;}
      
    public float getAngazimutal(){ return angazimutal;}
       
    public void setAngazimutal(float angazimutal){ this.angazimutal=angazimutal;}
}