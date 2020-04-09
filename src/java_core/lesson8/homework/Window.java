package java_core.lesson8.homework;

import java_core.lesson8.homework.Figures.Figures;
import java_core.lesson8.homework.Figures.Line;
import java_core.lesson8.homework.Figures.Oval;
import java_core.lesson8.homework.Figures.Rectangle;

import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Window extends JFrame {
    static Figures figures = Figures.LINE;
    static Point p1 = new Point(0, 0);
    static Point p2 = new Point(0, 0);
    static JFrame frame = new JFrame("Painter");
    static JPanel panel = new JPanel();
    static ArrayList<JComponent> list = new ArrayList<>();

    public static void main(String[] args) {
        //Creating the Frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();

        JMenu m1 = new JMenu("Figures");
        JMenu m2 = new JMenu("Actions");
        mb.add(m1);
        mb.add(m2);
        //Figures menu
        JMenuItem m11 = new JMenuItem("Line");
        JMenuItem m12 = new JMenuItem("Rectangle");
        JMenuItem m13 = new JMenuItem("Oval");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);

        //Actions menu
        JMenuItem m21 = new JMenuItem("Save");
        JMenuItem m22 = new JMenuItem("Reset");
        m2.add(m21);
        m2.add(m22);


        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("");
        JButton line = new JButton("Line");
        JButton rect = new JButton("Rectangle");
        JButton oval = new JButton("Oval");
        JButton save = new JButton("Save");
        JButton reset = new JButton("Reset");

        panel.add(label); // Components Added using Flow Layout

        panel.add(line);
        panel.add(oval);
        panel.add(rect);
        panel.add(save);
        panel.add(reset);

        // Text Area at the Center
        JLayeredPane jLayeredPane = new JLayeredPane();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, jLayeredPane);

        jLayeredPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(e);
                label.setText("x: " + e.getX() + " y: " + e.getY());
                p1.x = e.getX();
                p1.y = e.getY();
                System.out.println("p1: " + p1.toString());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                //  super.mouseMoved(e);
                System.out.println(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println(e);
                label.setText("x: " + e.getX() + " y: " + e.getY());
                p2.x = e.getX();
                p2.y = e.getY();
                System.out.println("p2: " + p2.toString());
                // System.out.println(list.size());
                switch (figures) {
                    case OVAL:
                        System.out.println("OVAL");
                        list.add(new Oval(p1.x, p1.y, p2.x, p2.y));
                        frame.getContentPane().add(BorderLayout.CENTER, new Oval(p1.x, p1.y, p2.x, p2.y));
                        break;

                    case RECTANGLE:
                        System.out.println("RECTANGLE");
                        list.add(new Rectangle(p1.x, p1.y, p2.x, p2.y));
                        frame.getContentPane().add(BorderLayout.CENTER, new Rectangle(p1.x, p1.y, p2.x, p2.y));
                        break;
                    case LINE:
                        System.out.println("LINE");
                        list.add(new Line(p1.x, p1.y, p2.x, p2.y));
                        frame.getContentPane().add(BorderLayout.CENTER, new Line(p1.x, p1.y, p2.x, p2.y));
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value");
                }
                SwingUtilities.updateComponentTreeUI(frame);
               /* for (int i = 0; i < list.size(); i++) {
                *    frame.getContentPane().add(BorderLayout.CENTER, list.get(i));
               }*/

            }

        });

        oval.addActionListener(e -> {
            System.out.println("oval");
            figures = Figures.OVAL;
        });

        rect.addActionListener(e -> {
            System.out.println("rect");
            figures = Figures.RECTANGLE;

        });

        line.addActionListener(e -> {
            System.out.println("line");
            figures = Figures.LINE;
        });

        reset.addActionListener(e -> {
            System.out.println("reset");
            //jLayeredPane.repaint();
            //frame.getContentPane().remove(jLayeredPane);
            //frame.getContentPane().add(new JLayeredPane()).setVisible(true);
            //frame.getContentPane().add(jLayeredPane);
            //add(BorderLayout.CENTER, jLayeredPane);
            list.clear();
            //jLayeredPane.getGraphics().clearRect(0, 0, jLayeredPane.getWidth(), jLayeredPane.getHeight());
            //SwingUtilities.updateComponentTreeUI(frame);


        });

        save.addActionListener(e -> {
            System.out.println("save");
            //  jLayeredPane.setForeground(Color.yellow);
            frame.setBackground(Color.orange);
            SwingUtilities.updateComponentTreeUI(frame);
            SwingUtilities.updateComponentTreeUI(jLayeredPane);
        });

        frame.setVisible(true);
    }


}
