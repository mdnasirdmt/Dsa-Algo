package string;

public class SortestPath {
	public static void main(String[] args) {
		String str = "NSW"; // WNEENESENNN; //NSEWWESN

		System.out.println(findSortestPath(str));

	}

	static double findSortestPath(String str) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < str.length(); i++) {
			char dir = str.charAt(i);

			// north
			if (dir == 'N') {
				y++;
			}
			// south
			else if (dir == 'S') {
				y--;
			}
			// east
			else if (dir == 'E') {
				x++;
			}
			// west
			else if (dir == 'W') {
				x--;
			}
		}

		int x2 = x * x;
		int y2 = y * y;

		return Math.sqrt(x2 + y2);
	}

}

//find displacement/ sortest path direction are String path="NSEWNSEWN" given x=0; y=0; 
//if dir= N it means x will increase by 1 if it goes to S ,then it decrease by 1 and so on for all directions.
