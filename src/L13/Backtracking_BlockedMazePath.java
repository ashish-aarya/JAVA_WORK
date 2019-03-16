package L13;

public class Backtracking_BlockedMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		boolean visited[][] = new boolean[maze.length][(maze[0].length)];
		blockedMaze(maze, 0, 0, "", visited);
	}

	public static void blockedMaze(int[][] maze, int cr, int cc, String ans, boolean[][] visited) {
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			System.out.println(ans);
			return;
		}
		if (cr <= -1 || cc <= -1 || cr > maze.length - 1 || cc > maze[0].length - 1 || maze[cr][cc] == 1
				|| visited[cr][cc] == true) {
			return;
		}
		visited[cr][cc] = true;
		blockedMaze(maze, cr + 1, cc, ans + "B", visited);
		blockedMaze(maze, cr - 1, cc, ans + "T", visited);
		blockedMaze(maze, cr, cc - 1, ans + "L", visited);
		blockedMaze(maze, cr, cc + 1, ans + "R", visited);
		visited[cr][cc] = false;

	}

}
