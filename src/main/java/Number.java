public class Number {
    private int id;
    private String text;
    final private int d = 0;
    final private int k = 1;

    public Number(int id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Number{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", d=" + d +
                ", k=" + k +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getD() {
        return d;
    }

    public int getK() {
        return k;
    }
}
