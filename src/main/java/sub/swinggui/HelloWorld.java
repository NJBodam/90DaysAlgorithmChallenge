package sub.swinggui;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class HelloWorld extends JFrame {

    FlowLayout experimentLayout = new FlowLayout();
    JButton saveButton = new JButton("Save");
    JButton loadButton = new JButton("Load");
    JTextField title = new JTextField("doc.txt", 12);

    public HelloWorld() {
        super("Hello App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
        setLayout(new BorderLayout());
//
//        JLabel nameLabel = new JLabel();
//        nameLabel.setText("Your Name");
//        nameLabel.setBounds(40, 20, 100,30);
//        add(nameLabel);

    }

    public void addComponentsToPane(final Container pane) {
        final JPanel comps = new JPanel();
        comps.setLayout(new FlowLayout());
//        experimentLayout.setAlignment(FlowLayout.TRAILING);
        JPanel controls = new JPanel();
        controls.setLayout(new BorderLayout());
       // experimentLayout.setAlignment(FlowLayout.CENTER);


        JPanel txtPanel = new JPanel();
        txtPanel.setLayout(new FlowLayout());

//        compsToExperiment.add(new TextField());
        comps.add(saveButton, BorderLayout.EAST);
        comps.add(loadButton, BorderLayout.WEST);
        comps.setLayout(new FlowLayout());

        final ButtonGroup group = new ButtonGroup();
//        group.add(saveButton);
//        group.add(loadButton);


        controls.add(title, BorderLayout.WEST);
        controls.add(comps, BorderLayout.LINE_END);
        //controls.add(loadButton);

        JTextArea textArea = new JTextArea(20, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        pane.add(controls, BorderLayout.CENTER);
        pane.add(scrollPane, BorderLayout.SOUTH);

    }

    private static void createShowGUI() {
        //Create and set up the window.
        HelloWorld frame = new HelloWorld();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.setSize(500, 500);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException | IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //Schedule a job for the event dispatchi thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createShowGUI();
            }
        });
    }
}
