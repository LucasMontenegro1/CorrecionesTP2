
public abstract class Hacha extends Herramienta{
	
	@Override
	public abstract void desgastar();

	@Override
	public void usarContra(Madera madera) {
		madera.recibirDanio(fuerza);
		this.desgastar();
	}
	
	@Override
	public void usarContra(Metal metal) {
		this.desgastar();
	}

	@Override
	public void usarContra(Piedra piedra) {
		this.desgastar();
		
	}
	
	@Override
	public void usarContra(Diamante diamante) {
		this.desgastar();
		
	}
	
	@Override
	public void usarContra(Material material) {
		try {
			throw new NoConozcoElMaterialException();
		} catch (NoConozcoElMaterialException e) {
			e.printStackTrace();
		}
		
	}

	
	
	

}
