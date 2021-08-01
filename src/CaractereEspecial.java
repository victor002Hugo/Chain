import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaractereEspecial implements Chain {

    private Chain next;


    @Override
    public void setNext(Chain next) {
        this.next=next;
    }

    @Override
    public void login(String login) {
        boolean controle=false;
        for(int i=0;i<ArrayLogin.length;i++){

            if(ArrayLogin[i].equals(login)){
                System.out.println("Usuario cadastrado");
                controle=true;
            }
        }
        if(controle==false) {
            System.out.println("Usuario não cadastrado");
        }
    }

    @Override
    public void senha(String s) {
        if (s == null || s.trim().isEmpty()) {
            System.out.println("Incorrect format of string");
        }
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(s);
        // boolean b = m.matches();
        boolean b = m.find();
        if (b == true)
            System.out.println("1-Sua senha possui um caractere especial");
        else
            System.out.println("Error: 1-Sua senha não possui caracteres especiais.");
    }

}

