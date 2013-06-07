 
import java.util.Random;
public class GTHib extends GT implements TrofHibridos
{
        private int motorelectrico;
    //fiabilidade e menor do que no pc1 normal;
    public GTHib()
    {
      super();  
      this.motorelectrico=0;
    }
    
    public GTHib(String marca, String modelo,int cilindrada,int potencia,Piloto p1, Piloto p2,int motor){
    super(marca,modelo,cilindrada,potencia,p1,p2);
    this.motorelectrico=motor;
    }
    
    public GTHib(GTHib h){
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
      GTHib h = (GTHib) obj;
      return (this.motorelectrico == ((GTHib)h).getMotorElectrico() && super.equals(h));
   }

   public String toString() {
    
     StringBuilder s = new StringBuilder("-----GTHib-----\n");
     
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
 if(a.nextInt(this.calFiabilidade())==0)//testa fiabilidade
    res=8888;//valor por omissao caso o carro não conclua a volta
 else{ 
  res= m.getTmvoltaGT()-((-this.getCilindrada()/250)+ (this.getPotencia()*0.2)+((5-a.nextInt(getP1().getQualidade()))*-4)+a.nextInt(13));
  }

 if(chuva)//testa Chuva
 if(getP1().getQualidadechuva())
 res=m.getTmvoltaSC()-((-this.getCilindrada()/250)+ (this.getPotencia()*0.2)+((6-a.nextInt(getP1().getQualidade()))*-4)+a.nextInt(13));
 else
 res=m.getTmvoltaSC()-((-this.getCilindrada()/250)+ (this.getPotencia()*0.2)+((5.5-a.nextInt(getP1().getQualidade()))*-4)+a.nextInt(13));
 
 return res;
}
   
   public GTHib clone(){
   return new GTHib(this);
   }
   
   public GTHib geraGTHib(){
 Random a = new Random();
 int gthib = a.nextInt(4);
 Piloto aux = new Piloto();
 GTHib g = new GTHib();
 
 switch(gthib){
    case 0:  g = new GTHib("Alfa Romeo", "8C Coupé", a.nextInt(1500)+3000, a.nextInt(200)+300, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 1:  g = new GTHib("Corvette", "ZR1",a.nextInt(1500)+3000, a.nextInt(200)+300, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 2:  g = new GTHib("Honda", "Legend 3.7 V6 SH-AWD", a.nextInt(1500)+3000, a.nextInt(200)+300, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 3:  g = new GTHib("Jaguar", "XFR", a.nextInt(1500)+3000, a.nextInt(200)+300, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
  default: break;   
 }
 return g;
} 
}
