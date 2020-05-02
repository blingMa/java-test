package com.practice.jdk8.lambda;

import javax.swing.*;

/**
 * @author shihao.ma
 * @since 2020/4/28
 */
public class SwingTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("frame");
        JButton jButton = new JButton("button");
        //jdk7之前的写法
        /*
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ddd。。。。。。。。。。");
            }
        });
        */

        //使用lambda表达式
        jButton.addActionListener(e -> System.out.println("ddd。。。。。。。。。。"));

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
