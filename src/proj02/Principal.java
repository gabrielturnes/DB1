package proj02;

import java.util.Iterator;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        PessoaDAO pDao = new PessoaDAO();
        //Pessoa p = new Pessoa("Gabriel", "1234", "gabriel@turnez.com.br", 80, 180);
        //pDao.inserir(p);
    
        List<Pessoa> contatos = pDao.listarTodas();
        for (Pessoa contato : contatos) {
            System.out.println(contato.getNome());
        }
    }

}
