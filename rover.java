public class rover {
	final static int N = 1;
	final static int E = 2;
	final static int S = 3;
	final static int W = 4;
	
	int x = 0;
	int y = 0;
	int face = N;
	
	public void setPosition(int x, int y, int d) {
		this.x = x;
		this.y = y;
		this.face = d;
	}
	public void printPosition(rover x) {
		System.out.print(x.x + " " + x.y + " ");
		if (x.face == 1) {
			System.out.print('N');
		} else if (x.face == 2) {
			System.out.print('E');
		} else if (x.face == 3) {
			System.out.print('S');
		} else if (x.face == 4) {
			System.out.print('W');
		}
	}
	public void moveRover(String commands) {
		for (int x = 0; x < commands.length(); x++) {
			process(commands.charAt(x));
		}
	}
	public void process(char x) {
		if (x == 'L'){
			turnleft();
		} else if (x =='R') {
			turnright();
		} else if  (x == 'M') {
			moveForward();
		}
	}
	public void turnleft() {
		face = (face - 1) < N ? W : face -1;
	}
	public void turnright() {
		face = (face + 1) > W ? N : face + 1;
	}
	public void moveForward() {
		if (face == N) {
		  this.y++;
		} else if (face == E) {
			this.x++;
		} else if (face == S) {
			this.y--;
		} else if (face == W) {
			this.x--;
		}
	}
	public static void main(String[] args){
		rover Rover = new rover();
		Rover.setPosition(1,2,N);
		Rover.moveRover("LMLMLMLMM");
		Rover.printPosition(Rover);
		Rover.setPosition(3,3,E);
		Rover.moveRover("MMRMMRMRRM");
		Rover.printPosition(Rover);
	}
}