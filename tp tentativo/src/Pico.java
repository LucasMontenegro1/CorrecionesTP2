
public abstract class Pico extends Herramienta {
	
	@Override
	public abstract void desgastar();

	@Override
	public void usarContra(Material material) {
		try {
			throw new NoConozcoElMaterialException();
		} catch (NoConozcoElMaterialException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void usarContra(Madera madera) {
		this.desgastar();
	}

	@Override
	public void usarContra(Piedra piedra) {
		this.desgastar();
		piedra.recibirDanio(fuerza);
	}
	
	@Override
	public abstract void usarContra(Metal metal);
	
	
	@Override
	public  void usarContra(Diamante diamante) {
		this.desgastar();
	}
}
