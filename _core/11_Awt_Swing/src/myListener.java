import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class myListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setText("버튼이클릭되었습니다");
	}

}
