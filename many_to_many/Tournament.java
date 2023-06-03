package many_to_many;

import java.util.*;

public class Tournament {
	private List<Player> players;
	public Tournament() {
		players=new ArrayList<Player>();
	}
	public void addPlayer(Player p) {
		if(!players.contains(p)) {
			players.add(p);
			p.addTournament(this);
		}
	}
	
}
