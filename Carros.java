//falta corrigir erro na gera carros,verifica se e hibrido; 
 
import java.util.Random;
public abstract class Carros
{
    // instance variables - replace the example below with your own
    private String marca;
    private String modelo;
    private int cilindrada;
    private int potencia;
    private Piloto p1,p2;
   
public Carros(){
this.marca="";
this.modelo="";
this.cilindrada=0;
this.potencia=0;
this.p1=new Piloto();
this.p2=new Piloto();
}
    
public Carros(String marca, String modelo,int cilindrada,int potencia,Piloto p1 , Piloto p2){
this.marca=marca;
this.modelo=modelo;
this.cilindrada=cilindrada;
this.potencia=potencia;
this.p1=p1;
this.p2=p2;
}

public Carros(Carros c){
this.marca=c.getMarca();
this.modelo=c.getModelo();
this.cilindrada=c.getCilindrada();
this.potencia=c.getPotencia();
this.p1=c.getP1();
this.p2=c.getP2();
}

public String getMarca(){
return this.marca;
}

public String getModelo(){
return this.modelo;
}

public int getCilindrada(){
return this.cilindrada;
}

public int getPotencia(){
return this.potencia;
}

public Piloto getP1(){
return this.p1;
}

public Piloto getP2(){
return this.p2;
}

public void setMarca(String marca){
this.marca=marca;
}

public void setModelo(String modelo){
 this.modelo=modelo;
}

public void setCilindrada(int cilindrada){
 this.cilindrada=cilindrada;
}

public void setPotencia(int potencia){
 this.potencia=potencia;
}

public void setP1(Piloto p1){
 this.p1=p1;
}

public void setP2(Piloto p2){
this.p2=p2;
}

public abstract double tempoProximaVolta(Circuitos m, boolean chuva);

public boolean verificaHibridos(){
Class[] m = this.getClass().getInterfaces();
int i = 0; String s = "interface TrofHibridos"; 
boolean b = false;
while(i <m.length) {

if(m[i].toString().equals(s)) b =true;

i++;
}
return b;	
}

public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { Carros c = (Carros) o;
         return (this.getMarca().equals(c.getMarca()) && this.getModelo().equals(c.getModelo()) && this.getCilindrada()==(c.getCilindrada())&& this.getPotencia()==(c.getPotencia())); 
        }
    
    }

public Carros geraCarros(){
 Random a = new Random();
 int carros = a.nextInt(12);
 Piloto aux = new Piloto();
 Carros p = null;
 
 switch(carros){
    case 0:  p = new PC1soCombustao("Lamborghini", "Aventador LP 700-4", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 1:  p = new PC1soCombustao("Ferrari", "F12berlinetta",6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 2:  p = new PC1soCombustao("Porsche", "Cayman", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 3:  p = new PC1soCombustao("Aston Martin", "DB9", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 4:  p = new PC2soCombustao("Lamborghini", "Gallardo", a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 5:  p = new PC2soCombustao("Ferrari", "458 Spider",a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 6:  p = new PC2soCombustao("BMW", "M3", a.nextInt(2000)+4000,a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 7:  p = new PC2soCombustao("Ford", "Mustang", a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;  
    case 8:  p = new GTsoCombustao("Lamborghini", "gallardo Veneno", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 9:  p = new GTsoCombustao("Ford", "Mustang GT",a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 10:  p = new GTsoCombustao("Porsche", "Carrera GT", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 11:  p = new GTsoCombustao("Nissan", "Skyline", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 12:  p = new PC1Hib("Bugatti", "Veyron", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 13:  p = new PC1Hib("Mercedes-Benz", "Lotec C1000",6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 14:  p = new PC1Hib("Hennessey", "Venom 1000 Twin Turbo", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 15:  p = new PC1Hib("Koenigsegg", "Agera R", 6000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 16:  p = new PC2Hib("Mitsubishi", "Lancer Evo X", a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 17:  p = new PC2Hib("Subaru", "Impreza WRX STI",a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 18:  p = new PC2Hib("VW", "Phaeton W12", a.nextInt(2000)+4000,a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 19:  p = new PC2Hib("Dodge", "Caliber 2.4 Turbo", a.nextInt(2000)+4000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 20:  p = new GTHib("Alfa Romeo", "8C Coupé", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 21:  p = new GTHib("Corvette", "ZR1",a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 22:  p = new GTHib("Honda", "Legend 3.7 V6 SH-AWD", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 23:  p = new GTHib("Jaguar", "XFR", a.nextInt(1500)+3000, a.nextInt(9)+1, aux.geraPiloto(),aux.geraPiloto(),a.nextInt(100)+100);
                     break;
    case 24:  p = new SC("Renault", "V6",2500, a.nextInt(100)+100, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 25:  p = new SC("Toyota", "Corolla",2500, a.nextInt(100)+100, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 26:  p = new SC("Subaru", "Impreza", 2500, a.nextInt(100)+100, aux.geraPiloto(),aux.geraPiloto());
                     break;
    case 27:  p = new SC("Seat", "Ibiza", 2500, a.nextInt(100)+100, aux.geraPiloto(),aux.geraPiloto());
                     break;
    
  default: break;   
 }
 return p;
}       
    
//toString
public abstract String toString();
//clone
public abstract Carros clone();
}