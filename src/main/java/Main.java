import java.util.ArrayList;
import java.util.Random;

public class Main {
    static void addRndPlayer(ArrayList<Player> all) {

        String Names[] = {"Артем", "Александр", "Максим", "Даниил", "Дмитрий", "Матвей", "Илья", "Алексей"};
        String sNames[] = {"Иванов", "Смирнов", "Кузнецов", "Соколов", "Попов", "Лебедев", "Козлов", "Лебедев"};
        String thNames[] = {"Кириллович", "Валентинович", "Анатольевич", "Денисович", "Павлович", "Сергеевич"};
        for (int i = 0; i < Names.length; i++) {
            Random rnd = new Random();
            String s1 = Names[rnd.nextInt(Names.length)];
            String s2 = sNames[rnd.nextInt(sNames.length)];
            String s3 = thNames[rnd.nextInt(thNames.length)];
            int r = 14 + rnd.nextInt(4);
            Player p = new Player(s1, s2, s3, 'м', r);
            p.points = rnd.nextInt(6);
            all.add(p);
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> all = new ArrayList<Player>();
        Toss t = new Toss();

        addRndPlayer(all);

        System.out.println(" Full List :");
        System.out.println("****************************");
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i).fullInf() + " with pts = " + all.get(i).points + " ");

        }
        System.out.println("****************************");
        System.out.println(" Point groups :");

        ArrayList<ArrayList<Player>> ptrGroups = t.getPointGroups(all);
        System.out.println(ptrGroups.size());
        for(int i = 0; i < ptrGroups.size(); i ++){
            System.out.println("Group " + i + "; ");
            for(int j = 0; j < ptrGroups.get(i).size(); j++){
                System.out.println(ptrGroups.get(i).get(j).fullInf());
            }
        }

    }

}
