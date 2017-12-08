package main;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main extends JPanel{
	static int minute = 0;
	public static Image image;
	static JFrame frame;
	public static void main(String args[]) {
		try {
			image = ImageIO.read(Main.class.getResourceAsStream("tamagatchiBackground.png"));	
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		frame = new JFrame();
		frame.getHeight();
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		Main main = new Main();
		frame.add(main);
		
		//start program initialization commands
		Tamagotchi.setName(JOptionPane.showInputDialog("What is your Tamagotchi's name?"));
		System.out.println("Name: "+Tamagotchi.getName());
		
		
		//start tick loop
		if(Tamagotchi.alive) {
			try {
		        while (true) {
		        	//AGE++ WASTE++ HUNGER++ ENERGY--
		        	minute++;
		        	System.out.println("minute:"+minute);

		        	//AGE
		        	Tamagotchi.setAge(Tamagotchi.age+=0.01);
		        	System.out.println("age:"+Tamagotchi.getAge());
		        	
		        	//HUNGER
		        	Tamagotchi.setHunger(Tamagotchi.hunger-=0.03125); //dies in 2 days
		        	System.out.println("hunger:"+Tamagotchi.getHunger());
		        	
		        	//ENERGY
		        	Tamagotchi.setEnergy(Tamagotchi.energy-=0.03125);
		        	System.out.println("energy:"+Tamagotchi.getEnergy());
		        	
		        	//WASTE
		        	Tamagotchi.setWaste(Tamagotchi.waste+=0.20);
		        	System.out.println("waste:"+Tamagotchi.getWaste());
		        	
		        	//CHECK STATS
		        	
		        	//IF EVOLVING
		        	if((Tamagotchi.getAge()% 1.0) == 0) { //if a whole number
		        		int evolution = (int) Tamagotchi.getAge();
		        		Tamagotchi.evolve(evolution);
		        	}
		        	
		        	//IF DEADAGE
		        	if(Tamagotchi.getAge() >= Tamagotchi.deadAge) {
		        		Tamagotchi.alive = false;
		        		Tamagotchi.dead();
		        	}
		        	//IFDEADHUNGER
		        	if(Tamagotchi.getHunger() <= Tamagotchi.deadHunger);{
		        		Tamagotchi.alive = false;
		        		Tamagotchi.dead();
		        	}
		        	//IF DEADENERGY
		        	if(Tamagotchi.getEnergy() <= Tamagotchi.deadEnergy) {
		        		Tamagotchi.alive = false;
	        			Tamagotchi.dead();
		        	}
		        	
		        	
		        	Thread.sleep(60*1000); //every minute
		        }
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}
		
	}
	
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0,frame.getWidth(),frame.getHeight(), null);
	}
}
//image.getWidth(null)*frame.getHeight()/image.getHeight(null),frame.getHeight()
