package modelo5Observer;

public class Presupuesto {
	private EstadoEnsayo estado;
	private int necesitadVitalMenores=Edades.menor.getNecesidadVital();
	private int necesitadVitalAnciano=Edades.anciano.getNecesidadVital();
	private int necesitadVitalAdulto= necesitadVitalAdulto();
	
	
	public int necesitadVitalAdulto() {
		boolean trabaja=true;
		int necesitadVitalAdulto=0;
		if (trabaja) {
			necesitadVitalAdulto=Edades.adulto.getNecesidadVital()*2;
		}else {
			necesitadVitalAdulto=Edades.adulto.getNecesidadVital();
		}
		return necesitadVitalAdulto;
		
	}
	public int calcularSueldo() {
		int sueldo=0;
		int totalNecesidades = Edades.adulto.getNecesidadVital()+Edades.anciano.getNecesidadVital()+necesitadVitalAdulto;
		sueldo=totalNecesidades;
		
		return sueldo;
	}
	
	public void ajustarPresupuesto() {
		if (estado.getAhorros()<calcularSueldo()) {
			
		}
	}
	
	
	
}
