
class Passerotto extends Animale implements InterVolante{

	@Override
	public void verso() {
		System.out.println("Il passerotto cinguetta: Cip Cip");
	}
	
	@Override
    public void mangia() {
        System.out.println("Il passerotto sta mangiando semi.");
    }

	@Override
	public void vola() {
		System.out.println("Il passerotto sta volando!");
	}
	
}
