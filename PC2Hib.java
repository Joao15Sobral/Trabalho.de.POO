import java.util.Random;
public class PC2Hib extends PC2
{
        private int motorelectrico;
    //fiabilidade e menor do que no pc2 normal;
    public PC2Hib()
    {
      super();  
      this.motorelectrico=0;
    }
    
    public PC2Hib(String marca, String modelo,int cilindrada,int potencia,Piloto p1, Piloto p2,int motor){
    super(marca,modelo,cilindrada,potencia,p1,p2);
    this.motorelectrico=motor;
    }
    
    public PC2Hib(PC2Hib h){
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
      PC2Hib h = (PC2Hib) obj;
      return (this.motorelectrico == ((PC2Hib)h).getMotorElectrico() && super.equals(h));
   }

   public String toString() {
    
     StringBuilder s = new StringBuilder("-----PC2Hib-----\n");
     
     s.append(" Marca: " + this.getMarca()+"\n");
     s.append(" Modelo:" + this.getModelo()+"\n");
     s.append(" Cilindrada:"+ this.getCilindrada()+"\n");
     s.append(" Potencia: " + this.getPotencia()+"\n");
     s.append(" Potencia do Motor Electrico: " + this.getMotorElectrico()+"\n");
     s.append(" Piloto 1: " + this.getP1() +"\n");
     s.append(" Piloto 2: " + this.getP2() +"\n");
     return s.toString();
    }
     
   public PC2Hib clone(){
   return new PC2Hib(this);
   }
   
   
public PC2Hib geraPC2Hib(){
 Random a = new Random();
 int pc2hib = a.nextInt(4);
 Piloto aux = new Piloto();
 PC2Hib p = new PC2Hib();
 
 switch(pc2hib){
    case 0:  p = new PC2Hib("Mitsubishi", "Lancer Evo X", a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 1:  p = new PC2Hib("Subaru", "Impreza WRX STI",a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 2:  p = new PC2Hib("VW", "Phaeton W12", a.nextInt(2000)+4000,a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 3:  p = new PC2Hib("Dodge", "Caliber 2.4 Turbo", a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
  default: break;   
 }
 return p;
} 
}
