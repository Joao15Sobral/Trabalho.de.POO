import java.util.Random;
public class PC2soCombustao extends PC2
{
          private static final int fiabilidade = 70 ;

public PC2soCombustao(){
super();
}          
          
public PC2soCombustao(String marca, String modelo,int cilindrada,int potencia,Piloto p1, Piloto p2)
{
    super(marca,modelo,cilindrada,potencia,p1,p2);   
}

public PC2soCombustao(PC2soCombustao c){
 super(c);
 this.fiabilidade=c.getFiabilidade();
}

public int getFiabilidade(){
return this.fiabilidade;
}

public void setFiabilidade(int fiabilidade){
this.fiabilidade=fiabilidade;
}

public int calFiabilidade(){

return (this.fiabilidade * this.getCilindrada())/6000;
    
}

public boolean equals(Object obj) {
      if(this == obj) return true; 
      if((obj == null) || (this.getClass() != obj.getClass())) return false;
      PC2soCombustao c = (PC2soCombustao) obj;
      return super.equals(c);
   }

public String toString() {
      
    
    StringBuilder s = new StringBuilder("-----PC2soCombustao-----\n");
    
    s.append(" Marca: " + this.getMarca()+"\n");
    s.append(" Modelo:" + this.getModelo()+"\n");
    s.append(" Cilindrada:"+ this.getCilindrada()+"\n");
    s.append(" Potencia: " + this.getPotencia()+"\n");
    s.append(" Piloto 1: " + this.getP1() +"\n");
    s.append(" Piloto 2: " + this.getP2() +"\n");
    return s.toString();
    }
   
   
public PC2soCombustao clone() { 
    return new PC2soCombustao(this); 
}

public PC2soCombustao geraPC2soCombustao(){
 Random a = new Random();
 int pc2 = a.nextInt(4);
 Piloto aux = new Piloto();
PC2soCombustao p = new PC2soCombustao();
 
 switch(pc2){
    case 0:  p = new PC2soCombustao("Lamborghini", "Gallardo", a.nextInt(2000)+4000, a.nextInt(450)+400, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 1:  p = new PC2soCombustao("Ferrari", "458 Spider",a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 2:  p = new PC2soCombustao("BMW", "M3", a.nextInt(2000)+4000,a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 3:  p = new PC2soCombustao("Ford", "Mustang", a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
  default: break;   
 }
 return p;
} 
} 