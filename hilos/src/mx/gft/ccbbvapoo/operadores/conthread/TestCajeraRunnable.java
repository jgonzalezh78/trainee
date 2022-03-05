package mx.gft.ccbbvapoo.operadores.conthread;

import mx.gft.ccbbvapoo.operadores.sinthread.Cajera;
import mx.gft.ccbbvapoo.operadores.sinthread.Cliente;

public class TestCajeraRunnable implements Runnable{

	private Cliente cliente;
	private Cajera cajera;
	private long initialTime;
	
	public TestCajeraRunnable (Cliente cliente, Cajera cajera, long initialTime){
		this.cajera = cajera;
		this.cliente = cliente;
		this.initialTime = initialTime;
	}

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
		
		Cajera cajera1 = new Cajera("Cajera 1");
		Cajera cajera2 = new Cajera("Cajera 2");
		
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		
		Runnable proceso1 = new TestCajeraRunnable(cliente1, cajera1, initialTime);
		Runnable proceso2 = new TestCajeraRunnable(cliente2, cajera2, initialTime);

		ThreadGroup group = new ThreadGroup("MiProceso");
		
		Thread d = new Thread(group,proceso1);
		Thread d2 = new Thread(group,proceso2);
		d.start();
		d2.start();
		
		
		
		//d.start();
		//new Thread(proceso1).start();

	}

	@Override
	public void run() {
		this.cajera.procesarCompra(this.cliente, this.initialTime);
		
		
	}

	
}
