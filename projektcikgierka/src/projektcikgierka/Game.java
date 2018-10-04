package projektcikgierka;

import java.awt.Color;
import java.awt.Graphics;

public class Game implements Runnable{
	private everything everything1;
	public static final int HEIGHT = 500, WEIGHT = 500;
	
	
	private boolean running = false;
	private Thread thread;
	
	
	public Game() {
		everything1 = new everything();
	
	

		
	}
	
	private void init() 
	{
		
	}
	private void tick() 
	{
		everything1 = new everything();
	}
	private void render()
	{
		
	}
	@Override
	public void run() 
	{
		init();
		
		while(running) 
		{
			tick();
			render();
		}
		stop();
	}
	public synchronized void start() 
	{
		if (running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
    public synchronized void stop() 
    {
    	if (!running)
    		return;
    	running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
