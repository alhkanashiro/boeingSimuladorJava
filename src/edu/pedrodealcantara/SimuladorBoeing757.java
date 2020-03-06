package edu.pedrodealcantara;

public class SimuladorBoeing757 {
	   public static void main (String[] args) {
	      Boeing757 boing = new Boeing757();
	      boing.performanceVoar();
	      boing.performancePousar();
	      boing.setVoar(new VoarNoite());
	      boing.setPousar(new PousarNoite());
	      boing.performanceVoar();
	      boing.performancePousar();
	   }
	}
