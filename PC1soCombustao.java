import java.util.Random;
public class PC1soCombustao extends PC1
{
    private static final int cd = 6000;
      private static final int fiabilidade = 85;  

public PC1soCombustao(){
super();
}
      
public PC1soCombustao(String marca, String modelo,int cilindrada,int potencia,Piloto p1, Piloto p2)
{
    super(marca,modelo,potencia,cilindrada,p1,p2);
}

public PC1soCombustao(PC1soCombustao c){
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
      PC1soCombustao c = (PC1soCombustao) obj;
      return (this.cd == ((PC1soCombustao)c).getCilindrada() && super.equals(c) && this.fiabilidade == ((PC1soCombustao)c).getFiabilidade());
   }

public String toString() {
    
    StringBuilder s = new StringBuilder("-----PC1soCombustao-----\n");
    
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
    res=8888;//valor por omissao caso o carro não conclua a volta
 else{ 
  res= m.getTmvoltaPC1()-((-this.getCilindrada()/200)+ (this.getPotencia()*0.04)+((5-a.nextInt(p1.getQualidade()))*-4)+a.nextInt(13));
  }

 if(chuva)//testa Chuva
 if(p1.getQualidadeChuva())
 res=m.getTmvoltaPC1()-((-this.getCilindrada()/200)+ (this.getPotencia()*0.04)+((6-a.nextInt(p1.getQualidade()))*-4)+a.nextInt(13));
 else
 res=m.getTmvoltaPC1()-((-this.getCilindrada()/200)+ (this.getPotencia()*0.04)+((5.5-a.nextInt(p1.getQualidade()))*-4)+a.nextInt(13));
 
 return res;
}
    
    
public PC1soCombustao clone() { 
    return new PC1soCombustao(this); 
}

public PC1soCombustao geraPC1soCombustao(){
 Random a = new Random();
 int pc1 = a.nextInt(4);
 Piloto aux = new Piloto();
 PC1soCombustao p = new PC1soCombustao();
 
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
