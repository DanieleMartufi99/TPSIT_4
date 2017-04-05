package verifica2203.martufi;

public class retta {
    
    public double a;
    public double b;
    public double c;
    public retta(double x,double y,double z){
        this.a=x;
        this.b=y;
        this.c=z;
    }
    public String stampa(){
        String s;
        s=this.a+"x+"+this.b+"y+"+this.c+"=0";
        return s;
    }
    public String getTipo(){
        return ""; 
    }
}
