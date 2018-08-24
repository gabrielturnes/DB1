package proj02;

public class Principal {

    public static void main(String[] args) {
        PessoaDAO pDao = new PessoaDAO();
        Pessoa p = new Pessoa("Gabriel", "1234", "gabriel@turnez.com.br", 80, 180);
        
        pDao.inserir(p);
    }

}
