
public class MoveAndChangeDirectionOfRover{
	public void turnLeft(NewRover r) {
		//System.out.println("left" + face);
		r.face = (r.face - 1) < NewRover.N ? NewRover.W : r.face -1;
	}
	public void turnRight(NewRover r) {
		r.face = (r.face + 1) > NewRover.W ? NewRover.N : r.face + 1;
	}
	public void moveForward(NewRover r) {
		if ((r.face == NewRover.N) && (r.y < r.limity)) {
		  r.y++;
		} else if ((r.face == NewRover.E) && (r.x < r.limitx)) {
			r.x++;
		} else if ((r.face == NewRover.S) && (r.y > 0)) {
			r.y--;
		} else if ((r.face == NewRover.W) && (r.x > 0)) {
			r.x--;
		}
	}
}
