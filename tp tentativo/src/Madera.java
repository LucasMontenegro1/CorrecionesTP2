
public class Madera extends Material {
	
	Madera(){
		durabilidad=10;
	}
	
	@Override
	public void usar(Herramienta herramienta) {
		herramienta.usarContra(this);
	}

}
