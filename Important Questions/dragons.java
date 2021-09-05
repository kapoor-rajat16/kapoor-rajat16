import java.util.*;

public class dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        List<Pair> pair = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            pair.add(new Pair(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(pair);

        int t = 1;

        for (int i = 0; i < n; i++) {
            if (s > pair.get(i).dragonStrength) {
                s = s + pair.get(i).bonus;
            } else {
                t = 0;
                break;
            }
        }
        if (t == 0) {
            System.out.println("NO");
        } else
            System.out.println("YES");

    }
}
class Pair implements Comparable<Pair> {
    int dragonStrength;
    int bonus;

    public Pair(int dragonStrength, int bonus) {
        this.dragonStrength = dragonStrength;
        this.bonus = bonus;
    }

    @Override
    public int compareTo(Pair obj) {
        if (this.dragonStrength > obj.dragonStrength)
            return 1;
        else if (this.dragonStrength < obj.dragonStrength)
            return -1;
        return 0;
    }
}