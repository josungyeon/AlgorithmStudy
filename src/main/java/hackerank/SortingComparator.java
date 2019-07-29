package hackerank;

import java.util.*;

/**
 * Created by sungyeonjo on 2019. 6. 6..
 */
class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        if (a.score > b.score) {
            return -1;
        } else if (a.score < b.score) {
            return 1;
        } else {
            if (a.name.compareTo(b.name) < 0) {
                return -1;
            } else if (a.name.compareTo(b.name) > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }


}

public class SortingComparator {
    public static void main(String[] args) {
        Checker ckecker = new Checker();

        Player[] player = new Player[10];

        player[0] = new Player("ab", 6);
        player[1] = new Player("bcc", 0);
        player[2] = new Player("ade", 5);
        player[3] = new Player("cab", 2);
        player[4] = new Player("dee", 0);
        player[5] = new Player("bda", 2);
        player[6] = new Player("c", 5);
        player[7] = new Player("db", 2);
        player[8] = new Player("a", 1);
        player[9] = new Player("cbb", 1);

        Arrays.sort(player, ckecker);

        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

