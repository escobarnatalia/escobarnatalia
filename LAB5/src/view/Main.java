package view;

import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	Controller controller;
	PImage arrow;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(800, 800);
	}

	public void setup() {
		controller = new Controller(this);
		arrow = loadImage("img/1.png");

	}

	public void draw() {
		background(36, 3, 62);
		// controller.addLogic();
		controller.pintarLogic();
		image(arrow, 600,250);

	}

	public void mousePressed() {
		controller.ordenarNaturalLogic();
	}

	public void keyPressed() {

		switch (keyCode) {
		case UP:
			controller.ordenParcialLogic();
			break;
		case DOWN:
			controller.ordenParcial2Logic();
			break;
		case LEFT:
			controller.ordenParcial3Logic();
		case RIGHT:
			controller.ordenParcial4Logic();
			

		}
	}

}
