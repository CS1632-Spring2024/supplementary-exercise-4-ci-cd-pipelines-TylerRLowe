package edu.pitt.cs;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RockPaperScissorsTest {
	/**
	 * Preconditions: Create a Player p1 that always throws PAPER.
	 *                Create a Player p2 that always throws ROCK.
	 *                Create a ScoreBoard sb.
	 *                Create a RockPaperScissors game rps using p1, p2, sb.
	 * Execution steps: Call rps.play(5).
	 * Postconditions: 5 p1 wins, 0 p2 wins, and 0 draws are posted to ScoreBoard sb.
	 */
	@Test
	public void testPapervsRock5() {
        Player p1 = Mockito.mock(Player.class);
		Mockito.when(p1.throwHand()).thenReturn(Hand.PAPER);
		Player p2 = new Player(Hand.ROCK);

        ScoreBoard sb = Mockito.mock(ScoreBoard.class);
        RockPaperScissors rps = new RockPaperScissors(p1,p2,sb);

        rps.play(5);
		
        Mockito.verify(sb,times(5)).p1Win();

		// TODO: Fill in
	}
}