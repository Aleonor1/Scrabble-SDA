/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scrabble.Model;

import javax.swing.JOptionPane;

import java.util.ArrayList;

import com.scrabble.Controller.Scrabble;

import java.io.*;

/**
 *
 * @author jeremy.williamson
 */
public class ScoredWord extends ArrayList<Space> {

	private int wordDirection;

	public ScoredWord(int orientation) {
		wordDirection = orientation;
	}// end constructor

	public ScoredWord(ArrayList<Space> word, int orientation) {
		super(word);
		wordDirection = orientation;
	}

	public int getOrientation() {
		return wordDirection;
	}// end get orientation

	public void setOrientation(int orientation) {
		wordDirection = orientation;
	}

	@Override
	public String toString() {
		String currentWordString = new String();
		String returnString = new String();
		String cuvant = new String();
		for (Space space : this) {
			returnString = currentWordString.concat(Character.toString(space.getAssignedTile().getLetter()));
			cuvant += Character.toString(space.getAssignedTile().getLetter());

		}
		System.out.println(cuvant);
		// if (Scrabble.dic.search(cuvant)==null) {
		// System.out.println("Nu exista cuvantul");
		// JOptionPane.showMessageDialog(null, "Cuvantul nu este in dictionar",
		// "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        //}
		return returnString;
	}

}
