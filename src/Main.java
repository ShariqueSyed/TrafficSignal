
import java.awt.*;
import javax.swing.*;
class Traffic extends JFrame implements Runnable{
        JPanel red , yellow , green ;
        JLabel time , show_time , redMsg , yellowMsg , greenMsg;
    public static void main(String[] args) {
        Traffic traffic = new Traffic();
        Thread thread = new Thread(traffic);
        thread.start();
    }
        public void run () {

            while (true) {
                try {
                    //redMsg.setVisible(true);
                    //add(redMsg);
                    red.setBackground(Color.red);
                    //redMsg.setVisible(true);
                    yellow.setBackground(Color.darkGray);
                    green.setBackground(Color.darkGray);
                    for (int s = 5; s > 0; s--) {
                        for (int t = 5 ; t > 0 ; t--){
                            add(redMsg);
                            redMsg.setVisible(true);
                        }
                        String i = Integer.toString(s);
                        show_time.setText(i);
                        Thread.sleep(1000);
                        repaint();
                        redMsg.setVisible(false);

                    }
                    red.setBackground(Color.darkGray);
                    yellow.setBackground(Color.yellow);
                    yellowMsg.setVisible(true);
                    //add(yellowMsg);
                    green.setBackground(Color.darkGray);
                    for (int p = 3; p > 0; p--) {
                        for (int t = 5 ; t > 0 ; t--){
                            add(yellowMsg);
                            yellowMsg.setVisible(true);
                        }
                        String i = Integer.toString(p);
                        show_time.setText(i);
                        Thread.sleep(1000);
                        repaint();
                        yellowMsg.setVisible(false);

                    }

                    red.setBackground(Color.darkGray);
                    yellow.setBackground(Color.darkGray);
                    green.setBackground(Color.green);
                    greenMsg.setVisible(true);
                    //add(greenMsg);
                    for (int q = 5; q > 0; q--) {
                        for (int t = 5 ; t > 0 ; t--){
                            add(greenMsg);
                            greenMsg.setVisible(true);
                        }

                        String i = Integer.toString(q);
                        show_time.setText(i);
                        Thread.sleep(1000);
                    }
                    repaint();
                    greenMsg.setVisible(false);
                    yellowMsg.setVisible(false);
                    redMsg.setVisible(false);
                } catch (Exception e) {
                    System.out.println("" + e);
                }
            }
        }
    Traffic(){
        getContentPane().setBackground(Color.BLACK);
        setSize(100 , 340);
        setTitle("Signal");
        setUndecorated(true);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);


        redMsg = new JLabel();
        redMsg.setText("STOP");
        redMsg.setFont(new Font("Monospaced" , Font.BOLD , 25));
        redMsg.setForeground(Color.RED);
        redMsg.setBounds(20 , 235 , 100 , 70);
        red = new JPanel();
        red.setBackground(Color.red);

        yellowMsg = new JLabel();
        yellowMsg.setText("READY");
        yellowMsg.setFont(new Font("Monospaced" , Font.BOLD , 25));
        yellowMsg.setForeground(Color.yellow);
        yellowMsg.setBounds(10 , 235 , 100 , 70);

        yellow = new JPanel();
        yellow.setBackground(Color.yellow);

        greenMsg = new JLabel();
        greenMsg.setText("GO");
        greenMsg.setFont(new Font("Monospaced" , Font.BOLD , 25));
        greenMsg.setForeground(Color.GREEN);
        greenMsg.setBounds(35 , 235 , 100 , 70);

        green = new JPanel();
        green.setBackground(Color.green);

        setLayout(null);
        red.setBounds(30 , 20 , 40 , 40);
        add(red);

        yellow.setBounds(30 , 70 , 40 , 40);
        add(yellow);

        green.setBounds(30 , 120 , 40 ,40);
        add(green);

        time = new JLabel("Count Down");
        time.setForeground(Color.WHITE);
        time.setBounds(15 , 160 , 100 , 40);
        add(time);

        show_time = new JLabel();
        show_time.setBounds(45 , 200 , 80 , 40);
        show_time.setFont(new Font("Monospaced" , Font.BOLD , 25));
        show_time.setForeground(Color.ORANGE);
        add(show_time);
    }
}