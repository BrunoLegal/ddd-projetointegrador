/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.DAOs;

import br.edu.imepac.entidades.Consulta;
import br.edu.imepac.interfaces.IDatabaseCRUD;
import br.edu.imepac.utils.DBConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaDao implements IDatabaseCRUD<Consulta> {
    private Connection connection;

    private void createConnection() throws SQLException {
        this.connection = DriverManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
    }
    private void destroyConnection() throws SQLException {
        this.connection.close();
    }
    @Override
    public int delete(Long id) throws SQLException {
        this.createConnection();
        String sql = "delete from agenda_consulta where registro_agenda = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }
    @Override
    public Consulta read(Long id) throws SQLException {
        this.createConnection();
        String sql = "select * from agenda_consulta WHERE registro_agenda = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Consulta cons = null;
        if(resultSet.next()){
            cons = new Consulta(resultSet.getLong("registro_agenda"),
                    resultSet.getLong("registro_usuario"),
                    resultSet.getLong("codigo_paciente"),
                    resultSet.getLong("codigo_medico"),
                    resultSet.getDate("data"),
                    resultSet.getTime("hora"),
                    resultSet.getString("retorno"),
                    resultSet.getString("cancelado"),
                    resultSet.getString("motivo_cancelamento"));
        }
        this.destroyConnection();
        return cons;
    }
    @Override
    public int save(Consulta entidade) throws SQLException {
        this.createConnection();
        String sql = "insert into convenio(empresa_convenio) values (NULL,NULL,NULL,NULL,?,?,?,?,?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setDate(1,entidade.getdata());
        preparedStatement.setTime(2,entidade.gethora());
        preparedStatement.setString(3,entidade.getretorno());
        preparedStatement.setString(4,entidade.getcancelado());
        preparedStatement.setString(5,entidade.getmotivo_cancelamento());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public int update(Consulta entidade) throws SQLException {
        this.createConnection();
        String sql = "UPDATE consulta SET data = ? WHERE hora = ? AND retorno = ? AND cancelado = ? AND motivo_cancelamento";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setDate(1, entidade.getdata());
        preparedStatement.setTime(2, entidade.gethora());
        preparedStatement.setString(3, entidade.getretorno());
        preparedStatement.setString(4, entidade.getcancelado());
        preparedStatement.setString(5, entidade.getmotivo_cancelamento());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }
    @Override
    public ArrayList<Consulta> findAll() throws SQLException {
        this.createConnection();
        String sql = "select * from consulta";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Consulta> consulta = new ArrayList<>();
        while (resultSet.next()) {
            consulta.add(new Consulta(resultSet.getLong("registro_agenda"),
                    resultSet.getLong("registro_usuario"),
                    resultSet.getLong("codigo_paciente"),
                    resultSet.getLong("codigo_medico"),
                    resultSet.getDate("data"),
                    resultSet.getTime("hora"),
                    resultSet.getString("retorno"),
                    resultSet.getString("cancelado"),
                    resultSet.getString("motivo_cancelamento")));
        }
        this.destroyConnection();
        return consulta;
    }
}
