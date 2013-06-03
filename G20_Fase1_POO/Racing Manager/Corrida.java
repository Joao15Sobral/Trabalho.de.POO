
/**
 * Write a description of class Corrida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Corrida
{
    // instance variables - replace the example below with your own
    private Carros[] participantes;
    private int ncarros;
    private Circuitos pista; 

public Corrida(Circuitos c, Carros[] participantes, int ncarros){
 this.participantes=participantes;
 this.ncarros=ncarros;
 this.pista=c;
}

public Corrida(Corrida c){
this.participantes=c.getParticipantes();
this.ncarros=c.getNcarros();
this.pista=c.getPista();
}

public Carros[] getParticipantes(){
return this.participantes;
}

public int getNcarros(){
return this.ncarros;
}

public Circuitos getPista(){
return this.pista;
}


public void setParticipantes(Carros[] participantes){
this.participantes=participantes;
}

public void setNcarros(int ncarros){
this.ncarros=ncarros;
}

public void setPista(Circuitos c){
this.pista=c;
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
    StringBuilder s = new StringBuilder("Corrida \n");
    int i = 0;
      s.append(" Circuito: " + this.pista +"\n");
    while(i< this.getNcarros()) {
      s.append(" Carro: " + this.participantes[i].toString()+"\n");
    i++;}
    
    return s.toString();
    }
//clone
   
public Corrida Clone() {
     return new Corrida(this);
    }
    
}



