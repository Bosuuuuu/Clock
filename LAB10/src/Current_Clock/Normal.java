package Current_Clock;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;



import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Normal {

	protected Shell shell;
	private Text text;
	public int GMT = 0;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Normal window = new Normal();
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
		shell.setSize(450, 300);
		shell.setText("Normal");
		Clock window1 = new Clock();
		
		
		Label lblYourGmt = new Label(shell, SWT.NONE);
		lblYourGmt.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		lblYourGmt.setBounds(24, 86, 176, 42);
		lblYourGmt.setText("Your GMT");
		
		text = new Text(shell, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont("Segoe UI", 30, SWT.NORMAL));
		text.setBounds(206, 68, 220, 77);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				

				GMT = Integer.parseInt(text.getText());	
				window1.r = GMT;
				shell.close();
				
	
			}
		});
		btnNewButton.setBounds(20, 161, 406, 77);
		btnNewButton.setText("Summit Normal Setting");

	}
	
	
	public int getGMT() {
		
		return this.GMT ;
	}//end method

	
}