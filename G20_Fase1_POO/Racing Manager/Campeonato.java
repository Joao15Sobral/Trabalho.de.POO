import java.util.HashSet;
//falta classificaçao campeonato classificaçao trofeu hibrido, gera campeonato,carrega/guarda,
public class Campeonato
{
    // instance variables - replace the example below with your own
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
 
public void setCorrida(Corrida[]corrida){
 this.corrida=corrida;   
 } 
 
public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { Campeonato m = (Campeonato) o;
         if(this.getCorrida().equals(m.getCorrida()));
         return true;
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
    
}