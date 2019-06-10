
public abstract class Herramienta implements Desgastable {
	int durabilidad;
	int fuerza;
	
	public int getDurabilidad(){
		return this.durabilidad;
	}

	public void usar(Material unMaterial) {
		unMaterial.usar(this);
	}
	
	public abstract void desgastar();
	
	
	public abstract void usarContra(Material material);
	public abstract void usarContra(Madera madera);
	public abstract void usarContra(Metal metal);
	public abstract void usarContra(Piedra piedra);
	public abstract void usarContra(Diamante diamante);

	public int getFuerza() {
		return fuerza;
	}
	
	
}
