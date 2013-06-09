 
import java.util.Random;

public class Piloto
{
    // instance variables - replace the example below with your own
    private String nome;
    private String nacionalidade;
    private int palmares;
    private int qualidade;
    private boolean qualidadechuva;
    
public Piloto() {
  this.nome = "";
  this.nacionalidade = "";
  this.palmares = 0;
  this.qualidade = 0;
  this.qualidadechuva = true;
	}
    
public Piloto(String nome, String nacionalidade, int palmares, int qualidade, boolean qualidadechuva){
  this.nome=nome;
  this.nacionalidade=nacionalidade;
  this.palmares=palmares;
  this.qualidade=qualidade;
  this.qualidadechuva=qualidadechuva;
}

public Piloto(Piloto p){
 this.nome=p.getNome();
  this.nacionalidade=p.getNacionalidade();
  this.palmares=p.getPalmares();
  this.qualidade=p.getQualidade();
  this.qualidadechuva=p.getQualidadechuva();   
}

public String getNome(){
return this.nome;
}

public String getNacionalidade(){
return this.nacionalidade;
}

public int getPalmares(){
return this.palmares;
}

public int getQualidade(){
return this.qualidade;
}

public boolean getQualidadechuva(){
return this.qualidadechuva;
}

public void setNome(String nome){
this.nome=nome;
}

public void setNacionalidade(String nacionalidade){
 this.nacionalidade=nacionalidade;
}

public void setPalmares(int palmares){
 this.palmares=palmares;
}

public void setQualidade(int qualidade){
 this.qualidade=qualidade;
}

public void setQualidadechuva(boolean qualidadechuva){
 this.qualidadechuva=qualidadechuva;
}

public boolean equals(Object o) {
    if (this==o) return true;
    if((o==null)||(this.getClass() != o.getClass()))
     return false;
     else { Piloto p = (Piloto) o;
         return(this.getNome().equals(p.getNome()) && this.getNacionalidade().equals(p.getNacionalidade()) && 
         this.getPalmares()==(p.getPalmares())&& this.getQualidade()==(p.getQualidade())&& this.getQualidadechuva()==(p.getQualidadechuva()));
         }
    }
    
    
//toString
public String toString() {
    StringBuilder s = new StringBuilder("-----Piloto-----\n");
    
    s.append(" Nome: " + this.getNome()+"\n");
    s.append(" Nacionalidade:" + this.getNacionalidade()+"\n");
    s.append(" Palmares:"+ this.getPalmares()+"\n");
    s.append(" Qualidade: " + this.getQualidade()+"\n");
    s.append(" Qualidade piso Molhado: " + this.getQualidadechuva()+"\n");
    
    return s.toString();
    }
//clone
   
public Piloto Clone() {
     return new Piloto(this);
    }

public Piloto geraPiloto(){
 Random a = new Random();
 int piloto = a.nextInt(16);
 Piloto p = new Piloto();
 
 switch(piloto){
    case 0:  p = new Piloto("Fernando Alonso", "Espanha", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 1:  p = new Piloto("Christian Heins", "Americano", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 2:  p = new Piloto("Ayrton Senna", "Brasileiro", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 3:  p = new Piloto("Filipe Massa", "Brasileiro", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 4:  p = new Piloto("Stefan Bellof", "Alemão", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 5:  p = new Piloto("George Abecassis", "Inglês", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 6:  p = new Piloto("Jean Alesi", "Francês", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 7:  p = new Piloto("Marco Apicella", "Italiano", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 8:  p = new Piloto("Conny Andersson", "Sueco", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 9:  p = new Piloto("Philippe Adams", "Belga", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 10: p = new Piloto("Rubens Barrichello", "Brasileiro", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 11: p = new Piloto("Tom Belsø", "Dinamarquês", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 12: p = new Piloto("Pablo Birger", "Argentino", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 13: p = new Piloto("Allen Berg", "Canadiano", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 14: p = new Piloto("Norberto Fontana", "Argentino", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
    case 15: p = new Piloto("Pedro Lamy", "Portuguesa", a.nextInt(99)+1, a.nextInt(9)+1, a.nextBoolean());
                     break;
            default: break;   
 }
 return p;
}    

}