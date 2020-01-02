import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import java.awt.*;

public class stopwatch{
 public long start,stop;
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame("stopwatch");
		JButton start=new JButton("Start");
		JButton stop=new JButton("Stop");
		start.setBounds(100,120,200,100);
		stop.setBounds(400, 120, 200,100);
		pass p=new pass();
	
		
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				long starttime=System.currentTimeMillis();
				p.start(starttime);
				
			}
		});
		stop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				long stoptime=System.currentTimeMillis();
				long start=p.get();
				long ellapsed=stoptime-start;
				long hour=TimeUnit.MILLISECONDS.toHours(ellapsed);
				long minutes=TimeUnit.MILLISECONDS.toMinutes(ellapsed);
				long seconds=TimeUnit.MILLISECONDS.toSeconds(ellapsed);
				System.out.print("time ellapsed: "+hour+":"+minutes+":"+seconds);
			}
		});
		
	
		
		jf.setVisible(true);
		jf.add(start);
		jf.add(stop);
		jf.setSize(800,800);
		jf.setLayout(null);
		
		
	}

	

}

class pass
{long st;
	public long start(long strt)
	{
		 st=strt;
		return st;
	}
	public long get()
	{
		return st;
	}
}