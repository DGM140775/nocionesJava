package ejemplo2;

public abstract class Arma {
	private String tipoArma;
	
	public abstract void usar();

	public String getTipoArma() {
		return tipoArma;
	}

	public void setTipoArma(String tipoArma) {
		this.tipoArma = tipoArma;
	}
	
	
	
}
