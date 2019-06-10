
public class PicoDePiedra extends Pico {
	
	PicoDePiedra(){
		durabilidad = 200;
		fuerza = 4;
	}
	

	@Override
	public void desgastar() {
		durabilidad -= (fuerza/1.5);
	}

	@Override
	public void usar(Metal metal) {
		this.desgastar();
		metal.recibirDanio(fuerza);
	}



}
