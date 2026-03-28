package uebung1;

public class elp {
    int y = 20;

    static void herunterzaehlen (int n) {
        System.out.println(n);
        herunterzaehlen (n - 1);
}

public static void main(String[] args) {
    herunterzaehlen (10);
}
}
