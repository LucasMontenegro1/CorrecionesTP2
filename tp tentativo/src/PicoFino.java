
public class PicoFino extends Herramienta {
	
	PicoFino(){
		durabilidad = 1000;
		fuerza = 20;
	}

	@Override
	public void desgastar() {
		durabilidad -= durabilidad * 0.1;
	}

	@Override
	public void usarContra(Material material) {	

	}
	@Override
	public void usarContra(Madera madera) {
	}

	@Override
	public void usarContra(Metal metal) {
	}

	@Override
	public void usarContra(Piedra piedra) {
	}

	@Override
	public void usarContra(Diamante diamante) {
		this.desgastar();
		diamante.recibirDanio(fuerza);
	}

}
