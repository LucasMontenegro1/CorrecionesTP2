import org.junit.jupiter.api.Test;

class HerramientasTest {

	@Test
	void testHachaVsMadera() {
		Herramienta hacha = new HachaDeMadera();
		Madera madera= new Madera();
		int durabilidad= hacha.getDurabilidad();
		
		hacha.usar(madera);
		
		assert hacha.getDurabilidad()==(durabilidad-2);
		
	}
	
	
	
	
	@Test
	void testPicoVsMadera() {
		Herramienta pico = new PicoDeMadera();
		Madera madera= new Madera();
		int durabilidad= pico.getDurabilidad();
		
		pico.usar(madera);
		
		assert pico.getDurabilidad()==(durabilidad-2);
		
		
	}
	
	
	
	
	@Test
	void testPicoVsPiedra() {
		Herramienta pico = new PicoDePiedra();
		Madera madera= new Madera();
		int durabilidad= pico.getDurabilidad();
		int fuerza= pico.getFuerza();
		
		pico.usar(madera);
		
		assert pico.getDurabilidad()== (int) (durabilidad- fuerza/1.5);
		
		
	}
	
	
	
	
	
	@Test
	public void testPicoDeMetalSeUsaContraDiamanteYSeRompeAlDecimoUso() {

		Diamante diamante = new Diamante();
		Pico pico = new PicoDeMetal();
		int durabilidadHerramienta = pico.getDurabilidad();
		

		for (int i = 0; i < 9; i++) {
			pico.usar(diamante);
		}

		assert pico.getDurabilidad() == durabilidadHerramienta;
		pico.usar(diamante);
		assert pico.getDurabilidad() == 0;

	}
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	

}
