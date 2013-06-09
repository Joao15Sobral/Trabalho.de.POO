 
import java.util.HashSet;
import java.util.Random;
//falta classificaçao campeonato classificaçao trofeu hibrido, gera campeonato,carrega/guarda,
public class Campeonato
{
    
    private HashSet<Corrida> corrida;
   

 public Campeonato(){
 this.corrida=new HashSet<Corrida>();
 }
 
 public Campeonato (HashSet<Corrida> corrida){
 this.corrida = new HashSet<Corrida>();
 for(Corrida c: corrida){
  this.corrida.add(c.clone());  
  }
 }
 
 public Campeonato(Campeonato m){
 this.corrida=m.getCorrida();
}
 
 public HashSet<Corrida> getCorrida(){
HashSet<Corrida> aux = new HashSet<Corrida>();
for (Corrida c : corrida){
 aux.add(c.clone());
} 		
return aux;
}
 
public void setCorrida(HashSet<Corrida> corrida){
 this.corrida=corrida;   
 } 


public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { Campeonato m = (Campeonato) o;
         return(this.getCorrida().equals(m.getCorrida()));
        
        }
    
    }
    
    
//toString
public String toString() {
    StringBuilder s = new StringBuilder("-----Campeonato-----\n");
    
    
    for (Corrida c : this.getCorrida())
			s.append(c.toString());

		return s.toString();
    }
//clone
   
public Campeonato Clone() {
     return new Campeonato(this);
    }
public Campeonato geraCampeonato(){
 Random a = new Random();
 int campeonato = a.nextInt(2);
 Corrida p = new Corrida();
 Campeonato c = new Campeonato();
 
 switch(campeonato){
    case 0:  c = new Campeonato(new HashSet<Corrida>()); 
        break;
    case 1:  c = new Campeonato(new HashSet<Corrida>()); 
        break;
 
    default:break;
 }    
return c;
}
}