import java.util.Random;

public class PC1 extends Carros
{
    // instance variables - replace the example below with your own
      private static final int cd = 6000;
      private static final int fiabilidade = 85;  

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

public String toString() {
    
    StringBuilder s = new StringBuilder("-----PC1-----\n");
    
    s.append(" Marca: " + this.getMarca()+"\n");
    s.append(" Modelo:" + this.getModelo()+"\n");
    s.append(" Cilindrada:"+ this.getCilindrada()+"\n");
    s.append(" Potencia: " + this.getPotencia()+"\n");
    s.append(" Piloto 1: " + this.getP1() +"\n");
    s.append(" Piloto 2: " + this.getP2() +"\n");
    return s.toString();
    }

public double tempoProximaVolta(Circuitos m, boolean chuva, Piloto p1){
Random a = new Random();
int res = 0;
 if(a.nextInt(this.fiabilidade)==0)//testa fiabilidade
    res=1;//valor por omissao caso o carro não conclua a volta
 if(p1.getQualidade()>8 && this.getPotencia()){//testa qualidade piloto
  res=1;} 
 else{ 
  res=1;
  }
 if(this.getPotencia())//testa potencia do carro 
 if(chuva)//testa Chuva
 res=1;
}    
    
public PC1 clone() { 
    return new PC1(this); 
}

public PC1 geraPC1(){
 Random a = new Random();
 int pc1 = a.nextInt(4);
 Piloto aux = new Piloto();
 PC1 p = new PC1();
 
 switch(pc1){
    case 0:  p = new PC1("Lamborghini", "Aventador LP 700-4", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 1:  p = new PC1("Ferrari", "F12berlinetta",6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 2:  p = new PC1("Porsche", "Cayman", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 3:  p = new PC1("Aston Martin", "DB9", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
  default: break;   
 }
 return p;
}   

}
