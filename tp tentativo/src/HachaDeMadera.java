
public class HachaDeMadera extends Hacha {
	
	HachaDeMadera(){
		durabilidad=100;
		fuerza=2;
	}

	@Override
	public void desgastar() {
		durabilidad-=fuerza;
	}

}
