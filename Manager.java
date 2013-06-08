package racing.manager;

import java.util.HashMap;
public class Manager
{
    // instance variables - replace the example below with your own
    private Campeonato c;
    private HashMap<String,jogador> utilizadores;
    
public Manager(){
this.c=new Campeonato();
this.utilizadores = new HashMap<String,jogador>();
}
    
public Manager(Campeonato c, HashMap<String,jogador> utilizadores){
this.c=c;
this.utilizadores=utilizadores;
   
}


public Manager(Manager m){
this.c=m.getCampeonato();
this.utilizadores=m.getUtilizadores(); 
}

public Campeonato getCampeonato(){
return this.c;
}

public HashMap<String,jogador> getUtilizadores(){
    HashMap<String,jogador> user = new HashMap<String,jogador> ();
    for(String nome: this.utilizadores.keySet()){
     user.put(nome,this.utilizadores.get(nome));
    }    
    return this.utilizadores;
}

public void setCampeonato(Campeonato c){
this.c=c;
}    

public void setUtilizadores(HashMap<String,jogador> user){
this.utilizadores=user;
}

//equals
 
public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { Manager m = (Manager) o;
         
        return (this.getCampeonato().equals(m.getCampeonato()) && this.getUtilizadores().equals(m.getUtilizadores())); 
        }
    
    }
  
public void simAposta(){
    
    for(jogador j: utilizadores.values()){
    j.verifApostas(m,);
    
    
    }

}
    
//toString
public String toString() {
	StringBuilder s = new StringBuilder("-----Manager-----\n");
	s.append(this.c.toString()+"\n");
	s.append("Jogadores Registados\n");	
	for (String nome : this.utilizadores.keySet()) {
			s.append(this.utilizadores.get(nome).toString());
		}
		return s.toString();
	}
//clone
   
public Manager Clone() {
     return new Manager(this);
    }
    
}
 
