package ex07;

import java.awt.EventQueue;

import java.awt.*;
import java.applet.Applet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex7 {

  private JFrame frame;
  private DiskPanel colorPanel;
  
  private CurrentColor crrntForeColor = new CurrentColor();
  private CurrentColor crrntBckColor = new CurrentColor();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex7 window = new Ex7();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex7() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel btnPanel_north = new JPanel();
    frame.getContentPane().add(btnPanel_north, BorderLayout.NORTH);
    
    JButton btnRed = new JButton("Red");
    btnRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeRed();
        colorPanel.setBackground(c);
      }
    });
    btnPanel_north.add(btnRed);
    
    JButton btnGreen = new JButton("Green");
    btnGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeGreen();
        colorPanel.setBackground(c);
      }
    });
    btnPanel_north.add(btnGreen);
    
    JButton btnBlue = new JButton("Blue");
    btnBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeBlue();
        colorPanel.setBackground(c);
      }
    });
    btnPanel_north.add(btnBlue);
    
    
    JPanel btnPanel_south = new JPanel();
    frame.getContentPane().add(btnPanel_south, BorderLayout.SOUTH);
    btnPanel_south.setLayout(new GridLayout(2,1));
    
    JPanel btnPanel_foreColor = new JPanel();
    JPanel btnPanel_size = new JPanel();
    btnPanel_south.add(btnPanel_foreColor);
    btnPanel_south.add(btnPanel_size);
    
    JButton btnfRed = new JButton("fRed");
    btnfRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForeColor.changeRed();
        colorPanel.setForeground(c);
      }
    });
    btnPanel_foreColor.add(btnfRed);
    
    JButton btnfGreen = new JButton("fGreen");
    btnfGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForeColor.changeGreen();
        colorPanel.setForeground(c);
      }
    });
    btnPanel_foreColor.add(btnfGreen);
    
    JButton btnfBlue = new JButton("fBlue");
    btnfBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForeColor.changeBlue();
        colorPanel.setForeground(c);
      }
    });
    btnPanel_foreColor.add(btnfBlue);
    
    int large_size = 150;
    int medium_size = 100;
    int small_size = 50;
    
    JButton Large = new JButton("Large");
    Large.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(large_size);
        colorPanel.repaint();
      }
    });
    btnPanel_size.add(Large);
    
    JButton Medium = new JButton("Medium");
    Medium.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(medium_size);
        colorPanel.repaint();
      }
    });
    btnPanel_size.add(Medium);
    
    JButton Small = new JButton("Small");
    Small.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(small_size);
        colorPanel.repaint();
      }
    });
    btnPanel_size.add(Small);
    
    colorPanel = new DiskPanel();
    colorPanel.setBackground(Color.BLACK);
    colorPanel.setForeground(Color.BLACK);
    frame.getContentPane().add(colorPanel, BorderLayout.CENTER);
  }

}
