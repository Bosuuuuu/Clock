package Current_Clock;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;


import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Alert {
	private Text Hour;
	private Text Minute;
	private Text Second;
	public int h = 0;
	public int m = 0;
	public int s = 0;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Alert window = new Alert();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		Shell shlAlert = new Shell();
		shlAlert.setSize(450, 300);
		shlAlert.setText("Alert");
		Clock cl = new Clock();
		
		Composite composite = new Composite(shlAlert, SWT.NONE);
		composite.setBounds(10, 10, 415, 136);
		
		Label lblHour = new Label(composite, SWT.NONE);
		lblHour.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblHour.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblHour.setText("Hour");
		lblHour.setBounds(54, 2, 84, 25);
		
		Label lblMinute = new Label(composite, SWT.NONE);
		lblMinute.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblMinute.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblMinute.setText("Minute");
		lblMinute.setBounds(172, 2, 76, 22);
		
		Label lblSecond = new Label(composite, SWT.NONE);
		lblSecond.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblSecond.setText("Second");
		lblSecond.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblSecond.setBounds(299, 2, 76, 22);
		
	
		
		Hour = new Text(composite, SWT.BORDER );
		Hour.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		Hour.setBounds(35, 30, 102, 79);
		
		Minute = new Text(composite, SWT.BORDER);
		Minute.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		Minute.setBounds(161, 30, 102, 79);
		
		Second = new Text(composite, SWT.BORDER);
		Second.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		Second.setBounds(288, 30, 102, 79);
		
		
		Button btnNewButton = new Button(shlAlert, SWT.NONE);
		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				/*Clock window = new Clock() ;
				Object answer;
				window.setI(answer);*/
				h = Integer.parseInt(Hour.getText());	
				m = Integer.parseInt(Minute.getText());	
				s = Integer.parseInt(Second.getText());	

				
				cl.ah = h;
				cl.am = m;
				cl.as = s;
				shlAlert.close(); 
			}
		});
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnNewButton.setBounds(46, 169, 351, 67);
		btnNewButton.setText("Submit Alert Setting");

		shlAlert.open();
		shlAlert.layout();
		while (!shlAlert.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
