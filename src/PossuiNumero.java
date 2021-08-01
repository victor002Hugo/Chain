public class PossuiNumero implements Chain {

    private Chain next;

    @Override
    public void setNext(Chain next) {
        this.next = next;
    }

    @Override
    public void login(String login) {
            boolean controle = false;
            for (int i = 0; i < ArrayLogin.length; i++) {

                if (ArrayLogin[i].equals(login)) {
                    System.out.println("Usuario cadastrado");
                    controle = true;
                }
            }
            if (controle == false) {
                System.out.println("Usuario não cadastrado");
            }
        }

    @Override
    public void senha(String senha) {
        char ch;
        boolean controle = false;

        for (int i = 0; i < senha.length(); i++) {
            ch = senha.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.println("4-Sua senha possui numeros");
                controle = true;
                break;
            }
        }
        if(controle == false){
            System.out.println("Error: 4-Sua senha não possui numeros");
        }
    }
}
