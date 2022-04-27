package sub.swinggui;

import javax.swing.*;
import java.awt.*;

public class TextEditor extends JFrame {
    final int WIDTH = 600;
    final int HEIGHT = 400;
    JTextArea textArea;
    Container container;

    public TextEditor() {
        super("Text Editor");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        container = getContentPane();
        textArea = new JTextArea();
        textArea.setName("TextArea");

        JScrollPane scrollableTextArea = new JScrollPane(textArea);
        scrollableTextArea.setName("ScrollPane");
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        container.add(scrollableTextArea, BorderLayout.CENTER);
     //   container.add(upArea(), BorderLayout.NORTH);
        container.add(new JLabel(" "), BorderLayout.SOUTH);
        container.add(new JLabel("    "), BorderLayout.WEST);
        container.add(new JLabel("    "), BorderLayout.EAST);

        JPanel menu = new JPanel();
        menu.setLayout(new FlowLayout(FlowLayout.CENTER));
        JTextField filenameField = new JTextField(30);
        filenameField.setName("FilenameField");

        JButton saveButton = new JButton("Save");
        saveButton.setName("SaveButton");

        JButton loadButton = new JButton("Load");
        loadButton.setName("LoadButton");

        menu.add(filenameField);
        menu.add(saveButton);
        menu.add(loadButton);
        container.add(menu, BorderLayout.NORTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextEditor();
    }
}
