
class Delfino extends Animale implements InterNuotante{

	
	@Override
    public void verso() {
        System.out.println("Il delfino emette vocalizzi : Click click!");
    }
	
	@Override
    public void mangia() {
        System.out.println("Il delfino sta mangiando pesce.");
    }
	
	@Override
	public void nuota() {
		System.out.println("Il delfino sta nuotando!");
	}
}
