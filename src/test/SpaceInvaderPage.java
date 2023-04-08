package test;

import javax.swing.*;
import java.awt.*;

public class SpaceInvaderPage {
    private JFrame MainPage;
    private JFrame StageSelectPage;
    public void setBounds(int x,int y,int width,int height){
    }

    public SpaceInvaderPage(){
        MainPage = new JFrame("Main Page"); // frame 생성

        // frame 크기 800x600으로 설정
        MainPage.setPreferredSize(new Dimension(800,600));

        // content pane 가져오기
        Container MainPageContainPane = MainPage.getContentPane();

        // 화면에 게임 이름 이미지로 넣기
        JLabel showGameName = new JLabel("Space Invaders");
        showGameName.setBounds(300, 100, 400, 100); // x, y, width, height
        MainPage.add(showGameName);


        // 버튼 생성 & 위치 설정
        JButton GameStartButton = new JButton("GameStart");
        GameStartButton.setBounds(100, 300, 600, 60);
        JButton GoStoreButton = new JButton("Store");
        GoStoreButton.setBounds(100, 380, 600, 60);
        JButton GoRankingButton = new JButton("Ranking");
        GoRankingButton.setBounds(100, 460, 600, 60);

        // 화면에 버튼 보이도록 contain pane에 버튼 붙이기
        MainPageContainPane.add(GameStartButton);
        MainPageContainPane.add(GoStoreButton);
        MainPageContainPane.add(GoRankingButton);

        /*
        // 버튼 클릭시 화면 이동
        GameStartButton.addActionListener(e ->
        {
            StageSelectPage = new JFrame("Stage Selcet Page");

            JLabel label = new JLabel("This is Sub Page.");
            label.setBounds(50, 50, 200, 30);

            StageSelectPage.add(label);
            StageSelectPage.setSize(300, 150);
            StageSelectPage.setLayout(null);
            StageSelectPage.setVisible(true);
        });
         */

        //panel의 레이아웃 매니저를 null로 설정 : 컴포넌트들의 위치와 크기를 수동으로 설정 가능 하도록
        // setLayout(null)으로 설정하면 각 구성 요소의 위치와 크기를 직접 지정해야 함
        MainPage.setLayout(null);
        MainPage.pack();
        MainPage.setVisible(true);

        MainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SpaceInvaderPage FP = new SpaceInvaderPage();
    }
}

