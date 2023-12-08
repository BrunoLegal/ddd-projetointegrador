/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.daos;

import br.edu.imepac.entidades.Convenio;
import br.edu.imepac.interfaces.IDatabaseCRUD;
import br.edu.imepac.utils.DBConfig;

import java.sql.*;
import java.util.ArrayList;

public class ConvenioDao implements IDatabaseCRUD<Convenio>{
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
        String sql = "delete from convenio where codigo_convenio = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }
    @Override
    public Convenio read(Long id) throws SQLException {
        this.createConnection();
        String sql = "select * from convenio where codigo_convenio = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Convenio esp = null;
        if(resultSet.next()){
            esp = new Convenio(resultSet.getInt("codigo_covenio"), resultSet.getString("empresa_convenio"), resultSet.getString("cnpj"), resultSet.getString("telefone") );
        }
        this.destroyConnection();
        return esp;
    }
    @Override
    public int save(Convenio entidade) throws SQLException {
        this.createConnection();
        String sql = "insert into convenio(empresa_convenio) values (?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1,entidade.getempresa_convenio());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }
    public int save(Convenio entidade) throws SQLException {
        this.createConnection();
        String sql = "insert into convenio(cnpj) values (?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1,entidade.getcnpj());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }
    public int save(Convenio entidade) throws SQLException {
        this.createConnection();
        String sql = "insert into convenio(telefone) values (?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1,entidade.gettelefone());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }
    @Override
    public int update(Convenio entidade) throws SQLException {
        this.createConnection();
        String sql = "UPDATE convenio SET empresa_convenio = ? WHERE codigo_convenio = ? AND cnpj = ? AND telefone = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1, entidade.getempresa_convenio());
        preparedStatement.setLong(2, entidade.getcodigo_convenio());
        preparedStatement.setString(3, entidade.getcnpj());
        preparedStatement.setString(4, entidade.gettelefone());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }
    @Override
    public ArrayList<Convenio> findAll() throws SQLException {
        this.createConnection();
        String sql = "select * from convenio";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Convenio> convenio = new ArrayList<>();
        while (resultSet.next()) {
            convenio.add(new Convenio(resultSet.getInt("codigo_convenio"), resultSet.getString("descricao_convenio"), resultSet.getString("cnpj"), resultSet.getString("telefone")));
        }
        this.destroyConnection();
        return convenio;
    }
}
