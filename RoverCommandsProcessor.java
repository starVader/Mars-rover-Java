
public class RoverCommandsProcessor {
	MoveAndChangeDirectionOfRover change = new MoveAndChangeDirectionOfRover();
	public void roverStart(NewRover r,char x) {
		if (x == 'L'){
			//System.out.println("left");
			change.turnLeft(r);
		} else if  (x == 'M') {
			//System.out.println("Move");
			change.moveForward(r);
		} else if (x =='R') {
			change.turnRight(r);
		}
	}
}
