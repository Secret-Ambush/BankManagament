import java.awt.*;
import javax.swing.*;
class NewFrames extends JFrame{ //Class to create new Frames 
    NewFrames(String title){
    Toolkit tk=Toolkit.getDefaultToolkit();  
        int xsize=(int)tk.getScreenSize().getWidth(); //to get width of the screen
        int ysize=(int)tk.getScreenSize().getHeight(); //to get height of the screen
        this.setTitle(title);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(xsize,ysize);
        this.setResizable(false);
        ImageIcon banklogo = new ImageIcon("bank logo.png");
        this.setIconImage(banklogo.getImage());
    }
}

public class BankManagement{ //main method
    public static void main(String[] args) {
        NewFrames mainframe = new NewFrames("HARK BANKING SOFTWARE");//Creating a main frame 
        JLabel main1 = new JLabel("Hello There");
        main1.setVisible(true);
        mainframe.add(main1);
        
    }
}