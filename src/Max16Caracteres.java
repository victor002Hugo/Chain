public class Max16Caracteres implements Chain {

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
        if(senha.length()>16){

            System.out.println("Error: 6-O tamanho da sua senha não é valido");
        }else{
            System.out.println("6-Sua senha possui menos de 16 caracteres");
        }
    }
}
