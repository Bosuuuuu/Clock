package Current_Clock;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

public class Alertting {
	private Text txtWakeUp;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Alertting window = new Alertting();
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
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		txtWakeUp = new Text(shell, SWT.BORDER);
		txtWakeUp.setFont(SWTResourceManager.getFont("Segoe UI", 44, SWT.NORMAL));
		txtWakeUp.setText("   Wake Up");
		txtWakeUp.setBounds(37, 59, 347, 121);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
