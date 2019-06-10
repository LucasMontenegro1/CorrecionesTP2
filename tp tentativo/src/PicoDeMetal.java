
public class PicoDeMetal extends Pico {
	int usos;
	
	PicoDeMetal(){
		durabilidad = 400;
		fuerza = 12;
		usos = 0;
	}

	@Override
	public void desgastar() {
		usos++;
		if(usos == 10) {
			durabilidad = 0;
		}
	}

	@Override
	public void usarContra(Metal metal) {
		this.desgastar();
		metal.recibirDanio(fuerza);
	}


}
