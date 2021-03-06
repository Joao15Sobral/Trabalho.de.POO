 
import java.util.Iterator;
import java.util.TreeMap;
public class Aposta
{
    // instance variables - replace the example below with your own
    private double aposta;
    private Carros c1,c2,c3;
    private Corrida m;
    
    //construtor
    public Aposta(){
    this.aposta=0.0;
    this.c1=null;
    this.c2=null;
    this.c3=null;
    this.m=new Corrida();
    }
    
    public Aposta(double aposta, Carros c1,Carros c2,Carros c3,Corrida m){
    this.aposta=aposta;
    this.c1=c1;
    this.c2=c2;
    this.c3=c3;
    this.m=m;
 }
 
 public Aposta (Aposta a){
   this.aposta=a.getAposta();
   this.c1=a.getC1().clone();
   this.c2=a.getC2().clone();
   this.c3=a.getC3().clone();
   this.m=a.getM().clone();
 }
 
 //get
 
 public double getAposta(){
 return this.aposta;
}

public Carros getC1(){
return this.c1;
}

public Carros getC2(){
return this.c2;
}

public Carros getC3(){
return this.c3;
}

public Corrida getM(){
return this.m;
}

//set

public void setAposta(double a){
this.aposta=a;
}

public void setC1(Carros c1){
this.c1=c1;
}

public void setC2(Carros c2){
this.c2=c2;
}

public void setC3(Carros c3){
this.c3=c3;
}

public void setM(Corrida m){
this.m=m;
}
//metodos

public double verApostavencedora(TreeMap<Double,Carros> classificacao){
Carros r1=null,r2=null,r3=null; double res=1.0;
Iterator<Carros> carros = classificacao.values().iterator();
r1= (Carros) carros.next();
r2= (Carros) carros.next();
r3= (Carros) carros.next();

if(this.getC1().equals(r1.clone())){ res+=0.7;}
if(this.getC2().equals(r2.clone())){ res+=0.3;}
if(this.getC3().equals(r3.clone())){ res+=0.1;}   
//se acertar no 1º/2º/3º=1.7/1.3/1.1; 1º,2º=2; 1º,2º,3º=2.1; 2º,3º=1.4;3º,1º=1.8;
return res;

}


//equal

public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { Aposta a = (Aposta) o;
         return (this.getAposta()==(a.getAposta()) && this.getC1().equals(a.getC1()) && this.getC2().equals(a.getC2())&& this.getC3().equals(a.getC3()) && this.getM().equals(a.getM()));
        
        }
    
    }
    
  
//toString
public String toString() {
    StringBuilder s = new StringBuilder("-----Aposta-----\n");
    
    s.append(" Aposta:" + this.getAposta()+"\n");
    s.append(" Carro1:" + this.getC1()+"\n");
    s.append(" Carro2:"+ this.getC2()+"\n");
    s.append(" Carro3:" + this.getC3()+"\n");
    s.append(" Corrida:" + this.getM().clone());
    
    return s.toString();
    }
//clone
   
public Aposta Clone() {
     return new Aposta(this);
    }
}

