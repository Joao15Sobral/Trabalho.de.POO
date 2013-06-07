 
import java.util.Random;
public class PC2Hib extends PC2 implements TrofHibridos
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
  
   public double tempoProximaVolta(Circuitos m, boolean chuva){
Random a = new Random();
double res = 0;
 if(a.nextInt(getFiabilidade())==0)//testa fiabilidade
    res=8888;//valor por omissao caso o carro não conclua a volta
 else{ 
  res= m.getTmvoltaPC1()-((-this.getCilindrada()/200)+ (this.getPotencia()*0.04)+((5-a.nextInt(getP1().getQualidade()))*-4)+a.nextInt(13));
  }

 if(chuva)//testa Chuva
 if(getP1().getQualidadechuva())
 res=m.getTmvoltaPC1()-((-this.getCilindrada()/200)+ (this.getPotencia()*0.04)+((6-a.nextInt(getP1().getQualidade()))*-4)+a.nextInt(13));
 else
 res=m.getTmvoltaPC1()-((-this.getCilindrada()/200)+ (this.getPotencia()*0.04)+((5.5-a.nextInt(getP1().getQualidade()))*-4)+a.nextInt(13));
 
 return res;
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
    case 0:  p = new PC2Hib("Mitsubishi", "Lancer Evo X", a.nextInt(2000)+4000, a.nextInt(450)+400, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 1:  p = new PC2Hib("Subaru", "Impreza WRX STI",a.nextInt(2000)+4000, a.nextInt(450)+400, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 2:  p = new PC2Hib("VW", "Phaeton W12", a.nextInt(2000)+4000, a.nextInt(450)+400, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 3:  p = new PC2Hib("Dodge", "Caliber 2.4 Turbo", a.nextInt(2000)+4000, a.nextInt(450)+400, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
  default: break;   
 }
 return p;
} 
}
