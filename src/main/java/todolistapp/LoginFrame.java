package todolistapp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

// starting page contains code for register, username , passwd.
@SuppressWarnings("serial")
public class LoginFrame extends JFrame {
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JButton button_login = new JButton();
    JButton button_register = new JButton();
    JTextField textbox_us = new JTextField();
    JPasswordField textbox_pwd = new JPasswordField();
    JLabel text_wup = new JLabel();
    LoginFrame() throws IOException{
        // text welcome
        JLabel text_label1 = new JLabel();
        text_label1.setText("Quản lý công việc - KiệtLT :V");
        text_label1.setForeground(Color.white);
        text_label1.setFont(new Font("Futura",Font.PLAIN,35));
        text_label1.setBounds(100,80, 500,100);

        JLabel text_label2 = new JLabel();
        text_label2.setText("Tạo và Quản lý công việc một cách dễ dàng");
        text_label2.setForeground(Color.white);
        text_label2.setFont(new Font("Futura",Font.ITALIC,20));
        text_label2.setBounds(100,160, 400,50);

        //background
        InputStream stream = this.getClass().getClassLoader().getResourceAsStream("background_task-removebg-preview.png");
        ImageIcon img1 = new ImageIcon( new ImageIcon(ImageIO.read(stream)).getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
        JLabel image_label1 = new JLabel();
        image_label1.setIcon(img1);
        image_label1.setBounds(80,210, 400,400);


        panel1.setBackground(new Color(157, 168, 231));
        panel1.setBounds(0,0,600,720);
        panel1.setLayout(null);
        panel1.add(text_label1);
        panel1.add(text_label2);
        panel1.add(image_label1);

        JLabel text_gs = new JLabel();
        text_gs.setText("Đăng Nhập");
        text_gs.setForeground(new Color(47, 43, 44));
        text_gs.setFont(new Font("Futura",Font.PLAIN,30));
        text_gs.setBounds(150,90, 300,80);

        JLabel text_un = new JLabel();
        text_un.setText("Tên đăng nhập");
        text_un.setForeground(new Color(47, 43, 44));
        text_un.setFont(new Font("Futura",Font.PLAIN,15));
        text_un.setBounds(100,170, 150,40);


        textbox_us.setBounds(100,210,250, 25);
        textbox_us.setBorder(null);
        textbox_us.setForeground(new Color(47, 43, 44));
        textbox_us.setFont(new Font("Futura",Font.BOLD,13));

        JLabel text_pwd = new JLabel();
        text_pwd.setText("Mật khẩu");
        text_pwd.setForeground(new Color(47, 43, 44));
        text_pwd.setFont(new Font("Futura",Font.PLAIN,15));
        text_pwd.setBounds(100,240, 100,40);

        textbox_pwd.setBounds(100,280,250, 25);
        textbox_pwd.setBorder(null);

        // nút đăng nhập
        stream = this.getClass().getClassLoader().getResourceAsStream("dangnhap.png");
        ImageIcon img_login = new ImageIcon( new ImageIcon(ImageIO.read(stream)).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        button_login.setBounds(180, 320, 70,70);
        button_login.setBorder(null);
        button_login.setFocusable(false);
        button_login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button_login.setBackground(new Color(236, 241, 240, 255));

        button_login.setIcon(img_login);

        JLabel text_nus = new JLabel();
        text_nus.setText("Tạo tài khoản ?");
        text_nus.setForeground(new Color(47, 43, 44));
        text_nus.setFont(new Font("Futura",Font.PLAIN,15));
        text_nus.setBounds(180,450, 150,40);

        //nút đăng kí
        stream = this.getClass().getClassLoader().getResourceAsStream("register.png");
        ImageIcon img_register = new ImageIcon( new ImageIcon(ImageIO.read(stream)).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        button_register.setBounds(195, 490, 40,40);
        button_register.setBorder(null);
        button_register.setFocusable(false);
        button_register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button_register.setBackground(new Color(236, 241, 240, 255));
        button_register.setIcon(img_register);

        text_wup.setText("Sai tài khoản hoặc mật khẩu");
        text_wup.setForeground(new Color(232, 29, 64));
        text_wup.setFont(new Font("Futura",Font.PLAIN,15));
        text_wup.setBounds(110,390, 400,40);
        text_wup.setVisible(false);

        // panel2

        panel2.setBackground(new Color(236, 241, 240, 255));
        panel2.setBounds(600,0,480,720);
        panel2.setLayout(null);
        panel2.add(text_gs);
        panel2.add(text_un);
        panel2.add(textbox_us);
        panel2.add(text_pwd);
        panel2.add(textbox_pwd);
        panel2.add(button_login);
        panel2.add(text_nus);
        panel2.add(button_register);
        panel2.add(text_wup);

        this.setTitle("Quản lý công việc - KiệtLT :V");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        stream = this.getClass().getClassLoader().getResourceAsStream("task.png");
        ImageIcon icon_app = new ImageIcon(ImageIO.read(stream));
        this.setIconImage(icon_app.getImage());
        this.setSize(1080,720);
        this.setLayout(null);
        this.add(panel1);
        this.add(panel2);
        this.setVisible(true);
    }
}
