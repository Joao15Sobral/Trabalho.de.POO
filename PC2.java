  
import java.util.Random;
public abstract class PC2 extends Carros
{
    // instance variables - replace the example below with your own
          
          private static final int fiabilidade = 70 ;

public PC2(){
super();
}          
          
public PC2(String marca, String modelo,int cilindrada,int potencia,Piloto p1, Piloto p2)
{
    super(marca,modelo,cilindrada,potencia,p1,p2);   
}

public PC2(PC2 c){
 super(c);

}

public int getFiabilidade(){
return this.fiabilidade;
}

public abstract int calFiabilidade();

public boolean equals(Object obj) {
      if(this == obj) return true; 
      if((obj == null) || (this.getClass() != obj.getClass())) return false;
      PC2 c = (PC2) obj;
      return super.equals(c);
   }
public abstract double tempoProximaVolta(Circuitos m, boolean chuva)throws Exception;
public abstract String toString();
public abstract PC2 clone(); 
    

public PC2 geraPC2(){
 Random a = new Random();
 int pc2 = a.nextInt(4);
 Piloto aux = new Piloto();
 PC2 p = null;
 
 switch(pc2){
    case 0:  p = new PC2soCombustao("Lamborghini", "Gallardo", a.nextInt(2000)+4000, a.nextInt(450)+400, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 1:  p = new PC2soCombustao("Ferrari", "458 Spider",a.nextInt(2000)+4000, a.nextInt(450)+400, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 2:  p = new PC2soCombustao("BMW", "M3", a.nextInt(2000)+4000, a.nextInt(450)+400, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 3:  p = new PC2soCombustao("Ford", "Mustang", a.nextInt(2000)+4000, a.nextInt(450)+400, aux.geraPiloto(),aux.geraPiloto());
                     break;
  default: break;   
 }
 return p;
} 
}    