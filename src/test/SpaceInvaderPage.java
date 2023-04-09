package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 클래스
public class SpaceInvaderPage {
    private JFrame MainPage;
    private JFrame SelectStagePage;
    public void setBounds(int x,int y,int width,int height){
    }

    // 생성자
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

        // space invaders img 삽입


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

        GameStartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectStagePage();
                MainPage.setVisible(false); // 창 안보이게 하기
            }
        });

        //panel의 레이아웃 매니저를 null로 설정 : 컴포넌트들의 위치와 크기를 수동으로 설정 가능 하도록
        // setLayout(null)으로 설정하면 각 구성 요소의 위치와 크기를 직접 지정해야 함
        MainPage.setLayout(null);
        MainPage.pack();
        MainPage.setVisible(true);

        MainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // 메소드
    public void SelectStagePage(){
        SelectStagePage = new JFrame("SelectStagePage"); // frame 생성

        // frame 크기 800x600으로 설정
        SelectStagePage.setPreferredSize(new Dimension(800,600));

        // content pane 가져오기
        Container SelectStageContainPane = SelectStagePage.getContentPane();

        // 어떤 페이지인지 알 수 있도록 "STAGE"써있는 이미지 넣기
        JLabel showGameName = new JLabel("STAGE");
        showGameName.setBounds(0, 0, 800, 100); // x, y, width, height
        SelectStagePage.add(showGameName);

        // 버튼 생성 & 위치 설정
        JButton[] stageButton = new JButton[5];
        for(int i=0;i<5;i++){
            stageButton[i] = new JButton("STAGE " + (i+1));
            int y = 130 + 70*i;
            stageButton[i].setBounds(100, y, 500, 60);
        }

        for(int i=0; i<5 ; i++){
            SelectStageContainPane.add(stageButton[i]);
        }

        SelectStagePage.setLayout(null);
        SelectStagePage.pack();
        SelectStagePage.setVisible(true);

        SelectStagePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SpaceInvaderPage FP = new SpaceInvaderPage();
//        FP.SelectStagePage();
    }
}

