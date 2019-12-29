package com.prototype.prototype01;

import javafx.geometry.Point3D;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10, 0, 0), 20);
        s1.attack();
        System.out.println(s1);
        
        Swordsman s2 = (Swordsman)s1.clone();
        System.out.println("Cloned swordsman "+ s2);
        
        General g1 = new General();
        g1.move(new Point3D(5, 5, 0), 30);
        g1.boostMorale();
        System.out.println(g1);
	}

}
