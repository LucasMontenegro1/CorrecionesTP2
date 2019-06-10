
public class Diamante extends Material {
	
	Diamante(){
		this.durabilidad=100;
	}
	
	
	@Override
	public void usar(Herramienta herramienta) {
		herramienta.usarContra(this);
	}
}
