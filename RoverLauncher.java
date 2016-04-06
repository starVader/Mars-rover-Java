
public class RoverLauncher{
	public static void main(String[] args) {
		NewRover r1 = new NewRover(5,5,1,2,NewRover.N);
		r1.moveRover("LMLMLMLMM");
		NewRover r2 = new NewRover(5,5,3,3,NewRover.E);
		r2.moveRover("RMRM");
		NewRover r3 = new NewRover(5,5,1,5,NewRover.N);
		r3.moveRover("LMLML");
		PrintRoverLocation print = new PrintRoverLocation();
		print.printPosition(r1);
		print.printPosition(r2);
		print.printPosition(r3);
	}
}
