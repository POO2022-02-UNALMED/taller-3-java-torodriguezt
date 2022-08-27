package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1; 
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	Control control;
	static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		
	}

	public Marca getMarca() {
		return marca;
	}

	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (estado == true && canal<=120 && canal>=1)
			this.canal = canal;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public void cantidadTV() {
		numTV++;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (canal < 120 && estado == true)
			canal++;
	}
	
	public void canalDown() {
		if (canal > 1 && estado == true)
			canal--;
	}
	
	public void volumenUp() {
		if (volumen < 7 && estado == true)
			volumen++;
	}
	
	public void volumenDown() {
		if (volumen > 0 && estado == true)
			volumen--;
	}
}
