public class Diagonal {
     int a;
    int b;

    Diagonal(int d1, int d2) {
        this.a = d1;
        this.b = d2;

    }

    int resultado() {
        return (Math.abs(a - b));
    }
}
