public class Main {
    public static void main(String[] args) {
        Chain c1 = new CaractereEspecial();
        Chain c2 = new CaractereMaiusculo();
        Chain c3 = new CaractereMinusculo();
        Chain c4 = new PossuiNumero();
        Chain c5 = new Min8Caracteres();
        Chain c6 = new Max16Caracteres();

        c1.setNext(c2);
        c2.setNext(c3);
        c3.setNext(c4);
        c4.setNext(c5);
        c5.setNext(c6);

        c1.login(new String("victor"));
        c1.senha(new String("Victor123!"));
        c2.senha(new String("Victor123!"));
        c3.senha(new String("Victor123!"));
        c4.senha(new String("Victor123!"));
        c5.senha(new String("Victor123!"));
        c6.senha(new String("Victor123!"));
    }
}
