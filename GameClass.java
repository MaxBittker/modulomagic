import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.JFrame;


public class GameClass extends Canvas implements Runnable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public static final int WIDTH = 100;
	public static final int HEIGHT = 100;
	public static final int SCALE = 7;
	public static final String NAME = "JAR";


	
	private JFrame frame;
	
	public Boolean running = false;
	public int tickCount = 0;
	
	private BufferedImage image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
	private int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
	
	public GameClass(){
		setMinimumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		setMaximumSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
	
		frame = new JFrame(NAME);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		frame.add(this, BorderLayout.CENTER);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public synchronized void start(){
	running = true;
		new Thread(this).start();
	}

	public synchronized void stop(){
		running = false;
	}
	@Override
	
	public void run() {
		long lastTime = System.nanoTime();
		double nsPerTick = 1000000000D/30D;
		int ticks = 0;
		int frames = 0;
		
		long lastTimer = System.currentTimeMillis();
		double delta = 0;
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime)/nsPerTick;
			lastTime = now;
			boolean shouldRender = true;
			
			while( delta >= 1){
				ticks++;
				tick();
				delta -=1;
				shouldRender = true;
			}
			try{
			Thread.sleep(2);
		}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(shouldRender){
			frames++;
			render();
			}
			
			if(System.currentTimeMillis()-lastTimer >=1000){
				lastTimer +=1000;
				System.out.println(frames + ","+ ticks);
				frames = 0;
				ticks = 0;
			}
		}
		
		
	}
	public void tick(){
		tickCount++;
		
		for(int i =0;i < pixels.length; i++){
			//pixels[i] = i + tickCount;
			pixels[i] = i % tickCount * tickCount;}
		
		}
	

	public void render(){
		BufferStrategy bs = getBufferStrategy();
		if(bs == null){
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0,0,getWidth(),getHeight());
		
		g.drawImage(image, 0,0,getWidth(),getHeight(),null);
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, getWidth(), getHeight());
		g.dispose();
		bs.show();
	}
	
	public static void main(String[] args){
	{new GameClass().start();
	}
	
	
	
	}

}
