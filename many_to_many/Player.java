package many_to_many;

import java.util.*;

public class Player {
	private List<Tournament> tournaments;
	public Player() {
		tournaments=new ArrayList<Tournament>();
	}
	public void addTournament(Tournament t) {
		if(!tournaments.contains(t)) {
			tournaments.add(t);
			t.addPlayer(this);
		}
	}
}
