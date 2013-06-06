// falta faz corrida, classificaçao corrida,
import java.util.HashMap;
import java.util.HashSet;
public class Corrida
{
    // instance variables - replace the example below with your own
    private HashSet<Carros> participantes;
    private Circuitos pista; 

public Corrida(Circuitos c, HashSet<Carros> participantes){
 this.pista=c;
 this.participantes=new HashSet<Carros>();
 for(Carros c: participantes){
  this.participantes.add(c.clone());  
  }
}

public Corrida(Corrida c){
this.participantes=c.getParticipantes();
this.pista=c.getPista();
}

public HashSet<Carros> getParticipantes(){
HashSet<Carros> aux = new HashSet<Carros>();
for (Carros c : carros){
 aux.add(c.clone());
} 		
return aux;
}

public Circuitos getPista(){
return this.pista;
}


public void setParticipantes(HashSet<Carros> participantes){
this.participantes=participantes;
}

public void setPista(Circuitos c){
this.pista=c;
}

public HashMap<Carros,double> simCorrida(){


HashMap<Carros,double> aux= new HashMap<Carros,double>();

return aux;

}

public HashMap<Carros,double> simVoltas(HashSet<Carros> aux1,int nvoltas){
double res =0.0; int i=0; 
HashMap<Carros,double> aux= new HashMap<Carros,double>();
HashMap<Carros,double> aux2= new HashMap<Carros,double>();  

while(i<this.nvoltas){
System.out.println("___Volta "+this.i+"___\n");
aux=this.simVolta(aux1);

for(Carros r: aux.KeySet()){

    aux2.put(r,aux.get(r)+aux2.get(r));

}

 i++;
}
 return aux2;
}


public HashMap<Carros,double> simVolta(HashSet<Carros> participantes){
double res=0.0, minimo= 10000.0;   Carros c = null;
HashMap<Carros,double> aux = new HashMap<Carros,double>();
for(Carros r: participantes){
  res=r.tempoProximavolta(this.pista,this.chuva,this.p1);
  aux.put(r,res);
 if (res<minimo){
     minimo=res;
     c=r.clone();
    } 

}
System.out.println("Carro vencedor da volta:"+ c.getMarca() +"\n"+ c.getModelo()+"\n"+ "Tempo:"+minimo);
return aux;
}

//equals
 
public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { Corrida c = (Corrida) o;
         if(this.getParticipantes().equals(c.getParticipantes()) && this.getPista().equals(c.getPista()));
         return true;
        }
    
    }
    
    
//toString
public String toString() {
    StringBuilder s = new StringBuilder("-----Corrida-----\n");
      s.append(" Circuito:" + this.pista +"\n");
      s.append(" Carros Participantes:\n" );
      for (Carros c : this.getCarros()){
			s.append(c.toString());
			

}    
return s.toString();
    }

    //clone
   
public Corrida Clone() {
     return new Corrida(this);
    }
    
}



