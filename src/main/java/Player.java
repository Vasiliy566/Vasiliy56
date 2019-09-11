import java.util.ArrayList;

public class Player {
    double points;
    int kBuh; //коэффициент бухгольца
    ArrayList<Player> opponents;
    PersonalInfo inf;

    public class PersonalInfo {
        String name;
        String sName;
        String thName;
        // Date birthday;
        char sex;
        int rating;

        PersonalInfo(String name_, String sName_, String thName_, char sex_, int rating_) {
            name = name_;
            sName = sName_;
            thName = thName_;
            sex = sex_;
            rating = rating_;
        }
        public int getRating(){return rating;}
    }

    Player(String s1, String s2, String s3, char c, int r) {
        inf = new PersonalInfo(s1, s2, s3, c, r);
        points = 0;
        kBuh = 0;
        opponents = new ArrayList<Player>();
    }
    public double getPoints(){
        return points;
    }
    public int getRating(){
        return inf.getRating();
    }
    public String getPersonalInf() {
        return inf.sName + " " + inf.name + " " + inf.thName + " " + inf.sex + " " + inf.rating;
    }
    public String fullInf() {
        return getPersonalInf() + " " + points;
    }
}

