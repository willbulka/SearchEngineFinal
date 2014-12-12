package org.uiowa.cs2820.engine.server;

import java.awt.*;
import java.applet.*;

public class UserInput2 extends Applet
{
      TextField text1, text2;
      String searchTerm;
      
      public void init()
      {
           text1 = new TextField(8);
       
           add(text1);
         
           text1.setText("");
          
      }

      public void paint(Graphics g)
      {
          int x=0,y=0,z=0;
          String s1,s2,s;
          g.drawString("Enter Search Term: ",0,20);
          try
          {
                 s1 = text1.getText();
                 x = Integer.parseInt(s1);
                 s2 = text2.getText();
                 y = Integer.parseInt(s2);
           }
          catch(Exception e) {}

           z = x + y;
           s =  String.valueOf(z);
           g.drawString(" Team 8 Search Engine ",0,75);
           //g.drawString(s,100,90);
           
           searchTerm = text1.getText();
           if (searchTerm.equals("option")) {
        	   g.drawString(" Showing available option ",0,100);
           }
           else if (searchTerm.equals("exit")) {
        	   g.drawString(" Click on the 'X' ",0,100);
           }
    }

    public boolean action(Event event, Object obj)
    {
          repaint();
          return true;
    }
}
