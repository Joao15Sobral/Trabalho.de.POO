
/**
 * Write a description of class Manager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Manager
{
    // instance variables - replace the example below with your own
    private Campeonato c;
    private jogador[] user;
    private int njogadores;
    
public Manager(Campeonato c, jogador[] user, int n){
this.c=c;
this.user=user;
this.njogadores=n;
}

public Manager(Manager m){
this.c=m.getCampeonato();
this.user=m.getJogador();
this.njogadores=m.getNjogadores();
}

public Campeonato getCampeonato(){
return this.c;
}

public jogador[] getJogador(){
return this.user;
}

public int getNjogadores(){
return this.njogadores;
}

public void setCampeonato(Campeonato c){
this.c=c;
}    

public void setJogador(jogador [] user){
this.user=user;
}

public void setNjogadores(int n){
this.njogadores=n;
}

//equals
 
public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { Manager m = (Manager) o;
         
        return (this.getCampeonato().equals(m.getCampeonato()) && this.getJogador().equals(m.getJogador())); 
        }
    
    }
    
    
//toString
public String toString() {
    StringBuilder s = new StringBuilder("Manager \n");
    int i = 0;
      s.append(" Campeonato: " + this.c +"\n");
    while(i< this.getNjogadores()) {
      s.append(" Jogador: " + this.user[i].toString()+"\n");
    i++;}
    
    return s.toString();
    }
//clone
   
public Manager Clone() {
     return new Manager(this);
    }
    
}
 
