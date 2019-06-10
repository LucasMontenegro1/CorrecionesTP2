
public abstract class Material implements Desgastable {
	int durabilidad;
	
	public void usar(Herramienta herramienta) {
		herramienta.usarContra(this);
	}
	public void recibirDanio(int fuerza) {
		this.durabilidad-=fuerza;
	}
	
	@Override
	public int getDurabilidad() {
		return durabilidad;
	}
}
