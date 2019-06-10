
public class HachaDePiedra extends Hacha {
	
	HachaDePiedra(){
		durabilidad = 200;
		fuerza = 5;
	}
	
	@Override
	public void desgastar() {
			durabilidad -= fuerza;		
		}

}
