package racing.manager;
// falta faz corrida, classificaçao corrida,
import java.util.Random;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.HashSet;
public class Corrida
{
    // instance variables - replace the example below with your own
    private HashSet<Carros> participantes;
    private Circuitos pista; 

 public Corrida(){
 this.participantes = new HashSet<Carros>();
 this.pista=new Circuitos();
 }
    
 public Corrida(Circuitos c, HashSet<Carros> participantes){
 this.pista=c;
 this.participantes=new HashSet<Carros>();
 for(Carros r: participantes){
  this.participantes.add(r.clone());  
  }
}

public Corrida(Corrida c){
this.participantes=c.getParticipantes();
this.pista=c.getPista();
}

public HashSet<Carros> getParticipantes(){
HashSet<Carros> aux = new HashSet<Carros>();
for (Carros c : participantes){
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

public TreeMap<Double,Carros> simCorrida(HashMap<Carros,Double> voltas){
HashMap<Carros,Double> aux= new HashMap<Carros,Double>();
TreeMap<Double,Carros> aux1= new TreeMap<Double,Carros>();
Carros r1 = null,r2 = null,r3 = null;

for(Carros c: participantes){
 aux.put(c,0.0);
}
System.out.println(this.pista.getNome()+"\n");
aux=this.simVoltas(voltas,pista.getNumvoltas());

for(Carros c: aux.keySet()){
if(aux1.containsKey(aux.get(c))== false) {
    aux1.put(aux.get(c),c);
}else 
    aux1.put(aux.get(c)+5,c);}
    
Iterator<Carros> carros = aux1.values().iterator();
r1= (Carros) carros.next();
r2= (Carros) carros.next();
r3= (Carros) carros.next();
 
System.out.println("Classificaçao da corrida\n");
System.out.println("1º Classificado: "+ r1.getMarca() +" - "+ r1.getModelo() +" - "+ "Tempo:" + aux.get(r1));
System.out.println("2º Classificado: "+ r2.getMarca() +" - "+ r2.getModelo() +" - "+ "Tempo:" + aux.get(r2));
System.out.println("3º Classificado: "+ r3.getMarca() +" - "+ r3.getModelo() +" - "+ "Tempo:" + aux.get(r3));


//falta classificaçao para os tres primeiros carros e depois classificaçao troufeu hibrido
 
return aux1;

}

public HashMap<Carros,Double> simVoltas(HashMap<Carros,Double> m,int nvoltas){
 int i=0;Piloto p =new Piloto(); 
HashMap<Carros,Double> aux= new HashMap<Carros,Double>();
HashMap<Carros,Double> aux2= new HashMap<Carros,Double>();  


while(i<pista.getNumvoltas()){
System.out.println("___Volta "+i+"___\n");
aux=this.simVolta();

for(Carros r: aux.keySet()){
  aux2.put(r,aux.get(r)+aux2.get(r));
  if(i==0)
  p=r.getP1();
  if(i==((pista.getNumvoltas())/2))
  p=r.getP2();
}
 
i++;
}
 return aux2;
}

public HashMap<Carros,Double> simVolta(){
Random a = new Random();
double res=0.0, minimo= 10000.0;   Carros c = null;
HashMap<Carros,Double> aux = new HashMap<Carros,Double>();
for(Carros r: participantes)
    try{
  res=r.tempoProximaVolta(this.pista,a.nextBoolean());
  aux.put(r,res);
 if (res<minimo){
     minimo=res;
     c=r.clone();
    } 
   }catch (Exception e){
   System.out.println("DNF");
   participantes.remove(r);

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
      for (Carros c : this.getParticipantes()){
			s.append(c.toString());
			

}    
return s.toString();
    }

    //clone
   
public Corrida clone() {
     return new Corrida(this);
    }
    
public Corrida geraCorrida(){
 Random a = new Random();
 int corrida = a.nextInt(7);
 Circuitos aux = new Circuitos();
 Carros p = null;
 Corrida c = new Corrida();
 
 switch(corrida){
    case 0:  c = new Corrida(aux.geraCircuito(),new HashSet<Carros>()); 
        break;
    case 1:  c = new Corrida(aux.geraCircuito(),new HashSet<Carros>()); 
        break;
    case 3:  c = new Corrida(aux.geraCircuito(),new HashSet<Carros>()); 
        break;
    case 4:  c = new Corrida(aux.geraCircuito(),new HashSet<Carros>()); 
        break;    
    case 5:  c = new Corrida(aux.geraCircuito(),new HashSet<Carros>()); 
        break;
    case 6:  c = new Corrida(aux.geraCircuito(),new HashSet<Carros>()); 
        break;    
     default: break;    
            }
return c;
}
}



