public class Proovikene{
	public static void main(String[] args){
        Kehamass inimene1=new Kehamass(180.0, 60.0);
		Kehamass inimene2=new Kehamass(164.0, 55.0);
		Kehamass inimene3=new Kehamass(170.0, 80.0);
        System.out.println(inimene1.kehamassiindeks());
		System.out.println(inimene2.kehamassiindeks());
        System.out.println(inimene3.kehamassiindeks());
		System.out.println(inimene2.toString());
    }
}
//KEHAMASSIINDEKSI ARVUTUS