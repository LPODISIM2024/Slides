package slide5_16;

public class Libro {
	private String titolo;
	private String autore;
	private String editore;
	private int numeroPagine;
	private int prezzo;
	
	public Libro() {//PROVATE AD eliminare
		System.out.println("Costruttore Libro");
	}

	public Libro(String titolo, String autore) {
		this(titolo);
		System.out.println("Costreuttore Libro");
		setAutore(autore);
	}

	public Libro(String titolo) {//PROVATE AD eliminare
		this.setTitolo(titolo);
		System.out.println("Costreuttore Libro");
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

}

