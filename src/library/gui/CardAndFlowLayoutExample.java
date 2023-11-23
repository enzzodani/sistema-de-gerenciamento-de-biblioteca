package library.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardAndFlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout and FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando um JPanel principal com CardLayout
        JPanel cardPanel = new JPanel(new CardLayout());

        // Criando "cartões" (painéis) com diferentes layouts para o CardLayout
        JPanel card1 = new JPanel(new FlowLayout());
        JPanel card2 = new JPanel(new FlowLayout());

        // Adicionando componentes aos cartões
        card1.add(new JLabel("Cartão 1 - FlowLayout"));
        card1.add(new JButton("Botão 1"));

        card2.add(new JLabel("Cartão 2 - FlowLayout"));
        card2.add(new JButton("Botão 2"));

        // Adicionando cartões ao JPanel principal
        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");

        // Adicionando um botão para alternar entre os cartões
        JButton nextButton = new JButton("Próximo Cartão");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                cardLayout.next(cardPanel);
            }
        });

        // Adicionando componentes ao JFrame principal
        frame.setLayout(new BorderLayout());
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(nextButton, BorderLayout.SOUTH);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
