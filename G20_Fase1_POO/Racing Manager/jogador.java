import java.util.ArrayList;
public class jogador
{
    // instance variables - replace the example below with your own
    private String nome;
    private String morada;
    private int apostas;
    private ArrayList<Aposta> historico;
    private double investimento;
    private double ganhos;
    
public jogador(){
 this.nome=new String();
 this.morada= new String();
 this.apostas=0;
 this.historico= new ArrayList<Aposta>(); 
 this.investimento=0.0;
 this.ganhos=0.0;
}

public jogador(String nome,String morada,int apostas,ArrayList<Aposta> historico,double investimento,double ganhos){
 this.nome=nome;
 this.morada=morada;
 this.apostas=apostas;
 this.historico=historico; 
 this.investimento=investimento;
 this.ganhos=ganhos;
}

public jogador(jogador j){
 this.nome=j.getNome();
 this.morada=j.getMorada();
 this.apostas=j.getApostas();
 this.historico=j.getHistorico(); 
 this.investimento=j.getInvestimento();
 this.ganhos=j.getGanhos();
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
  for(Aposta a : this.historico)
            hist.add(a);
        return hist;
    }


public double getInvestimento(){
return this.investimento;
}

public double getGanhos(){
return this.ganhos;
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

public void getHistorico(ArrayList<Aposta> historico){
this.historico=historico;
}

public void setInvestimento(double investimento){
this.investimento=investimento;
}

public void setGanhos(double ganhos){
this.ganhos=ganhos;
}

//equals
 
public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { jogador j = (jogador) o;
         if(this.getNome().equals(j.getNome()) && this.getMorada().equals(j.getMorada()));
         return true;
        }
    
    }
    
    
//toString
public String toString() {
    StringBuilder s = new StringBuilder("-----Jogador-----\n");
    
    s.append(" Nome: " + this.getNome()+"\n");
    s.append(" Morada:" + this.getMorada()+"\n");
    s.append(" Dinheiro Investido:" + this.getInvestimento()+"\n");
    s.append(" Dinheiro Ganho:" + this.getGanhos()+"\n");
    for(Aposta a : this.historico)
            s.append(a.toString());;
    
    return s.toString();
    }
//clone
   
public jogador Clone() {
     return new jogador(this);
    }
    
}