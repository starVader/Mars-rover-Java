
public class NewRover {
	final static int N = 1;
	final static int E = 2;
	final static int S = 3;
	final static int W = 4;
	int limitx = 0;
	int limity = 0;
	int x = 0;
	int y = 0;
	int face = N;
	//Constructor for NewRover
	NewRover(){}
	NewRover(int limx, int limy, int x, int y, int face) {
		this.limitx = limx;
		this.limity = limy;
		this.x = x;
		this.y = y;
		this.face = face;
	}

	public void moveRover(String commands) {
		RoverCommandsProcessor runCommands = new RoverCommandsProcessor();
		for (int x = 0; x < commands.length(); x++) {
			runCommands.roverStart(this, commands.charAt(x));
		}
	}
}
