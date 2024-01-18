import  java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Traffic extends Applet implements Runnable{
Thread t;
static int i;
public void init()
{
	i=0;
	t=new Thread(this);
	t.start();
}
	public void run()
{
	try{
		while(true)
		{
			i++;
			t.sleep(400);
			repaint();
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
}
	public void paint(Graphics g)
	{
		g.fillRect(90,60,70,300);
	//g.drawRect(100,60,50,300);
		if(i==1)
		{
			g.setColor(Color.red);
			g.fillOval(100,100,50,50);
		}
		if(i==2)
		{
			g.setColor(Color.yellow);
			g.fillOval(100,200,50,50);
		}
		if(i==3)
		{
			g.setColor(Color.green);
			g.fillOval(100,300,50,50);
			i=0;
		}
	}

}
