package presentador;

import java.util.ArrayList;

import modelo.estado.MinisterioIndustria;
import modelo.presupuesto.Presupuesto;
import modelo.ser.Adulto;
import modelo.ser.Ser;

public class Estado {
	
	private long demanda= 0;
	private float porcentajeAumento;
	private long produccionPotencial=0;
	private long produccion;
	
	private int potenciaTrabajador = 450;
	private long capital=0;
	
	private final ArrayList<Ser> seres = new ArrayList<>();
	private final ArrayList<Ser> menores = new ArrayList<>();
	private final ArrayList<Ser> ancianos = new ArrayList<>();
	private MinisterioIndustria ministerioIndustria;
	

	public Estado() {
		for (int i = 0; i < demanda/potenciaTrabajador; i++) {
			naceSer();
		}
		//Esto es la historia
		int historia=0;
		
		do{
			terminarPeriodo();
			comenzarPeriodo();
			historia++;
		}while(historia <120);
	}
	

	private void comenzarPeriodo() {
		// TODO Auto-generated method stub
		long trabajadoresNecesarios= demanda - produccionPotencial;
		ministerioIndustria.contratar(trabajadoresNecesarios);
		long trabajadoresFaltantes= trabajadoresNecesarios-ministerioIndustria.getTrabajadores().size();
		establecerNacimiento(trabajadoresFaltantes);
	}

	private void establecerNacimiento(long trabajadoresFaltantes) {
		// TODO Auto-generated method stub
		
	}


	


	private void terminarPeriodo() {
		// TODO Auto-generated method stub
		capital+= calculamosProduccionPeriodica();
		capital-= pagarCostesFabricacion();
		Presupuesto presupuesto = new Presupuesto(menores.size(), ancianos.size(), ministerioIndustria.getTrabajadores().size(), ministerioIndustria.getParados());
		presupuesto.establecerPorcentajes(capital);
		capital-= presupuesto.getTotal();
		envejecer();
		
	}

	private void envejecer() {
		// TODO Auto-generated method stub
		
	}


	


	private long pagarCostesFabricacion() {
		// TODO Auto-generated method stub
		return 0;
	}


	private long calculamosProduccionPeriodica() {
		// TODO Auto-generated method stub
		return 0;
	}


	private void naceSer() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
