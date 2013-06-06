//ver tempo por volta e a gerapc1, possibilidade de ser abstract,
import java.util.Random;
public class GT extends Carros
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

public int calFiabilidade(){//nao acabada

return 1; //((voltasfeitas*taxa)/cilindradaMenor); (menos cilindrada mais fiavel);
    
}

public boolean equals(Object obj) {
      if(this == obj) return true; 
      if((obj == null) || (this.getClass() != obj.getClass())) return false;
      GT g = (GT) obj;
      return super.equals(g);
   }

public double tempoProximaVolta(Circuitos m, boolean chuva, Piloto p1){
Random a = new Random();
int res = 0;
 if(a.nextInt(this.calFiabilidade())==0)//testa fiabilidade
    res=8888;//valor por omissao caso o carro não conclua a volta
 else{ 
  res= m.getTmvoltaGT()-((-this.getCilindrada()/250)+ (this.getPotencia()*0.2)+((5-a.nextInt(p1.getQualidade()))*-4)+a.nextInt(13));
  }

 if(chuva)//testa Chuva
 if(p1.getQualidadeChuva)
 res=m.getTmvoltaSC()-((-this.getCilindrada()/250)+ (this.getPotencia()*0.2)+((6-a.nextInt(p1.getQualidade()))*-4)+a.nextInt(13));
 else
 res=m.getTmvoltaSC()-((-this.getCilindrada()/250)+ (this.getPotencia()*0.2)+((5.5-a.nextInt(p1.getQualidade()))*-4)+a.nextInt(13));
 
 return res;
}   
   
public String toString() {
    
    StringBuilder s = new StringBuilder("-----GT-----\n");
    
    s.append(" Marca: " + this.getMarca()+"\n");
    s.append(" Modelo:" + this.getModelo()+"\n");
    s.append(" Cilindrada:"+ this.getCilindrada()+"\n");
    s.append(" Potencia: " + this.getPotencia()+"\n");
    s.append(" Piloto 1: " + this.getP1() +"\n");
    s.append(" Piloto 2: " + this.getP2() +"\n");
    return s.toString();
    
   }
   
public GT clone() { 
    return new GT(this);
}

public GT geraGT(){
 Random a = new Random();
 int gt = a.nextInt(4);
 Piloto aux = new Piloto();
 GT g = new GT();
 
 switch(gt){
    case 0:  g = new GT("Lamborghini", "gallardo Veneno", a.nextInt(1500)+3000, a.nextInt(200)+300, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 1:  g = new GT("Ford", "Mustang GT",a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 2:  g = new GT("Porsche", "Carrera GT", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 3:  g = new GT("Nissan", "Skyline", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
  default: break;   
 }
 return g;
} 
}    