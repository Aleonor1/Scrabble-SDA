package com.scrabble.View;

import com.scrabble.Model.LetterTile;
import com.scrabble.Model.Board;
import com.scrabble.Model.Player;
import com.scrabble.Model.SpaceButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 */
public class BoardWindow extends javax.swing.JFrame {

    public static java.awt.Color DEFAULT_BUTTON_COLOR;

    /**
     * Creates new form BoardWindow
     */
    public BoardWindow() {
        //initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   
    private void initComponents() {
        controlPanel = new javax.swing.JPanel();
        startNewGameButton = new javax.swing.JButton();
        rackButton1 = new javax.swing.JButton();
        rackButton2 = new javax.swing.JButton();
        rackButton3 = new javax.swing.JButton();
        rackButton4 = new javax.swing.JButton();
        rackButton5 = new javax.swing.JButton();
        rackButton6 = new javax.swing.JButton();
        instructionLabel = new javax.swing.JLabel();
        player1Label = new javax.swing.JLabel();
        player1ScoreLabel = new javax.swing.JLabel();
        endTurnButton = new javax.swing.JButton();
        player2Label = new javax.swing.JLabel();
        player2ScoreLabel = new javax.swing.JLabel();
        rackButton7 = new javax.swing.JButton();
        challengeButton = new javax.swing.JButton();
        dummyBoardPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(606, 800));
        setResizable(false);

        controlPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        controlPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        controlPanel.setPreferredSize(new java.awt.Dimension(616, 151));

        startNewGameButton.setText("Start New Game");
        startNewGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startNewGameButtonActionPerformed(evt);
            }
        });

        rackButton1.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rackButton1ActionPerformed(evt);
            }
        });

        rackButton2.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rackButton2ActionPerformed(evt);
            }
        });

        rackButton3.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rackButton3ActionPerformed(evt);
            }
        });

        rackButton4.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rackButton4ActionPerformed(evt);
            }
        });

        rackButton5.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rackButton5ActionPerformed(evt);
            }
        });

        rackButton6.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rackButton6ActionPerformed(evt);
            }
        });

        instructionLabel.setText("Select Space that you want to place the tile in...");

        player1Label.setText("Player 1 Score:");

        player1ScoreLabel.setText("0");

        endTurnButton.setText("End Turn");

        player2Label.setText("Player 2 Score:");

        player2ScoreLabel.setText("0");

        rackButton7.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rackButton7ActionPerformed(evt);
            }
        });
        

		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(308, 546, 181, 78);
		controlPanel.getRootPane().add(btnExit);

        challengeButton.setText("Challenge");
        challengeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                challengeButtonActionPerformed(evt);
            }
        });
        
        

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startNewGameButton)
                            .addComponent(endTurnButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player1Label)
                            .addComponent(player2Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(player2ScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player1ScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(rackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rackButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rackButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rackButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rackButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rackButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rackButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(instructionLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startNewGameButton)
                            .addComponent(player1Label)
                            .addComponent(player1ScoreLabel)))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(player2Label)
                    .addComponent(player2ScoreLabel)
                    .addComponent(endTurnButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(instructionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rackButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rackButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rackButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rackButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rackButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rackButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rackButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        dummyBoardPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dummyBoardPanel.setPreferredSize(new java.awt.Dimension(616, 600));
        dummyBoardPanel.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dummyBoardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dummyBoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlPanel, 153, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rackButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rackButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rackButton7ActionPerformed

    private void rackButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rackButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rackButton6ActionPerformed

    private void rackButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rackButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rackButton5ActionPerformed

    private void rackButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rackButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rackButton4ActionPerformed

    private void rackButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rackButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rackButton3ActionPerformed

    private void rackButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rackButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rackButton2ActionPerformed

    private void rackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rackButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rackButton1ActionPerformed

    private void startNewGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startNewGameButtonActionPerformed

    }//GEN-LAST:event_startNewGameButtonActionPerformed

    private void challengeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_challengeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_challengeButtonActionPerformed

    //create our own game gameBoard window based on our gameBoard model
    public void initBasicComponents(Board gameBoard) {
        //components
        boardPanel = new JPanel();
        controlPanel = new javax.swing.JPanel();
        startNewGameButton = new javax.swing.JButton();
        DEFAULT_BUTTON_COLOR = startNewGameButton.getBackground();
        rackButton1 = new SpaceButton();
        rackButton2 = new SpaceButton();
        rackButton3 = new SpaceButton();
        rackButton4 = new SpaceButton();
        rackButton5 = new SpaceButton();
        rackButton6 = new SpaceButton();
        rackButton7 = new SpaceButton();
        buttonRack = new ArrayList<>();
        spaceButtonList = new ArrayList<>();
        instructionLabel = new javax.swing.JLabel();
        player1Label = new javax.swing.JLabel();
        player1ScoreLabel = new javax.swing.JLabel();
        player2Label = new javax.swing.JLabel();
        player2ScoreLabel = new javax.swing.JLabel();
        endTurnButton = new javax.swing.JButton();
        challengeButton = new javax.swing.JButton();

        //setup JFrame
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(628, 780));
        setResizable(true);
        setLocationRelativeTo(null);
        setResizable(false);

        //setup instruction label
        instructionLabel.setText("Select Space that you want to place the tile in...");
        instructionLabel.setVisible(false);

        //setup player1 score label
        player1Label.setText("Player 1 Score:");
        player1ScoreLabel.setText("0");

        //setup player2 score label
        player2Label.setText("Player 2 Score:");
        player2ScoreLabel.setText("0");

        //setup end turn button
        endTurnButton.setText("End Turn");

        //setup Rack buttons
        rackButton1.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton1.setEnabled(false);
        rackButton2.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton2.setEnabled(false);
        rackButton3.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton3.setEnabled(false);
        rackButton4.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton4.setEnabled(false);
        rackButton5.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton5.setEnabled(false);
        rackButton6.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton6.setEnabled(false);
        rackButton7.setPreferredSize(new java.awt.Dimension(80, 62));
        rackButton7.setEnabled(false);

        buttonRack.add((SpaceButton) rackButton1);
        buttonRack.add((SpaceButton) rackButton2);
        buttonRack.add((SpaceButton) rackButton3);
        buttonRack.add((SpaceButton) rackButton4);
        buttonRack.add((SpaceButton) rackButton5);
        buttonRack.add((SpaceButton) rackButton6);
        buttonRack.add((SpaceButton) rackButton7);

        //setup gameBoard Panel
        boardPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        boardPanel.setPreferredSize(new java.awt.Dimension(616, 600));
        boardPanel.setLayout(new java.awt.GridLayout(0, 15));

        //setup control panel
        controlPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        controlPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        controlPanel.setPreferredSize(new java.awt.Dimension(616, 151));

        //setup buttons
        startNewGameButton.setText("Start New Game");
        challengeButton.setText("Exit");
        
        JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(308, 546, 181, 78);
		controlPanel.add(btnExit);

        //setup gameBoard spaces
        for (int i = 0; i < gameBoard.spaces.size(); i++) {

            spaceButtonList.add(new SpaceButton());

            spaceButtonList.get(i).setText(gameBoard.spaces.get(i).getLabel());
            if (gameBoard.spaces.get(i).getLabel().equalsIgnoreCase("TWS")) {
                spaceButtonList.get(i).setBackground(Color.RED);
            } else if (gameBoard.spaces.get(i).getLabel().equalsIgnoreCase("TLS")) {
                spaceButtonList.get(i).setBackground(Color.BLUE);
            } else if (gameBoard.spaces.get(i).getLabel().equalsIgnoreCase("DWS")) {
                spaceButtonList.get(i).setBackground(Color.PINK);
            } else if (gameBoard.spaces.get(i).getLabel().equalsIgnoreCase("DLS")) {
                spaceButtonList.get(i).setBackground(Color.CYAN);
            }//end if/else

            spaceButtonList.get(i).setMargin(new Insets(0, 0, 0, 0));
            //*assign buttons a specific space* (THIS MAY NEED TO BE MOVED TO CONTROLLER OR MODEL)
            spaceButtonList.get(i).setAssignedSpace(gameBoard.spaces.get(i));

            //if the space is the center space
            if (i == 112) {
                //change the color fo the button
                spaceButtonList.get(i).setBackground(Color.MAGENTA);
                spaceButtonList.get(i).getAssignedSpace().setValidity(true);
            }//end if

            //enable buttons based on space validity
            if (spaceButtonList.get(i).getAssignedSpace().isValid()) {
                spaceButtonList.get(i).setEnabled(true);
            } else {
                spaceButtonList.get(i).setEnabled(false);
            }//end if/else

            //add button to panel
            boardPanel.add(spaceButtonList.get(i));

        }//end for
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //CONTROL PANEL LAYOUT(copy and pasted from generated design)////////////////////////////////        
        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
                controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(controlPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(startNewGameButton)
                                                .addComponent(endTurnButton))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(player1Label)
                                                .addComponent(player2Label))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(player2ScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(player1ScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExit))
                                .addGroup(controlPanelLayout.createSequentialGroup()
                                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(controlPanelLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(rackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(rackButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(rackButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(rackButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(rackButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(rackButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(rackButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(controlPanelLayout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(instructionLabel)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
                controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(controlPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(startNewGameButton)
                                                .addComponent(player1Label)
                                                .addComponent(player1ScoreLabel)))
                                .addGroup(controlPanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(btnExit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(player2Label)
                                .addComponent(player2ScoreLabel)
                                .addComponent(endTurnButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(instructionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rackButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rackButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rackButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rackButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rackButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rackButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(rackButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0))
        );
        ////END CONTROL PANEL LAYOUT/////////////////////////////////////////////////////////

        //JFRAME LAYOUT/////////////////////////////////////////////////////////
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(boardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ////END JFRAME LAYOUT///////////////////////////////////////////////

    }//end initCustomComponents

    //ACTION LISTENERS//////////////////////////////////////////
    public void addStartNewGameButtonActionListener(ActionListener listener) {
        startNewGameButton.addActionListener(listener);
    }//end addStartNewGameButtonActionListener()

    public void addChallengeButtonActionListener(ActionListener listener) {
        challengeButton.addActionListener(listener);
    }//end addChallengeButtonActionListener

    public void addEndTurnButtonActionListener(ActionListener listener) {
        endTurnButton.addActionListener(listener);
    }//end addEndTurnButtonActionListener()

    public void addRackButton1ActionListener(ActionListener listener) {
        rackButton1.addActionListener(listener);
    }//end addRackButton1ActionListener

    public void addRackButton2ActionListener(ActionListener listener) {
        rackButton2.addActionListener(listener);
    }//end addRackButton1ActionListener

    public void addRackButton3ActionListener(ActionListener listener) {
        rackButton3.addActionListener(listener);
    }//end addRackButton1ActionListener

    public void addRackButton4ActionListener(ActionListener listener) {
        rackButton4.addActionListener(listener);
    }//end addRackButton1ActionListener

    public void addRackButton5ActionListener(ActionListener listener) {
        rackButton5.addActionListener(listener);
    }//end addRackButton1ActionListener

    public void addRackButton6ActionListener(ActionListener listener) {
        rackButton6.addActionListener(listener);
    }//end addRackButton1ActionListener

    public void addRackButton7ActionListener(ActionListener listener) {
        rackButton7.addActionListener(listener);
    }//end addRackButton1ActionListener

    public void addSpaceButtonListActionListener(ActionListener listener) {
        for (int i = 0; i < 225; i++) {
            spaceButtonList.get(i).addActionListener(listener);
        }//end for
    }

    ////END ACTION LISTENERS/////////////////////////////////////
    //Update Views//////////////////////////////////////////////////////////////////
    public void updateRack(Player player) throws IndexOutOfBoundsException {
        //make all rack buttons invisible
        for (SpaceButton currentButton : buttonRack) {
            currentButton.setVisible(false);
        }//end for

        //for each tile in rack
        for (int i = 0; i < player.getRack().size(); i++) {

            LetterTile assignedTile = player.getRack().get(i);

            if (assignedTile.getPoints() == 0) {
                assignedTile.setLetter('?');
            }//end if

            buttonRack.get(i).setAssignedTile(assignedTile);
            buttonRack.get(i).setVisible(true);
            buttonRack.get(i).setEnabled(true);

        }//end for

    }//end updateRack()

    public void updateBoard(Board gameBoard) {
        for (int i = 0; i < gameBoard.spaces.size(); i++) {

            //if space does not have an assigned tile
            if (gameBoard.spaces.get(i).getAssignedTile() == null) {

                //setup button labels for appropriate non occupied spaces
                if (gameBoard.spaces.get(i).getLabel().equalsIgnoreCase("TWS")) {
                    spaceButtonList.get(i).setBackground(Color.RED);
                } else if (gameBoard.spaces.get(i).getLabel().equalsIgnoreCase("TLS")) {
                    spaceButtonList.get(i).setBackground(Color.BLUE);
                } else if (gameBoard.spaces.get(i).getLabel().equalsIgnoreCase("DWS")) {
                    spaceButtonList.get(i).setBackground(Color.PINK);
                } else if (gameBoard.spaces.get(i).getLabel().equalsIgnoreCase("DLS")) {
                    spaceButtonList.get(i).setBackground(Color.CYAN);
                }//end if/else

                //if the space is the center space
                if (i == 112) {
                    //change the color of the button
                    spaceButtonList.get(i).setBackground(Color.MAGENTA);
                }//end if

            }//end if

            //enable/disable buttons based on valid spaces
            if (gameBoard.spaces.get(i).isValid()) {
                spaceButtonList.get(i).setEnabled(true);
            } else {
                spaceButtonList.get(i).setEnabled(false);
            }//end if

        }//end for
    }//end updateBoard

    public void setButtonRack(ArrayList<SpaceButton> newButtonRack) {
        buttonRack = newButtonRack;
    }//end setter

    public ArrayList<SpaceButton> getButtonRack() {
        return buttonRack;
    }//end getter

    public ArrayList<SpaceButton> getSpaceButtonList() {
        return spaceButtonList;
    }//end getter

    //enable or disable rack buttons
    public void setRackButton1Enabled(boolean enabled) {
        rackButton1.setEnabled(enabled);
    }//end set button

    public void setRackButton2Enabled(boolean enabled) {
        rackButton2.setEnabled(enabled);
    }//end set button

    public void setRackButton3Enabled(boolean enabled) {
        rackButton3.setEnabled(enabled);
    }//end set button

    public void setRackButton4Enabled(boolean enabled) {
        rackButton4.setEnabled(enabled);
    }//end set button

    public void setRackButton5Enabled(boolean enabled) {
        rackButton5.setEnabled(enabled);
    }//end set button

    public void setRackButton6Enabled(boolean enabled) {
        rackButton6.setEnabled(enabled);
    }//end set button

    public void setRackButton7Enabled(boolean enabled) {
        rackButton7.setEnabled(enabled);
    }//end set button

    /* Following functions will change a rackbutton background color 
     @author Paul
     @date Sep 19 2015
     */
    public void setRackButton1bg(java.awt.Color color) {
        rackButton1.setBackground(color);
    }// end background set

    public void setRackButton2bg(java.awt.Color color) {
        rackButton2.setBackground(color);
    }// end background set

    public void setRackButton3bg(java.awt.Color color) {
        rackButton3.setBackground(color);
    }// end background set

    public void setRackButton4bg(java.awt.Color color) {
        rackButton4.setBackground(color);
    }// end background set

    public void setRackButton5bg(java.awt.Color color) {
        rackButton5.setBackground(color);
    }// end background set

    public void setRackButton6bg(java.awt.Color color) {
        rackButton6.setBackground(color);
    }// end background set

    public void setRackButton7bg(java.awt.Color color) {
        rackButton7.setBackground(color);
    }// end background set

    /* This function will enable the start new game button */
    public void setStartNewGameButton1Enabled(boolean enabled) {
        startNewGameButton.setEnabled(enabled);
    }//end set button

    public void setChallengeButtonEnabled(boolean enabled) {
        challengeButton.setEnabled(enabled);
    }//end setChallengeButtonEnabled

    //show instructions
    public void showInstructions(boolean enabled) {
        instructionLabel.setVisible(enabled);
    }//end showInstructions

    //Set Player 1 score
    public void setPlayer1Score(int newScore) {
        player1ScoreLabel.setText(String.valueOf(newScore));
    }

    //Set Player 2 score
    public void setPlayer2Score(int newScore) {
        player2ScoreLabel.setText(String.valueOf(newScore));
    }

    ////end update views/////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton challengeButton;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel dummyBoardPanel;
    private javax.swing.JButton endTurnButton;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player1ScoreLabel;
    private javax.swing.JLabel player2Label;
    private javax.swing.JLabel player2ScoreLabel;
    private javax.swing.JButton rackButton1;
    private javax.swing.JButton rackButton2;
    private javax.swing.JButton rackButton3;
    private javax.swing.JButton rackButton4;
    private javax.swing.JButton rackButton5;
    private javax.swing.JButton rackButton6;
    private javax.swing.JButton rackButton7;
    private javax.swing.JButton startNewGameButton;
    // End of variables declaration//GEN-END:variables

    //custom component variables
    private javax.swing.JPanel boardPanel;
    private ArrayList<SpaceButton> buttonRack;
    private ArrayList<SpaceButton> spaceButtonList;

}
