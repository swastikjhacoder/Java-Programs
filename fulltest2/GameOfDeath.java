package fulltest2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameOfDeath {
	
	static void Game(List<Integer> person, int k, int index) {
		if (person.size() == 1) {
	      System.out.println(person.get(0));
	      return;
	    }
	    index = ((index + k) % person.size());
	    person.remove(index);
	    Game(person, k, index);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int k=s.nextInt();
	    k--;
	    int index = 0;
	    List<Integer> person = new ArrayList<>();
	    for (int i = 1; i <= n; i++) {
	      person.add(i);
	    }
	    Game(person, k, index);
	    s.close();
	}

}
