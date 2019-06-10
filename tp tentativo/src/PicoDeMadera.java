
public class PicoDeMadera extends Pico {

	PicoDeMadera(){
		durabilidad = 100;
		fuerza = 2;
	}
	

	@Override
	public void desgastar() {
		durabilidad -= fuerza;
	}

	@Override
	public void usar(Metal metal) {
		this.desgastar();

	}


}
