import java.util.ArrayList;

public class Player {
	double points;
	int kBuh; //коэффициент бухгольца
	ArrayList<Player> opponents;
	PlayerStaticInf inf;

	public class PlayerStaticInf {
		String name;
		String sName;
		String thName;
		// Date birthday;
		char sex;
		int rating;

		PlayerStaticInf(String s1, String s2, String s3, char c, int r) {
			name = s1;
			sName = s2;
			thName = s3;
			sex = c;
			rating = r;
		}
	}

	Player(String s1, String s2, String s3, char c, int r) {
		inf = new PlayerStaticInf(s1, s2, s3, c, r);
		points = 0;
		kBuh = 0;
		opponents = new ArrayList<Player>();
	}

	public String fullInf() {
		return  inf.sName + " " + inf.name+ " " + inf.thName + " " + inf.sex + " " + inf.rating;
	}
}

