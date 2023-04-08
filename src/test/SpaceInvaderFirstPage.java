package test;

import javax.swing.*;
import java.awt.*;
import java.awt.Component;

public class SpaceInvaderFirstPage {
    private JFrame firstPage;
    public void setBounds(int x,int y,int width,int height){

    }

    public SpaceInvaderFirstPage(){
        firstPage = new JFrame("first page"); // frame 생성

        JLabel testlabel = new JLabel("test lable");

        // content pane 가져오기
        Container FPContainPane = firstPage.getContentPane();

        // frame 크기 800x600으로 설정
        firstPage.setPreferredSize(new Dimension(800,600));

        //panel의 레이아웃 매니저를 null로 설정 : 컴포넌트들의 위치와 크기를 수동으로 설정 가능 하도록
        // setLayout(null)으로 설정하면 각 구성 요소의 위치와 크기를 직접 지정해야 함
        firstPage.setLayout(null);
        testlabel.setBounds(100, 100, 100, 20); // x, y, width, height
        firstPage.add(testlabel);

        firstPage.pack();
        firstPage.setVisible(true);
        firstPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SpaceInvaderFirstPage FP = new SpaceInvaderFirstPage();
    }
}

