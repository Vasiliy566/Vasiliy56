import java.util.*;

public class Toss {
    public ArrayList<Player> sort(ArrayList<Player> players){
        Comparator<Player> compareByPoints = new Comparator<Player>() {
            //@Override
            public int compare(Player o1, Player o2) {
                return Double.compare(o1.getPoints(), o2.getPoints());
            }
        };
         Collections.sort(players, compareByPoints);
         return players;
    }
    public ArrayList<ArrayList<Player>> getPointGroups(ArrayList<Player> players){
        ArrayList<ArrayList<Player>> ptsGroups = new ArrayList<ArrayList<Player>>();
        players = sort(players);
        // make 1st point's group
        ArrayList<Player> group = new ArrayList<Player>();
        group.add(players.get(0));

        int i = 0;
        while (i < players.size() - 1) {
            i ++;

            // if next player in next point group:
            if (players.get(i).points != players.get(i - 1).points) {
                ptsGroups.add((ArrayList<Player>)group.clone());

                group = new ArrayList<Player>();
            }
            group.add(players.get(i));
        }
        ptsGroups.add((ArrayList<Player>)group.clone());
        return ptsGroups;
    }
    public void tossNextRound(ArrayList<Player> players) {

    }
}