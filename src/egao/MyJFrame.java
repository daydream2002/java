package egao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame implements ActionListener {
    JButton yesBut= new JButton("帅");
    JButton midBut = new JButton("一般般");
    JButton noBut = new JButton("不帅");
    public MyJFrame(){
        initJFrame();
        initView();
        this.setVisible(true);
    }

    private void initView() {
        JLabel text = new JLabel("你觉的自己帅嘛");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(120,150,300,50);
        this.getContentPane().add(text);
        yesBut.setBounds(200,250,100,30);
        yesBut.addActionListener(this);
        this.getContentPane().add(yesBut);
    }

    private void initJFrame() {
        this.setSize(500,600);
        this.setTitle("恶搞好友");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if (ob == yesBut){
            System.out.println("yes");
            showJDialog("yes");
        }
    }

    private void showJDialog(String content) {
        JDialog jDialog = new JDialog();
        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);
        jDialog.setVisible(true);
    }
}
