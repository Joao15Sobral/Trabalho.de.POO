package racing.manager; 
import java.util.Random;
//ver tempo por volta e a gerapc1, possibilidade de ser abstract,
public abstract class PC1 extends Carros
{
    // instance variables - replace the example below with your own
      private static final int cd = 6000;
      private  int fiabilidade = 85;  

public PC1(){
super();
}
      
public PC1(String marca, String modelo,int cilindrada,int potencia,Piloto p1, Piloto p2)
{
    super(marca,modelo,potencia,cilindrada,p1,p2);
}

public PC1(PC1 c){
super(c);
}

public int getCilindrada(){
return this.cd;
}

public int getFiabilidade(){
return this.fiabilidade;
}

public boolean equals(Object obj) {
      if(this == obj) return true; 
      if((obj == null) || (this.getClass() != obj.getClass())) return false;
      PC1 c = (PC1) obj;
      return (this.cd == ((PC1)c).getCilindrada() && super.equals(c) && this.fiabilidade == ((PC1)c).getFiabilidade());
   }

public abstract String toString();
    

public abstract double tempoProximaVolta(Circuitos m, boolean chuva)throws Exception;
    
    
public abstract PC1 clone();

public PC1 geraPC1(){
 Random a = new Random();
 int pc1 = a.nextInt(4);
 Piloto aux = new Piloto();
 PC1 p = null;
 
 switch(pc1){
    case 0:  p = new PC1soCombustao("Lamborghini", "Aventador LP 700-4", 6000, a.nextInt(500)+500, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 1:  p = new PC1soCombustao("Ferrari", "F12berlinetta",6000, a.nextInt(500)+500, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 2:  p = new PC1soCombustao("Porsche", "Cayman", 6000, a.nextInt(500)+500, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 3:  p = new PC1soCombustao("Aston Martin", "DB9", 6000, a.nextInt(500)+500, aux.geraPiloto(),aux.geraPiloto());
                     break;
  default: break;   
 }
 return p;
}   

}
