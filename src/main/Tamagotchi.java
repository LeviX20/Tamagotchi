package main;

import java.awt.Image;
import java.io.IOException;
import java.sql.Date;

import javax.imageio.ImageIO;

public class Tamagotchi {

	//GET ANIMATION IMAGES
	public static Image idle0;
	
	try {
		idle0 = ImageIO.read(Main.class.getResourceAsStream("/tamagotchi/resources/idleAnim0"));	
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	static String name = "";
	Date birthday = new Date(0);
	
	static double age = 0; //HOW OLD IS IT
	static double hunger = 0;  //HOW HUNGRY IS IT
	static double energy = 100;  //HOW MUCH ENERGY DOES IT HAVE
	static double waste = 0;  //IS THERE WASTE 0/1
	static boolean alive = true; //IF ALIVE IS TRUE, ITS ALIVE;
	
	static final int showHunger = 25;
	static final int showWaste = 1;
	
	static final int deadAge = 100000;
	static final int deadHunger = 100;
	static final int deadEnergy = 0;
	
	static final int evolutionAge0 = 0;//egg
	static final int evolutionAge1 = 1;//baby
	static final int evolutionAge2 = 2;//teen
	static final int evolutionAge3 = 3;//adult
	static final int evolutionAge4 = 4;//old boi
	
	static boolean EATING;	
	static boolean TOILET;
	static boolean ATTENTION;
	static boolean IDLE;
	
	//make animations
	Animation eatingANIMATION = new Animation(idle0, idle0, idle0);
	Animation toiletANIMATION = new Animation(idle0, idle0, idle0);
	Animation attentionANIMATION = new Animation(idle0, idle0, idle0);
	Animation idleANIMAITON = new Animation(idle0, idle0, idle0);
	//make animators
	Animator eatingANIMATOR = new Animator(eatingANIMATION);
	Animator toiletANIMATOR = new Animator(toiletANIMATION);
	Animator attentionANIMATOR = new Animator(attentionANIMATION);
	Animator idleANMATOR = new Animator(idleANIMAITON);
	
	//CONSTRUCTORS
	public Tamagotchi() {
		
	}
	
	public Tamagotchi(double age, double hunger, double energy, double waste) {
		
	}
	
	//SETTERS
	public static void setAge(double h) {
		age = h;
	}
	public static void setHunger(double h) {
		hunger = h;
	}
	public static void setEnergy(double h) {
		energy = h;
	}
	public static void setWaste(double h) {
		waste = h;
	}
	
	
	//GETTERS
	public static double getAge() {
		return age;
	}
	public static double getHunger() {
		return hunger;
	}
	public static double getEnergy() {
		return energy;
	}
	public static double getWaste() {
		return waste;
	}
	
	
	
	public static void evolve(int e) {
		//anim.setAnimation(e)
	}
}
