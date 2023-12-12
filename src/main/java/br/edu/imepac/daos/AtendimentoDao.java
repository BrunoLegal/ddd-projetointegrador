/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.daos;

import br.edu.imepac.entidades.Atendimento;
import br.edu.imepac.interfaces.IDatabaseCRUD;
import br.edu.imepac.utils.DBConfig;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
public class AtendimentoDao implements IDatabaseCRUD<Atendimento> {

    private Connection connection;

    private void createConnection() throws SQLException{
        this.connection = DriverManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
    }
    private void destroyConnection() throws SQLException{
        this.connection.close();
    }
    @Override
    public int delete(Long id) throws SQLException {
        this.createConnection();
        String sql = "delete from prontuario_paciente where registro = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public Atendimento read(Long id) throws SQLException {
        this.createConnection();
        String sql = "select * from prontuario_paciente where registro = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Atendimento atendimento = null;
        if(resultSet.next()){
            atendimento = new Atendimento(resultSet.getLong("registro"),
                    resultSet.getLong("registro_agenda"),
                    resultSet.getString("historico"),
                    resultSet.getString("receituario"),
                    resultSet.getString("exames"));
        }
        this.destroyConnection();
        return atendimento;
    }

    @Override
    public int save(Atendimento entidade) throws SQLException {
        this.createConnection();
        String sql = "insert into prontuario_paciente values(null, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, entidade.getRegistro_agenda());
        preparedStatement.setString(2, entidade.getHistorico());
        preparedStatement.setString(3, entidade.getReceituario());
        preparedStatement.setString(4, entidade.getExames());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public int update(Atendimento entidade) throws SQLException {
        this.createConnection();
        String sql = "update prontuario_paciente set registro_agenda = ?, historico = ?, receituario = ?, exames = ? where registro = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, entidade.getRegistro_agenda());
        preparedStatement.setString(2, entidade.getHistorico());
        preparedStatement.setString(3, entidade.getReceituario());
        preparedStatement.setString(4, entidade.getExames());
        preparedStatement.setLong(5, entidade.getRegistro_prontuario());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public ArrayList<Atendimento> findAll() throws SQLException {
        this.createConnection();
        String sql = "select * from prontuario_paciente";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Atendimento> atendimento = new ArrayList<>();
        while(resultSet.next()){
            atendimento.add(new Atendimento(resultSet.getLong("registro"),
                    resultSet.getLong("registro_agenda"),
                    resultSet.getString("historico"),
                    resultSet.getString("receituario"),
                    resultSet.getString("exames")));
        }
        this.destroyConnection();
        return atendimento;
    }
}
