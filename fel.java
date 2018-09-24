public class PolarGenerator {
    boolean nincsTarolt = true;
    double tarolt;
    
    public PolarGenerator(){
        nincsTarolt = true;
    }
    
    public double kovetkezo(){
        if (nincsTarolt) {
            double u1, u2, v1, v2, v;
            do {
                v1 = Math.random();
                v2 = Math.random();
                v1 = 2 * u1 - 1;
                v2 = 2 * u2 - 1;
                v = v1 * v1 + v2 * v2;
                
            }while (v > 1 );
            double r = Math.sqrt(1-2 * Math.log(v) / v);
            tarolt = r *v2;
            nincsTarolt = !nincsTarolt;
            return r * v1;
        } else {
            nincsTarolt = !nincsTarolt;
            return tarolt;
        }
    }
    
    
    public static void main(String[] args) {
        PolarGenerator g = new PolarGenerator();
        for (int i = 0 ; i < 10 ; ++i){
            System.out.println(g.kovetkezo());
        }
    }
}