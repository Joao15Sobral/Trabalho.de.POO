
import java.util.Random;
public class Circuitos
{
    // instance variables - replace the example below with your own
    private String nome;
    private int distancia;
    private int numvoltas;
    private Piloto piloto;
    private double tmvoltaPC1,tmvoltaPC2,tmvoltaGT,tmvoltaSC;
    private double dtmedio;
    private double trecord;
    private double tnasbox;
    private double deschuva;
    private Carros c1;
    
public Circuitos(){
this.nome="";
this.distancia=0;
this.numvoltas=0;
this.piloto=new Piloto();
this.tmvoltaPC1=0.0;
this.tmvoltaPC2=0.0;
this.tmvoltaGT=0.0;
this.tmvoltaSC=0.0;
this.dtmedio=0.0;
this.trecord=0.0;
this.tnasbox=0.0;
this.c1=null;
}
    
public Circuitos(String nome,int distancia,int numvoltas,Piloto p,double PC1,double PC2,double GT,double SC,double dtm,double trd,double tnb,Carros c1){
this.nome=nome;
this.distancia=distancia;
this.numvoltas=numvoltas;
this.piloto=p;
this.tmvoltaPC1=PC1;
this.tmvoltaPC2=PC2;
this.tmvoltaGT=GT;
this.tmvoltaSC=SC;
this.dtmedio=dtm;
this.trecord=trd;
this.tnasbox=tnb;
this.c1=c1;
}

public Circuitos(Circuitos c){
this.nome=c.getNome();
this.distancia=c.getDistancia();
this.numvoltas=c.getNumvoltas();
this.piloto=c.getPiloto().clone();
this.tmvoltaPC1=c.getTmvoltaPC1();
this.tmvoltaPC2=c.getTmvoltaPC2();
this.tmvoltaGT=c.getTmvoltaGT();
this.tmvoltaSC=c.getTmvoltaSC();
this.dtmedio=c.getDtmedio();
this.trecord=c.getTrecord();
this.tnasbox=c.getTnasbox();;
this.c1=c.getCarro().clone();
}

//get

public String getNome(){

return this.nome;
}

public int getDistancia(){
return this.distancia;
} 

public int getNumvoltas(){
return this.numvoltas;
}

public Piloto getPiloto(){
return this.piloto;
}

public double getTmvoltaPC1(){
return this.tmvoltaPC1;
}

public double getTmvoltaPC2(){
return this.tmvoltaPC2;
}

public double getTmvoltaGT(){
return this.tmvoltaGT;
}

public double getTmvoltaSC(){
return this.tmvoltaSC;
}

public double getDtmedio(){
return this.dtmedio;
}

public double getTrecord(){
return this.trecord;
}

public double getTnasbox(){
return this.tnasbox;
}

public Carros getCarro(){
return this.c1;
}

//sets

public void setNome(String nome){

this.nome=nome;
}


public void setDistancia(int d){
this.distancia=d;
}

public void setNumvoltas(int n){
this.numvoltas=n;
}

public void setPiloto(Piloto p){
this.piloto=p;
}

public void setTmvoltaPC1(double PC1){
this.tmvoltaPC1=PC1;
}

public void setTmvoltaPC2(double PC2){
this.tmvoltaPC2=PC2;
}

public void setTmvoltaGT(double GT){
this.tmvoltaGT=GT;
}

public void setTmvoltaSC(double SC){
this.tmvoltaSC=SC;
}

public void setDtmedio(double dtm){
this.dtmedio=dtm;
}

public void setTrecord(double trd){
this.trecord=trd;
}

public void setTnasbox(double tnb){
this.tnasbox=tnb;
}

public void setMeteor(double meteor){
this.meteor=meteor;
}

public void setCarro(Carros c1){
this.c1=c1;
}
//equals

public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { Circuitos c = (Circuitos) o;
         if(this.getNome().equals(c.getNome())&& this.getDistancia()==(c.getDistancia()) && this.getTmvoltaPC1()==(c.getTmvoltaPC1())&& this.getTmvoltaPC2()==(c.getTmvoltaPC2()) && 
         this.getTmvoltaGT()==(c.getTmvoltaGT()) && this.getTmvoltaSC()==(c.getTmvoltaSC())&& 
         this.getTrecord()==(c.getTrecord())&&this.getDtmedio()==(c.getDtmedio()));
         return true;
        }
    
    }
    
    
//toString
public String toString() {
    StringBuilder s = new StringBuilder("-----Circuito-----\n");
    
    s.append(" Nome do Circuito: " + this.getNome()+"\n");
    s.append(" Distancia: " + this.getDistancia()+"\n");
    s.append(" Tempo medio volta PC1:" + this.getTmvoltaPC1()+"\n");
    s.append(" Tempo medio volta PC2:" + this.getTmvoltaPC2()+"\n");
    s.append(" Tempo medio volta GT:" + this.getTmvoltaGT()+"\n");
    s.append(" Tempo medio volta SC:" + this.getTmvoltaSC()+"\n");
    s.append(" Tempo recorde:"+ this.getTrecord()+"\n");
    s.append(" Desvio ao Tempo Medio, com piso molhado:"+ this.getDtmedio()+"\n");
    s.append(" Piloto recordista: " + this.getPiloto().toString()+"\n");
    s.append(" Carro recordista: " + this.getCarro().toString()+"\n");
    
    return s.toString();
    }
//clone
   
public Circuitos Clone() {
     return new Circuitos(this);
    }

public Circuitos geraCircuito(){
 Random a = new Random();
 int circuito = a.nextInt(6);
 Circuitos c = new Circuitos();
 Piloto aux = new Piloto();
 Carros m = new Carros();
 
 switch(Circuitos){
    case 0:  c = new Circuitos("Grand Premio Monaco",3340,15,aux.geraPiloto(),122.2,152.7,200.0,210.8,10.2,115.1,20.3,m.geraCarros());
                     break;
    case 1:  c = new Circuitos("Circuito de SilverStone",3340,15,aux.geraPiloto(),122.2,152.7,200.0,210.8,10.2,115.1,20.3,m.geraCarros());
                     break;
    case 2:  c = new Circuitos("Circuito da Catalunha",3340,15,aux.geraPiloto(),122.2,152.7,200.0,210.8,10.2,115.1,20.3,m.geraCarros());
                     break;
    case 3:  c = new Circuitos("Circuito de Falperra",3340,15,aux.geraPiloto(),122.2,152.7,200.0,210.8,10.2,115.1,20.3,m.geraCarros());
                     break;
    case 4:  c = new Circuitos("Circuito do Porto",3340,15,aux.geraPiloto(),122.2,152.7,200.0,210.8,10.2,115.1,20.3,m.geraCarros());
                     break;
    case 5:  c = new Circuitos("Circuito de Coimbra",3340,15,aux.geraPiloto(),122.2,152.7,200.0,210.8,10.2,115.1,20.3,m.geraCarros());
                     break;
   
     default: break;    
}
return c;
}    
}