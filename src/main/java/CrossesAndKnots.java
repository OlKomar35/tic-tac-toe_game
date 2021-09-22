import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class CrossesAndKnots extends JFrame implements ActionListener {
    JLabel writeWinner;
    public static final int DOTS_TO_WIN = 3;
    public static final String DOT_EMPTY = "•";
    public static final String DOT_X = "X";
    public static final String DOT_0 = "0";
    public String[][] arr = new String[3][3];
    private JButton[] playingField = new JButton[9];
    public static Random rand = new Random();

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem newGame, exit;
    private int index;
    Font font = new Font("Arial", Font.BOLD, 40);


    public CrossesAndKnots() {
        setBounds(150, 150, 350, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Crosses&&Knots");


        setLayout(new GridLayout(3, 3));

        init();



        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        newGame = new JMenuItem("New Game");
        exit = new JMenuItem("Exit");
        fileMenu.add(newGame);
        fileMenu.addSeparator();
        fileMenu.add(exit);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void init() {
        for (int i = 0; i < 9; i++) {
            playingField[i] = new JButton(DOT_EMPTY);
            playingField[i].setFont(font);
            playingField[i].addActionListener(this);
            add(playingField[i]);

        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            String text = ((JButton) e.getSource()).getText();

            if (((JButton) e.getSource()).getX() == 1 && ((JButton) e.getSource()).getY() == 1) {
                index = 0;
            }
            if (((JButton) e.getSource()).getX() == 115 && ((JButton) e.getSource()).getY() == 1) {
                index = 1;
            }
            if (((JButton) e.getSource()).getX() == 229 && ((JButton) e.getSource()).getY() == 1) {
                index = 2;
            }
            if (((JButton) e.getSource()).getX() == 1 && ((JButton) e.getSource()).getY() == 150) {
                index = 3;
            }
            if (((JButton) e.getSource()).getX() == 115 && ((JButton) e.getSource()).getY() == 150) {
                index = 4;
            }
            if (((JButton) e.getSource()).getX() == 229 && ((JButton) e.getSource()).getY() == 150) {
                index = 5;
            }
            if (((JButton) e.getSource()).getX() == 1 && ((JButton) e.getSource()).getY() == 299) {
                index = 6;
            }
            if (((JButton) e.getSource()).getX() == 115 && ((JButton) e.getSource()).getY() == 299) {
                index = 7;
            }
            if (((JButton) e.getSource()).getX() == 229 && ((JButton) e.getSource()).getY() == 299) {
                index = 8;
            }

            if (text.equals(DOT_EMPTY)) {
                playingField[index].setText(DOT_X);
                playingField[index].setEnabled(false);
            }
            if (isCheckWin(DOT_X)) {
                JOptionPane.showMessageDialog(null,"Победил человек" );
                System.exit(0);
            }
            if (isMapFull()) {
                JOptionPane.showMessageDialog(null,"Ничья" );
                System.exit(0);
            }
            aiTurn();

            if (isCheckWin(DOT_0)) {
                JOptionPane.showMessageDialog(null,"Победил искусственный интелект" );
                System.exit(0);
            }
            if (isMapFull()) {
                JOptionPane.showMessageDialog(null,"Ничья" );
                System.exit(0);
            }
        }

    }

    private boolean isMapFull() {
        for (int j = 0; j < 9; j++) {
            if (playingField[j].getText().equals(DOT_EMPTY)) return false;
        }
        return true;
    }

    private boolean isCheckWin(String dot) {
        int countI, countJ, countD1, countD2;
        for (int i = 0; i < 3; i++) {
            countI = 0;
            countJ = 0;
            countD1 = 0;
            countD2 = 0;
            for (int j = 0; j < 3; j++) {
                if (playingField[3 * i + j].getText().equals(dot)) countI++;
                if (playingField[3 * j + i].getText().equals(dot)) countJ++;
                if (playingField[4*j].getText().equals(dot)) countD1++;
                if (playingField[6-2*j].getText().equals(dot)) countD2++;
                if (countD1 == DOTS_TO_WIN || countD2 == DOTS_TO_WIN || countI == DOTS_TO_WIN || countJ == DOTS_TO_WIN)
                    return true;
            }
        }
        return false;
    }

    private void aiTurn() {
        int x, y;
        int kx, k;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            k = 0;
            kx = 0;
            x = -1;
            y = -1;
            //проверка строк
            for (int j = 0; j < 3; j++) {
                if (playingField[3 * i + j].getText().equals(DOT_X)) kx++;
                else {
                    if (playingField[3 * i + j].getText().equals(DOT_EMPTY)) {
                        x = i;
                        y = j;
                        k++;
                    }
                }
            }
            if (kx == 2 && k == 1) {
                playingField[3 * x + y].setText(DOT_0);
                count++;
                playingField[3 * x + y].setEnabled(false);
                break;
            }
            k = 0;
            kx = 0;
            x = -1;
            y = -1;
            //проверка столбцов
            for (int j = 0; j < 3; j++) {
                if (playingField[3 * j + i].getText().equals(DOT_X)) kx++;
                else {
                    if (playingField[3 * j + i].getText().equals(DOT_EMPTY)) {
                        x = j;
                        y = i;
                        k++;
                    }
                }
            }
            if (kx == 2 && k == 1) {
                playingField[3 * x + y].setText(DOT_0);
                count++;
                playingField[3 * x + y].setEnabled(false);
                break;

            }
            // провеока главной диагонали
            k = 0;
            kx = 0;
            x = -1;
            y = -1;
            for (int j = 0; j < 3; j++) {
                if (playingField[4*j].getText().equals(DOT_X)) kx++;
                else {
                    if (playingField[4*j].getText().equals(DOT_EMPTY)) {
                        x = 4*j;
                        k++;
                    }
                }
            }
            if (kx == 2 && k == 1) {
                playingField[x].setText(DOT_0);
                count++;
                playingField[x].setEnabled(false);
                break;

            }
//            проверка побочной диагонали
            k = 0;
            kx = 0;
            x = -1;
            y = -1;
            for (int j = 0; j < 3; j++) {
                if (playingField[6-2*j].getText().equals(DOT_X)) kx++;
                else {
                    if (playingField[6-2*j].getText().equals(DOT_EMPTY)) {
                        x = 6-2*j;
                        k++;
                    }
                }
            }
            if (kx == 2 && k == 1) {
                playingField[x].setText(DOT_0);
                count++;
                playingField[x].setEnabled(false);
                break;
            }
        }
            if (count == 0) {
                do {
                    x = rand.nextInt(3);
                    y = rand.nextInt(3);
                } while (playingField[3 * x + y].getText().equals(DOT_X));
                count++;
                playingField[3 * x + y].setText(DOT_0);
                playingField[3 * x + y].setEnabled(false);
            }
        }

    }


