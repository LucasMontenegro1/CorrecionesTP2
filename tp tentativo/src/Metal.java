
public class Metal extends Material {

	Metal(){
		this.durabilidad=50;
	}
	
	@Override
	public void usar(Herramienta herramienta) {
		herramienta.usarContra(this);
	}
}
