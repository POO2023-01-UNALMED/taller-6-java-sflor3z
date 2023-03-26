package vehiculos;

public class Camion extends Vehiculo{
	int ejes;
	static int cantidadCamiones = 0;
	
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X4", fabricante);
		this.ejes = ejes;
		cantidadCamiones++;
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}
}
