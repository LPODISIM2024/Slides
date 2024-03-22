package slide5_16;

public class LibroSuJava extends Libro {
	
	public LibroSuJava() {
		super();//PROVATE AD eliminare
		System.out.println("Costruttore LibroSuJava");
	}
	
    public LibroSuJava (String titolo) {
    	
//        super(titolo); PROVATRE AD AGGIUNGERE
        System.out.println("Costruttore LibroSuJava");
    }
    
    public LibroSuJava (String titolo, String autore){
        super(titolo, autore);
        System.out.println("Costruttore LibroSuJava ");
    }
}