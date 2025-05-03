import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    public void salvar(Produto produto) {
        String sql = "INSERT INTO Produto (Descricao, Preco, Categoria, Codigo_de_barras, Imagem, Fornecedor_idFornecedor, Estoque_idEstoque) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPreco());
            stmt.setString(3, produto.getCategoria());
            stmt.setString(4, produto.getCodigoDeBarras());
            stmt.setString(5, produto.getImagem());
            stmt.setInt(6, produto.getFornecedorId());
            stmt.setInt(7, produto.getEstoqueId());

            stmt.executeUpdate();
            System.out.println("Produto cadastrado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao cadastrar produto: " + e.getMessage());
        }
    }
}

