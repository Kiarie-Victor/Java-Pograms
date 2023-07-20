import javax.swing.*;

public class WordCount {
    public static void main(String[] args) {
        // Create the GUI components
        JLabel inputLabel = new JLabel("Enter a text string:");
        JTextField inputField = new JTextField(20);
        JButton countButton = new JButton("Count Words");
        JLabel outputLabel = new JLabel("The number of words in the text string is:");
        JTextField outputField = new JTextField(5);
        outputField.setEditable(false);
        
        // Create a panel to hold the GUI components
        JPanel panel = new JPanel();
        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(countButton);
        panel.add(outputLabel);
        panel.add(outputField);
        
        // Create the frame and add the panel
        JFrame frame = new JFrame("Word Count");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
        // Add an action listener to the count button
        countButton.addActionListener(e -> {
            String text = inputField.getText();
            int wordCount = countWords(text);
            outputField.setText(Integer.toString(wordCount));
        });
    }
    
    public static int countWords(String text) {
        int wordCount = 0;
        boolean isWord = false;
        int end = text.length() - 1;

        for (int i = 0; i <= end; i++) {
            // If the current character is a letter, it is part of a word
            if (Character.isLetter(text.charAt(i)) && i != end) {
                isWord = true;
            // If the current character is not a letter, the word has ended
            } else if (!Character.isLetter(text.charAt(i)) && isWord) {
                wordCount++;
                isWord = false;
            // If the current character is a letter and it is the last character in the text string, it is part of a word
            } else if (Character.isLetter(text.charAt(i)) && i == end) {
                wordCount++;
            }
        }

        return wordCount;
    }
}
