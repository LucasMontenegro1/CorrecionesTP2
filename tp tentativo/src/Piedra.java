
public class Piedra extends Material {
	
	Piedra(){
		this.durabilidad=30;
	}
	
	@Override
	public void usar(Herramienta herramienta) {
		herramienta.usarContra(this);
	}
}
