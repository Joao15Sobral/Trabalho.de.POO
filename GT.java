//ver tempo por volta e a gerapc1, possibilidade de ser abstract,
 package racing.manager;
import java.util.Random;
public  abstract class GT extends Carros
{
    // instance variables - replace the example below with your own
          private int cd;
          
public GT(){
super();

}
          
public GT (String marca, String modelo,int cilindrada,int potencia,Piloto p1, Piloto p2)
{
    super(marca,modelo,cilindrada,potencia,p1,p2); 
}

public GT(GT g){
super(g);

}

public abstract int calFiabilidade(Circuitos c);


public boolean equals(Object obj) {
      if(this == obj) return true; 
      if((obj == null) || (this.getClass() != obj.getClass())) return false;
      GT g = (GT) obj;
      return super.equals(g);
   }

public abstract double tempoProximaVolta(Circuitos m, boolean chuva)throws Exception;
   
public abstract String toString();
   
public abstract GT clone();

public GT geraGT(){
 Random a = new Random();
 int gt = a.nextInt(4);
 Piloto aux = new Piloto();
 GT g = null;
 
 switch(gt){
    case 0:  g = new GTsoCombustao("Lamborghini", "gallardo Veneno", a.nextInt(1500)+3000, a.nextInt(200)+300, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 1:  g = new GTsoCombustao("Ford", "Mustang GT",a.nextInt(1500)+3000, a.nextInt(200)+300, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 2:  g = new GTsoCombustao("Porsche", "Carrera GT", a.nextInt(1500)+3000, a.nextInt(200)+300, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 3:  g = new GTsoCombustao("Nissan", "Skyline", a.nextInt(1500)+3000, a.nextInt(200)+300, aux.geraPiloto(),aux.geraPiloto());
                     break;
  default: break;   
 }
 return g;
} 
}    