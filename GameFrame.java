import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){ 
			
		this.add(new GamePanel());////shortcut for GramePanel panel= new GamePanel() 
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}