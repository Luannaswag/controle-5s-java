public class Avaliacao5S {

    String setor;
    double seiri;
    double seiton;
    double seiso;
    double seiketsu;
    double shitsuke;

    public Avaliacao5S(String setor, double seiri, double seiton, double seiso,
                       double seiketsu, double shitsuke) {
        this.setor = setor;
        this.seiri = seiri;
        this.seiton = seiton;
        this.seiso = seiso;
        this.seiketsu = seiketsu;
        this.shitsuke = shitsuke;
    }

    public double calcularMedia() {
        return (seiri + seiton + seiso + seiketsu + shitsuke) / 5;
    }
}
