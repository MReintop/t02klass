public class Kehamass{
    
    double a, b;
    
    public Kehamass(double pikkus,double kaal){
		if(pikkus<=0){throw new RuntimeException("Sobimatud mõõdud!");}
		if(kaal <=0){throw new RuntimeException("Sobimatud mõõdud!");}
        
		a=pikkus;
        b=kaal;
	}
    
    public double kehamassiindeks(){
        return b/((a/100)*(a/100));
        
    }
    
    public String toString(){
		return "Inimese kehamassiindeks on"+ kehamassiindeks() +".";
	}
}

//KEHAMASSIINDEKSI ARVUTUS