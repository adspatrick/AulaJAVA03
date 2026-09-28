public class Cofrinho {
    private Pessoa dono;
    private int qt50;
    private int qt25;
    private int qt10;

    public Cofrinho(Pessoa dono) {
        this.dono = dono;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void deposita50c() {
        qt50++;
    }

    public void deposita25c() {
        qt25++;
    }

    public void deposita10c() {
        qt10++;
    }

    public double calculaTotal() {
        return (qt50 * 0.50) + (qt25 * 0.25) + (qt10 * 0.10);
    }

    public String informaTotal() {
        return dono.getNome() + " tem um total de R$ " + String.format("%.2f", calculaTotal()) + " reais.";
    }
}