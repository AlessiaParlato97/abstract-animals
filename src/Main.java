// Classe eseguibile

public class Main {
	
	public static void main(String[] args) {
		
		Cane cane = new Cane();
		cane.dormi();
		cane.verso();
		cane.mangia();
		
		Passerotto passerotto = new Passerotto();
		passerotto.dormi();
		passerotto.verso();
		passerotto.mangia();
		
		Aquila aquila = new Aquila();
        aquila.dormi();
        aquila.verso();
        aquila.mangia();
        
        Delfino delfino = new Delfino();
        delfino.dormi();
        delfino.verso();
        delfino.mangia();
        
        
        faiVolare(passerotto);
        faiVolare(aquila);
        faiNuotare(delfino);
        
	}
	
	public static void faiVolare(InterVolante animale) {
    	animale.vola();
    }
	
	public static void faiNuotare(InterNuotante animale) {
		animale.nuota();
	}

}
