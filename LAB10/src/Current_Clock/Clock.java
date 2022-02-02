package Current_Clock;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.wb.swt.SWTResourceManager;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.eclipse.ui.forms.widgets.FormToolkit;


public class Clock {
	protected Shell shell;
	

	SimpleDateFormat timeFormat;	

	private String JH;
	private String JM;
	private String JS;
	public int Gmt  = 0;
	public int r  = 0;
	public int ah  = 0;
	public int am = 0;
	public int as  = 0;
	Normal Nm = new Normal();
	//Normal Nm = new Normal();
	Alert Al = new Alert();
	//Alert2 Al2 = new Alert2();
	//Countdown Cd = new Countdown();
	private Text Min;
	private Text Sec;
	private Text Hour;
	private int  sec ;
	private int  minute ;
	private int  hour ;

	public static void main(String[] args) {
		

		try {
			
			Clock window = new Clock();
			window.open();
		 	

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	public void open() {
		Display display = Display.getDefault();
		setTime();
		createContents();
		shell.open();
		shell.layout();
	
		while (!shell.isDisposed()) {
			
			if (!display.readAndDispatch()) {
				
				display.sleep();
			
			}
		}
		
	}


	
	
	/**
	 * Create contents of the window.
	 */
	
	protected void createContents() {
		shell = new Shell();
		shell.setSize(473, 327);
		shell.setText("Current Clock");

	    
		//setTime();
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(30, 10, 415, 136);
		
		Label lblHour = new Label(composite, SWT.NONE);
		lblHour.setBounds(72, 10, 59, 14);
		lblHour.setText("Hour");
		
		Label lblMinute = new Label(composite, SWT.NONE);
		lblMinute.setBounds(189, 10, 59, 14);
		lblMinute.setText("Minute");
		
		Label lblSecond = new Label(composite, SWT.NONE);
		lblSecond.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 11, SWT.NORMAL));
		lblSecond.setBounds(316, 10, 59, 14);
		lblSecond.setText("Second");
		
		Hour = new Text(composite, SWT.BORDER | SWT.MULTI);
		Hour.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		Hour.setEditable(false);
		Hour.setBounds(35, 30, 102, 79);
		
		Min = new Text(composite, SWT.BORDER);
		Min.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		Min.setEditable(false);
		Min.setBounds(161, 30, 102, 79);
		
		Sec = new Text(composite, SWT.BORDER);
		Sec.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 30, SWT.NORMAL));
		Sec.setEditable(false);
		Sec.setBounds(288, 30, 102, 79);
		//formToolkit.adapt(text, true, true);
		
		//test Fetch
		
		
		
		Button btnNormal = new Button(shell, SWT.NONE);
		btnNormal.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				
			/*	Nm.open();
					
				Gmt = Nm.getGMT();
				if(Gmt >=24) {
					Gmt = Gmt - 24;
					
				}*/

					
				
			}
		});
		btnNormal.setBounds(41, 166, 177, 49);
		btnNormal.setText("Normal");
		
		Button btnAlert = new Button(shell, SWT.NONE);
		btnAlert.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					
				
				Al.open();
				setAlert();		
				
			}
		});
		btnAlert.setBounds(247, 166, 177, 49);
		btnAlert.setText("Alert");
		
		Button btnCountdown = new Button(shell, SWT.NONE);
		btnCountdown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			//	Cd.open();
				
			}
		});
		btnCountdown.setBounds(41, 231, 177, 49);
		btnCountdown.setText("Countdown");
		
		Button btnstop = new Button(shell, SWT.NONE);
		btnstop.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnstop.setBounds(247, 231, 177, 49);
		btnstop.setText("Stop");
		


	}
	
	
	public void setTime() {
		
		new Thread(new Runnable() {
		      public void run() {
		         while (true) {
		            try { Thread.sleep(1000); } catch (Exception e) { }
		            Display.getDefault().asyncExec(new Runnable() {
		               public void run() {
		            	   
								Calendar cal = new GregorianCalendar();
								minute = cal.get(Calendar.MINUTE);
								hour = cal.get(Calendar.HOUR_OF_DAY);
								sec = cal.get(Calendar.SECOND);
								
			
								hour = hour+Gmt;
								
								
								if(hour >=12) {
									
									hour = hour- 12;
									
								}
								
								if(hour == ah && minute == am && sec == as) {
									
								//	Al2.open();
									
									
								}
								
								JH =""+hour;
								JM =""+minute;
								JS =""+sec;
								Hour.setText(JH);
								Min.setText(JM);
								Sec.setText(JS);

		               }
		            });
		         }
		      }
		   }).start();
		
		
		
		
	}
	
	public void setAlert() {
		
	//	 ah = Al.h ;
	//	 am = Al.m ;
	//	 as = Al.s;

		
	}
	
}
