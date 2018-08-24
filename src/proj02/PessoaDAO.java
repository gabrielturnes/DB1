package proj02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaDAO {

    public boolean inserir(Pessoa p) {
        try (Connection conexao = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO Pessoa (nome, telefone, peso, altura, email) VALUES "
                    + "(?,?,?,?,?)";
            
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, p.getNome());
                stmt.setString(2, p.getTelefone());
                stmt.setDouble(3, p.getPeso());
                stmt.setInt(4, p.getAltura());
                stmt.setString(5, p.getEmail());
                
                stmt.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }
}
