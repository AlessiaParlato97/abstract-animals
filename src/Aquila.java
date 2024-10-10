
class Aquila extends Animale implements InterVolante{
	
	@Override
    public void verso() {
        System.out.println("L'Aquila stride: Screee!");
    }
	
	@Override
    public void mangia() {
        System.out.println("L'Aquila sta mangiando carne.");
    }

	@Override
	public void vola() {
		System.out.println("L'Aquila sta volando!");
	}
}
