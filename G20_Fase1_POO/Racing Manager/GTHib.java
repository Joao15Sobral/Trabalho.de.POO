
import java.util.Random;
public class GTHib extends GT
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
      return (this.motorelectrico == ((GTHib)h).getMotorElectrico() && super.equals(c));
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
     
   public GTHib clone(){
   return new GTHib(this);
   }
   
   public GTHib geraGTHib(){
 Random a = new Random();
 int gthib = a.nextInt(4);
 Piloto aux = new Piloto();
 GTHib g = new GTHib();
 
 switch(gthib){
    case 0:  g = new GTHib("Lamborghini", "gallardo Veneno", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(200)+150);
                     break;
    case 1:  g = new GTHib("Ford", "Mustang GT",a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(200)+150);
                     break;
    case 2:  g = new GTHib("Porsche", "Carrera GT", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(200)+150);
                     break;
    case 3:  g = new GTHib("Nissan", "Skyline", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(200)+150);
                     break;
  default: break;   
 }
 return g;
} 
}
