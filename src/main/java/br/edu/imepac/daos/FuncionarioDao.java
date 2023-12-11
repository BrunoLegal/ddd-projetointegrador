/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.DAOs;

import br.edu.imepac.entidades.Funcionario;
import br.edu.imepac.interfaces.IDatabaseCRUD;
import br.edu.imepac.utils.DBConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alfredo
 */
public class FuncionarioDao implements IDatabaseCRUD<Funcionario>{

    private Connection connection;
    private void createConnection() throws SQLException {
        this.connection = DriverManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
    }

    private void destroyConnection() throws SQLException {
        this.connection.close();
    }
    @Override
    public int save(Funcionario pessoa) throws SQLException{
        this.createConnection();
        String sql = "insert into funcionario values(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1, pessoa.getNome());
        preparedStatement.setString(2, pessoa.getRG() );
        preparedStatement.setString(3, pessoa.getOrgaoEmissor() );
        preparedStatement.setString(4, pessoa.getCPF());
        preparedStatement.setString(5, pessoa.getEndereco());
        preparedStatement.setString(6, pessoa.getNumero());
        preparedStatement.setString(7, pessoa.getComplemento() );
        preparedStatement.setString(8, pessoa.getBairro());
        preparedStatement.setString(9, pessoa.getCidade());
        preparedStatement.setString(10, pessoa.getEstado());
        preparedStatement.setString(11, pessoa.getTelefone());
        preparedStatement.setString(12, pessoa.getCelular());
        preparedStatement.setString(13, pessoa.getCTPS());
        preparedStatement.setString(14, pessoa.getPIS());
        preparedStatement.setDate(15, pessoa.getData_nascimento());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public Funcionario read(Long codigo_funcionario) throws SQLException {
        this.createConnection();
        String sql = "select * from contacts where codigo_funcionario = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, codigo_funcionario);
        ResultSet resultSet = preparedStatement.executeQuery();
        Funcionario pessoa = null;
        if (resultSet.next()) {
            pessoa = new Funcionario(resultSet.getLong("codigo_funcionario"), resultSet.getString("nome_completo"), resultSet.getString("numero_rg"), resultSet.getString("orgao_emissor"), resultSet.getString("numero_cpf"), resultSet.getString("endereco"), resultSet.getString("numero"), resultSet.getString("complemento"), resultSet.getString("bairro"), resultSet.getString("cidade"), resultSet.getString("estado"), resultSet.getString("telefone"), resultSet.getString("celular"), resultSet.getString("numero_ctps"), resultSet.getString("numero_pis"), resultSet.getDate("data_nascimento"));
        }
        this.destroyConnection();
        return pessoa;
    }

    @Override
    public int delete(Long codigo_funcionario) throws SQLException {
        this.createConnection();
        String sql = "delete from funcionario where codigo_funcionario = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, codigo_funcionario);
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public int update(Funcionario pessoa) throws SQLException {
        this.createConnection();
        String sql = "update contacts set nome_completo = ?, " +
                "numero_rg = ?, " +
                "orgao_emissor = ?, " +
                "numero_cpf = ?, " +
                "endereco = ?, " +
                "numero = ?, " +
                "complemento = ?, " +
                "bairro = ?, " +
                "cidade = ?, " +
                "estado = ?, " +
                "telefone = ?, " +
                "celular = ?, " +
                "numero_ctps = ?, " +
                "numero_pis = ?, " +
                "data_nascimento = ? " +
                "where codigo_funcionario = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1, pessoa.getNome());
        preparedStatement.setString(2, pessoa.getRG());
        preparedStatement.setString(3, pessoa.getOrgaoEmissor());
        preparedStatement.setString(4, pessoa.getCPF());
        preparedStatement.setString(5, pessoa.getEndereco());
        preparedStatement.setString(6, pessoa.getNumero());
        preparedStatement.setString(7, pessoa.getComplemento());
        preparedStatement.setString(8, pessoa.getBairro());
        preparedStatement.setString(9, pessoa.getCidade());
        preparedStatement.setString(10, pessoa.getEstado());
        preparedStatement.setString(11, pessoa.getTelefone());
        preparedStatement.setString(12, pessoa.getCelular());
        preparedStatement.setString(13, pessoa.getCTPS());
        preparedStatement.setString(14, pessoa.getPIS());
        preparedStatement.setDate(15, pessoa.getData_nascimento());
        preparedStatement.setLong(16, pessoa.getCodigo_funcionario());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public ArrayList<Funcionario> findAll() throws SQLException {
        this.createConnection();
        String sql = "select * from funcionarios";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Funcionario> persons = new ArrayList<>();
        while (resultSet.next()) {

            persons.add(new Funcionario(
                    resultSet.getLong("codigo_funcionario"),
                    resultSet.getString("nome_completo"), 
                    resultSet.getString("numero_rg"), 
                    resultSet.getString("orgao_emissor"),
                    resultSet.getString("numero_cpf"), 
                    resultSet.getString("endereco"),
                    resultSet.getString("numero"),
                    resultSet.getString("complemento"),
                    resultSet.getString("bairro"),
                    resultSet.getString("cidade"),
                    resultSet.getString("estado"),
                    resultSet.getString("telefone"),
                    resultSet.getString("celular"),
                    resultSet.getString("numero_ctps"),
                    resultSet.getString("numero_pis"),
                    resultSet.getDate("data_nascimento")));
        }
        this.destroyConnection();
        return persons;
    }


}
