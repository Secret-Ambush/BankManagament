import java.awt.*;
import javax.swing.*;
class NewFrames{ //Class to create new Frames 
    public NewFrames(String title){
        JFrame f = new JFrame(title);
    Toolkit tk=Toolkit.getDefaultToolkit();  
        int xsize=(int)tk.getScreenSize().getWidth(); //to get width of the screen
        int ysize=(int)tk.getScreenSize().getHeight(); //to get height of the screen
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(xsize,ysize);
        f.setResizable(false);
        ImageIcon banklogo = new ImageIcon("bank logo.png");
        f.setIconImage(banklogo.getImage());
    }
}

public class BankManagement{ //main method
    public static void main(String[] args) {
        NewFrames mainframe = new NewFrames("HARK BANKING");//Creating a main frame 
       JLabel main1 = new JLabel("Hello there");
        mainframe.add(main1);
        
    }
}