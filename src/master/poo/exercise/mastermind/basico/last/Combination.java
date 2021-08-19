package master.poo.exercise.mastermind.basico.last;

import java.util.ArrayList;
import java.util.List;

import master.poo.exercise.mastermind.basico.last.utils.Console;

public abstract class Combination {
	
	public static int LENGTH_COMBINATION=4;
	
	List<Color> colors;
	Console console;
	
	Combination(){
		colors = new ArrayList<Color>();
		console = Console.instance();
	}
	
	abstract void show();
}
