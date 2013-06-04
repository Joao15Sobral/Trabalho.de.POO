import java.util.Random;
public class PC1Hib extends PC1
{
    // instance variables - replace the example below with your own
    private int motorelectrico;
    //fiabilidade e menor do que no pc1 normal;
    public PC1Hib()
    {
      super();  
      this.motorelectrico=0;
    }
    
    public PC1Hib(String marca, String modelo,int cilindrada,int potencia,Piloto p1, Piloto p2,int motor){
    super(marca,modelo,cilindrada,potencia,p1,p2);
    this.motorelectrico=motor;
    }
    
    public PC1Hib(PC1Hib h){
    super(h);
    this.motorelectrico=h.getMotorElectrico();
    }
    
    public int getMotorElectrico(){
    return  this.motorelectrico;
    }
    
    public void setMotorElectrico(int motor){
    this.motorelectrico=motor;
    }
    
    public boolean equals(Object obj) {
      if(this == obj) return true; 
      if((obj == null) || (this.getClass() != obj.getClass())) return false;
      PC1Hib h = (PC1Hib) obj;
      return (this.motorelectrico == ((PC1Hib)h).getMotorElectrico() && super.equals(h));
   }

   public String toString() {
    
     StringBuilder s = new StringBuilder("-----PC1Hib-----\n");
     
     s.append(" Marca: " + this.getMarca()+"\n");
     s.append(" Modelo:" + this.getModelo()+"\n");
     s.append(" Cilindrada:"+ this.getCilindrada()+"\n");
     s.append(" Potencia: " + this.getPotencia()+"\n");
     s.append(" Potencia do Motor Electrico: " + this.getMotorElectrico()+"\n");
     s.append(" Piloto 1: " + this.getP1() +"\n");
     s.append(" Piloto 2: " + this.getP2() +"\n");
     return s.toString();
    }
     
   public PC1Hib clone(){
   return new PC1Hib(this);
   }
   
  public PC1Hib geraPC1Hib(){
 Random a = new Random();
 int pc1hib = a.nextInt(4);
 Piloto aux = new Piloto();
 PC1Hib p = new PC1Hib();
 
 switch(pc1hib){
    case 0:  p = new PC1Hib("Lamborghini", "Aventador LP 700-4", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(200)+150);
                     break;
    case 1:  p = new PC1Hib("Ferrari", "F12berlinetta",6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(200)+150);
                     break;
    case 2:  p = new PC1Hib("Porsche", "Cayman", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(200)+150);
                     break;
    case 3:  p = new PC1Hib("Aston Martin", "DB9", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(200)+150);
                     break;
  default: break;   
 }
 return p;
} 
}
