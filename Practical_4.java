import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Practical_4 
{
public static void main(String[] args) 
{
        Frame frame = new Frame("Practical No.4 by Monish");
        CardLayout mainCardLayout = new CardLayout();
        frame.setLayout(mainCardLayout);

        Panel firstCard = new Panel();
        firstCard.setLayout(new FlowLayout());
        firstCard.add(new Label("First Card"));

        Button toSecondCard = new Button("Go to Second Card");
        firstCard.add(toSecondCard);

        Panel secondCard = new Panel(new CardLayout());
        Panel subCard1 = new Panel();
        subCard1.add(new Label("Sub Card 1"));

        Panel subCard2 = new Panel();
        subCard2.add(new Label("Sub Card 2"));

        secondCard.add(subCard1, "Sub Card 1");
        secondCard.add(subCard2, "Sub Card 2");

        Button showSubCard1 = new Button("Show Sub Card 1");
        Button showSubCard2 = new Button("Show Sub Card 2");

        showSubCard1.addActionListener(e -> ((CardLayout) secondCard.getLayout()).show(secondCard, "Sub Card 1"));
        showSubCard2.addActionListener(e -> ((CardLayout) secondCard.getLayout()).show(secondCard, "Sub Card 2"));

        Panel buttonPanel = new Panel();
        buttonPanel.add(showSubCard1);
        buttonPanel.add(showSubCard2);

        firstCard.add(buttonPanel);

        frame.add(firstCard, "First Card");
        frame.add(secondCard, "Second Card");

        toSecondCard.addActionListener(e -> mainCardLayout.show(frame, "Second Card"));

        frame.setSize(300, 200);
        frame.setVisible(true);
        mainCardLayout.show(frame, "First Card");

        frame.addWindowListener(new WindowAdapter() 
		{
            public void windowClosing(WindowEvent e) 
			{
                System.exit(0);
            }
        });
    }
}

