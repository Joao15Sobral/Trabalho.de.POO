
/**
 * Write a description of class Campeonato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Campeonato
{
    // instance variables - replace the example below with your own
    private Corrida[]corrida;
    private int ncorridas;

 public Campeonato(){
 this.corrida=new Corrida [ncorridas];
 this.ncorridas=0;
 }
 
 public Campeonato (Corrida[]corrida, int ncorrida){
 this.corrida=corrida;
 this.ncorridas=ncorrida;
 }
 
 public Campeonato(Campeonato m){
 this.corrida=m.getCorrida();
 this.ncorridas=m.getNcorridas();
 }
 
 public Corrida[]getCorrida(){
 return this.corrida;   
 }
 
 public int getNcorridas(){
 return this.ncorridas;
 }
 
 public void setCorrida(Corrida[]corrida){
 this.corrida=corrida;   
 } 
 
 public void setNcorrida(int ncorrida){
 this.ncorridas=ncorrida;   
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
    StringBuilder s = new StringBuilder();
    int i = 0;
    while(i< this.getNcorridas()) {
      s.append(" Corrida: " + this.corrida[i].toString()+"\n");
    i++;}
    
    return s.toString();
    }
//clone
   
public Campeonato Clone() {
     return new Campeonato(this);
    }
    
}