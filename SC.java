 
import java.util.Random;
public class SC extends Carros
{
    // instance variables - replace the example below with your own
          private static final int cd = 2500;
         
   

public SC(){
super();

}

public SC(String marca, String modelo,int cilindrada,int potencia,Piloto p1,Piloto p2)
{
    super(marca,modelo,cilindrada,potencia,p1,p2);
}

public SC(SC c){
super(c);

}

public int calFiabilidade(Piloto p1 ){//nao acabada

return (75 * p1.getQualidade() + 25 * this.getCilindrada())/100;
    
}

public double tempoProximaVolta(Circuitos m, boolean chuva){
Random a = new Random();
double res = 0.0;
 if(a.nextInt(this.calFiabilidade(getP1()))==0)//testa fiabilidade
    res=8888;//valor por omissao caso o carro não conclua a volta
 else{ 
  res= m.getTmvoltaSC()-((-3 *this.getCilindrada()/250)+ (this.getPotencia()*0.2)+((5-a.nextInt(getP1().getQualidade()))*-4)+a.nextInt(13));
  }

 if(chuva)//testa Chuva
 if(getP1().getQualidadechuva())
 res = m.getTmvoltaSC()-((-3*this.getCilindrada()/250)+ (this.getPotencia()*0.2)+((6-a.nextInt(getP1().getQualidade()))*-4)+a.nextInt(13));
 else
 res=m.getTmvoltaSC()-((-3*this.getCilindrada()/250)+ (this.getPotencia()*0.2)+((5.5-a.nextInt(getP1().getQualidade()))*-4)+a.nextInt(13));
 
 return res;
}



public boolean equals(Object obj) {
      if(this == obj) return true; 
      if((obj == null) || (this.getClass() != obj.getClass())) return false;
      SC c = (SC) obj;
      return  super.equals(c);
   }

public String toString() {
        StringBuilder s = new StringBuilder("-----SC-----\n");
    
    s.append(" Marca: " + this.getMarca()+"\n");
    s.append(" Modelo:" + this.getModelo()+"\n");
    s.append(" Cilindrada:"+ this.getCilindrada()+"\n");
    s.append(" Potencia: " + this.getPotencia()+"\n");
    s.append(" Piloto 1: " + this.getP1() +"\n");
    s.append(" Piloto 2: " + this.getP2() +"\n");
    return s.toString();
    
   }

public SC clone() { 
    return new SC(this); 
}

public SC geraSC(){
 Random a = new Random();
 int sc = a.nextInt(4);
 Piloto aux = new Piloto();
 SC s = new SC();
 
 switch(sc){
    case 0:  s = new SC("Renault", "V6",2500, a.nextInt(100)+100, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 1:  s = new SC("Toyota", "Corolla",2500, a.nextInt(100)+100, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 2:  s = new SC("Subaru", "Impreza", 2500, a.nextInt(100)+100, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 3:  s = new SC("Seat", "Ibiza", 2500, a.nextInt(100)+100, aux.geraPiloto(),aux.geraPiloto());
                     break;
  default: break;   
 }
 return s;
} 
}    