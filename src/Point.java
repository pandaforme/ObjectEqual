import java.util.Objects;

public class Point {
	public final int	x;
	public final int	y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object that) {
		if (that instanceof Point) {
			Point point = (Point) that;
			return this.x == point.x && this.y == point.y;
		}

		return false;
	}

	@Override
	public int hashCode() {
		//return 41 * (41 + this.x) + this.y;
		return Objects.hash(x,y);
	}
}
