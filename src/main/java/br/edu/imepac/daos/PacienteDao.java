/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.daos;

import br.edu.imepac.entidades.Paciente;
import br.edu.imepac.interfaces.IDatabaseCRUD;
import br.edu.imepac.utils.DBConfig;
import br.edu.imepac.enums.Sexo;
import br.edu.imepac.enums.Sim_ou_Nao;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Alfredo
 */
public class PacienteDao implements IDatabaseCRUD<Paciente> {

    private Connection connection;

    private void createConnection() throws SQLException {
        this.connection = DriverManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
    }

    @Override
    public int save(Paciente person) throws SQLException {
        this.createConnection();
        String sql = "insert into pacientes values(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1, person.getNome());
        preparedStatement.setString(2, person.getRG());
        preparedStatement.setString(3, person.getOrgaoEmissor());
        preparedStatement.setString(4, person.getCPF());
        preparedStatement.setString(5, person.getEndereco());
        preparedStatement.setString(6, person.getComplemento());
        preparedStatement.setString(7, person.getBairro());
        preparedStatement.setString(8, person.getCidade());
        preparedStatement.setString(9, person.getEstado());
        preparedStatement.setString(10, person.getTelefone());
        preparedStatement.setString(11, person.getCelular());
        preparedStatement.setDate(12, person.getDataNascimento() );
        preparedStatement.setString(13, person.getSexo().toString());//por algum motivo ele não aceitoueu colocar o atributo doreto como tipo Sexo, então eu tive que transformar em string
        preparedStatement.setString(14, person.getPossuiConvenio() );
        preparedStatement.setString(15, person.getConvenio());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public Contact read(Long id) throws SQLException {
        this.createConnection();
        String sql = "select * from contacts where id = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Contact person = null;
        if (resultSet.next()) {
            person = new Contact(resultSet.getLong("id"), resultSet.getString("name"), resultSet.getString("email"));
        }
        this.destroyConnection();
        return person;
    }

    @Override
    public int delete(Long id) throws SQLException {
        this.createConnection();
        String sql = "delete from contacts where id = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public int update(Contact person) throws SQLException {
        this.createConnection();
        String sql = "update contacts set name = ?, email = ? where id = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1, person.getName());
        preparedStatement.setString(2, person.getEmail());
        preparedStatement.setLong(3, person.getId());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public ArrayList<Contact> findAll() throws SQLException {
        this.createConnection();
        String sql = "select * from contacts";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Contact> persons = new ArrayList<>();
        while (resultSet.next()) {
            persons.add(new Contact(resultSet.getLong("id"), resultSet.getString("name"), resultSet.getString("email")));
        }
        this.destroyConnection();
        return persons;
    }

    private void destroyConnection() throws SQLException {
        this.connection.close();
    }
}
