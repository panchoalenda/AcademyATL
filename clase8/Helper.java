package clase8;

public class Helper {

    public double areaCuadrado(int lado){
        return Math.pow(lado, 2);
    }
    public double areaTriangulo(int base, int altura){
        return ((double) base * altura)/2;
    }

    public String generaPassword(String password){
        int complemento = (int)Math.round(Math.random()*1000);
        return password + complemento;
    }
}
