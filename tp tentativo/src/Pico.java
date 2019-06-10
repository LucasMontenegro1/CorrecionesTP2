
public abstract class Pico extends Herramienta {
	
	@Override
	public abstract void desgastar();

	@Override
	public void usar(Material material) {
		try {
			throw new NoConozcoElMaterialException();
		} catch (NoConozcoElMaterialException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void usar(Madera madera) {
		this.desgastar();
	}

	@Override
	public void usar(Piedra piedra) {
		this.desgastar();
		piedra.recibirDanio(fuerza);
	}
	
	@Override
	public abstract void usar(Metal metal);
	
	
	@Override
	public  void usar(Diamante diamante) {
		this.desgastar();
	}
}
