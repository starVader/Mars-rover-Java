
public class PrintRoverLocation {
	public void printPosition(NewRover x) {
		System.out.print(x.x + " " + x.y + " ");
		if (x.face == 1) {
			System.out.println('N');
		} else if (x.face == 2) {
			System.out.println('E');
		} else if (x.face == 3) {
			System.out.println('S');
		} else if (x.face == 4) {
			System.out.println('W');
		}
	}
}
