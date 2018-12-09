package com.scrabble.Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.scrabble.Model.RedBlackTree;
import com.scrabble.Model.ScoredWord;

/**
 *
 * @author jeremy.williamson
 */

public class Scrabble {
	public static RedBlackTree dic = new RedBlackTree();	
    public static void main(String[] args) throws IOException  {
    Scrabble.dic = citire();
    Scrabble game = new Scrabble();
    
        
    }//END MAIN
		
	public static RedBlackTree citire() throws IOException{
		//File file = new File("C:\\Users\\Adrian\\Desktop\\FancyCars\\src\\input.txt"); 
		RedBlackTree dic2 = new RedBlackTree();
				File file = new File("C:\\Users\\Adrian\\Desktop\\Scrabble-master\\dic.txt");
				BufferedReader br = new BufferedReader(new FileReader(file)); 
				String st;
				while ((st = br.readLine()) != null)
				{
					dic2.insert(st);
					//System.out.println("Inserare cu succes" + st);
				}
				return dic2;
	}
	
    //CONSTRUCTOR
    public Scrabble() {
        //create a new scrabbleMain object
        ScrabbleMain inst = new ScrabbleMain();
        inst.startNewGameButtonPressed();
        inst.challengeButtonPressed();
        inst.endTurnButtonPressed();
        inst.rackButton1Pressed();
        inst.rackButton2Pressed();
        inst.rackButton3Pressed();
        inst.rackButton4Pressed();
        inst.rackButton5Pressed();
        inst.rackButton6Pressed();
        inst.rackButton7Pressed();
        inst.spaceButtonPressed();

    }//end constructor

}//END SCRABBLE
