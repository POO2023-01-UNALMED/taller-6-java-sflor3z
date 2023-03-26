package vehiculos;

public class Automóvil extends Vehiculo{
	private int puestos;
	private static int cantidadAutomoviles = 0;
	
	public Automóvil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantidadAutomoviles++;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	public static int getCantidadAutomoviles() {
		return Automóvil.cantidadAutomoviles;
	}
}
