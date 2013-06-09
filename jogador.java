
 
import java.util.TreeMap;
import java.util.ArrayList;
public class jogador
{
    // instance variables - replace the example below with your own
    private String nome;
    private String morada;
    private int apostas;
    private ArrayList<Aposta> historico;
    private ArrayList<Aposta> actuais;
    private double investimento;
    private double ganhos;
    private double saldo;
    
public jogador(){
 this.nome=new String();
 this.morada= new String();
 this.apostas=0;
 this.historico= new ArrayList<Aposta>(); 
 this.investimento=0.0;
 this.ganhos=50.0;
 this.actuais=new ArrayList<Aposta>();
 this.saldo=0.0;
}

public jogador(String nome,String morada,int apostas,ArrayList<Aposta> historico,double investimento,double ganhos,double saldo,ArrayList<Aposta> actuais){
 this.nome=nome;
 this.morada=morada;
 this.apostas=apostas;
 this.historico=historico; 
 this.investimento=investimento;
 this.ganhos=ganhos;
 this.actuais=actuais;
 this.saldo=saldo;
}

public jogador(jogador j){
 this.nome=j.getNome();
 this.morada=j.getMorada();
 this.apostas=j.getApostas();
 this.historico=j.getHistorico(); 
 this.investimento=j.getInvestimento();
 this.ganhos=j.getGanhos();
 this.actuais=j.getActuais();
 this.saldo=j.getSaldo();
}

public String getNome(){
return this.nome;
}

public String getMorada(){
return this.morada;
}

public int getApostas(){
return this.apostas;
}

public ArrayList<Aposta> getHistorico(){
 ArrayList<Aposta> hist = new ArrayList<Aposta>();
  for(Aposta a : this.historico){
            hist.add(a);
        }
     return hist;
    }

public ArrayList<Aposta> getActuais(){
 ArrayList<Aposta> act= new ArrayList<Aposta>();
  for(Aposta a: this.actuais){
    act.add(a);
    }
    return act;
}
    
public double getInvestimento(){
return this.investimento;
}

public double getGanhos(){
return this.ganhos;
}

public double getSaldo(){
return this.saldo;
}

public void setNome(String nome){
this.nome=nome;
}

public void setMorada(String morada){
this.morada=morada;
}

public void setApostas(int apostas){
this.apostas=apostas;
}

public void setHistorico(ArrayList<Aposta> historico){
this.historico=historico;
}

public void setActuais(ArrayList<Aposta> actuais){
this.actuais=actuais;
}

public void setSaldo(double saldo){
this.saldo=saldo;

}

public void setInvestimento(double investimento){
this.investimento=investimento;
}

public void setGanhos(double ganhos){
this.ganhos=ganhos;
}

//fazer verifica aposta,classificação jogador;
public void verifApostas(Corrida m,TreeMap<Double,Carros> classificacao){
double res = 0;
Aposta b=new Aposta();
for(Aposta a : actuais){
if(a.getM().getPista().getNome().equals(m.getPista().getNome())){
res = a.verApostavencedora(classificacao);
this.investimento-=a.getAposta();
if(res==1.0){
this.saldo=this.ganhos-(a.getAposta());
}else{
    res = res * (a.getAposta());
this.ganhos+= res-(a.getAposta());
this.saldo+=(res);
}
this.historico.add(a);
b = a.Clone();
}}
this.actuais.remove(b);

}

//equals
 
public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { jogador j = (jogador) o;
         return (this.getNome().equals(j.getNome()) && this.getMorada().equals(j.getMorada()));
         
        }
    
    }
    
    
//toString
public String toString() {
    StringBuilder s = new StringBuilder("-----Jogador-----\n");
    
    s.append(" Nome: " + this.getNome()+"\n");
    s.append(" Morada:" + this.getMorada()+"\n");
    s.append(" Dinheiro Investido:" + this.getInvestimento()+"\n");
    s.append(" Dinheiro Ganho:" + this.getGanhos()+"\n");
    s.append(" Saldo:"+this.getSaldo()+"\n");
    s.append(" Historico de Apostas:\n");
    for(Aposta a : this.historico){
            s.append(a.toString()+"\n");}
    s.append(" Apostas Activas:\n");
    for(Aposta a : this.actuais){
           s.append(a.toString()+"\n");}
    
    return s.toString();
    }
//clone
   
public jogador Clone() {
     return new jogador(this);
    }
    
}