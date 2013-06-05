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

public Carros verifTempovolta(Carros c1, Carros c2, Circuitos ct){
    Carros c=null;
    int i=0;
    
    while(i<=ct.getNumvoltas()){
        if(c1.tempoProximaVolta()<c2.tempoProximaVolta()){
         c=c1.clone();  
        }
        else{
        c=c2.clone();
        } 
        i++;
   }    

  return c;
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
      s.append(" Circuito: " + this.pista +"\n");
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



