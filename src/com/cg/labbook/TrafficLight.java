
package com.cg.labbook;

import java.awt.*;
//import java.awt.event.*;



public class TrafficLight
{
       TrafficLight() 
       {	
       Frame f = new Frame("CheckBox Example");
       Checkbox checkbox1 = new Checkbox("Red");
       checkbox1.setBounds(100, 100, 50, 50);
       
       Checkbox checkbox2 = new Checkbox("Yellow");
       checkbox2.setBounds(100, 150, 50, 50);
       
       Checkbox checkbox3 = new Checkbox("Green");
       checkbox3.setBounds(100, 200, 50, 50);
       
       f.add(checkbox1);
       f.add(checkbox2);
       f.add(checkbox3);
       f.setSize(400, 400);
       f.setLayout(null);
       f.setVisible(true);
       
       }

	public static void main(String[] args) {
		new TrafficLight();
	}
}