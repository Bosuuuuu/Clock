package Lab10;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Normal {

	protected Shell shlNormal;
	private Text text;

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
		shlNormal.open();
		shlNormal.layout();
		while (!shlNormal.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlNormal = new Shell();
		shlNormal.setSize(450, 300);
		shlNormal.setText("Normal");
		
		Label lblYourGmt = new Label(shlNormal, SWT.NONE);
		lblYourGmt.setFont(SWTResourceManager.getFont("Times New Roman CE", 20, SWT.NORMAL));
		lblYourGmt.setBounds(55, 73, 129, 39);
		lblYourGmt.setText("Your GMT");
		
		Button btnNewButton = new Button(shlNormal, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(55, 181, 319, 47);
		btnNewButton.setText("Submit Normal Setting ");
		
		text = new Text(shlNormal, SWT.BORDER);
		text.setFont(SWTResourceManager.getFont("Segoe UI", 22, SWT.NORMAL));
		text.setText("");
		text.setBounds(188, 64, 177, 55);

	}
}
