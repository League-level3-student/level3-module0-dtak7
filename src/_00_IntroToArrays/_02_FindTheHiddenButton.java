package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	// 2 create an integer variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();

	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setVisible(true);
		// window.setSize(700, 700);
		panel.setVisible(true);
		window.add(panel);

		// window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		String positiveNumber = JOptionPane.showInputDialog("enter a POSITIVE number LESS than 275");
		int sizeOfArray = Integer.parseInt(positiveNumber);
		System.out.println(sizeOfArray);
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		buttons = new JButton[sizeOfArray];
		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel
		for (int i = 0; i < sizeOfArray; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		window.setSize(900, 900);

		JOptionPane.showMessageDialog(null, "The goal of the game is to click the button that says HIDE");
		// 9 add the panel to the window

		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.

		// 11. set the JFrame to visible.

		// 12. Give the user the instructions for the game.

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3
		Random rand = new Random();
		int hiddenButton = rand.nextInt(sizeOfArray) + 1;
		buttons[hiddenButton].setText("hide");}
		// 14. Set the text of the JButton located at hiddenButton to read "ME"

		// 15. Use Thread.sleep(100); to pause the program.
		/*try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("no can do");
		}
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText("");
	}
*/
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		if(e.getSource()==buttons[hiddenButton]) {
			System.out.println("you win");
		}
		// 18. else tell them to try again
		else {
			System.out.println("try again");
		}
	}
}
