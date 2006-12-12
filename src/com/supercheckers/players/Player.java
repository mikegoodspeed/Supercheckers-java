package com.supercheckers.players;

import com.supercheckers.datastructures.Board;
import com.supercheckers.datastructures.Move;
import com.supercheckers.datastructures.Team;
import com.supercheckers.ui.GameBoardFrm;

/**
 * Abstract Player Class, to be used as the superclass for actual players.
 * <p>
 * project Supercheckers <br />
 * url http://www.mikegoodspeed.com/blog/projects/supercheckers/
 *
 * @author Mike Goodspeed
 * @version $Id$
 */
public abstract class Player {
	private GameBoardFrm window = null;
	private Board board = null;
	private Team team = null;

	/**
	 * @param window
	 * @param board
	 * @param team
	 */
	public Player(GameBoardFrm window, Board board, Team team) {
		this.window = window;
		this.board = board;
		this.team = team;
	}

	/**
	 * @return the window
	 */
	public GameBoardFrm getWindow() {
		return window;
	}

	/**
	 * @return the board
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * @return the team
	 */
	public Team getTeam() {
		return team;
	}

	/**
	 * Abstract method to be created by the subclass.
	 *
	 * @return the selected Move
	 */
	public abstract Move getMove();
}
