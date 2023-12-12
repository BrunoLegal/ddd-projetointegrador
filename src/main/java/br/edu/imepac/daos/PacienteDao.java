/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.DAOs;

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
        preparedStatement.setString(14, person.getPossuiConvenio().toString() );//esse aqui deu o mesmo problema, acho q é porque é um tipo de dado ENUM
        preparedStatement.setLong(15, person.getConvenio());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public Paciente read(Long codigo_paciente) throws SQLException {
        this.createConnection();
        String sql = "select * from contacts where codigo_paciente = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, codigo_paciente);
        ResultSet resultSet = preparedStatement.executeQuery();
        Paciente person = null;
        if (resultSet.next()) {
            person = new Paciente(
                    resultSet.getLong("codigo_paciente"),
                    resultSet.getString("nome"),
                    resultSet.getString("numero_rg"),
                    resultSet.getString("orgao_emissor"),
                    resultSet.getString("numero_cpf"),
                    resultSet.getString("endereco"),
                    resultSet.getString("complemento"),
                    resultSet.getString("bairro"),
                    resultSet.getString("cidade"),
                    resultSet.getString("estado"),
                    resultSet.getString("telefone"),
                    resultSet.getString("celular"),
                    resultSet.getDate("data_nascimento"),
                    Sexo.valueOf(resultSet.getString("sexo")),
                    Sim_ou_Nao.valueOf(resultSet.getString("tem_convenio")),
                    resultSet.getLong("codigo_convenio"));
        }
        this.destroyConnection();
        return person;
    }

    @Override
    public int delete(Long codigo_paciente) throws SQLException {
        this.createConnection();
        String sql = "delete from contacts where codigo_paciente = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, codigo_paciente);
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public int update(Paciente person) throws SQLException {
        this.createConnection();
        String sql = "update contacts set nome = ?," +
                " numero_rg = ?," +
                " orgao_emissor = ?," +
                " numero_cpf = ?," +
                " endereço = ?," +
                " complemento = ?," +
                " bairro = ?," +
                " cidade = ?," +
                " estado = ?," +
                " telefone = ?," +
                " celular = ?," +
                " data_nascimento = ?," +
                " sexo = ?," +
                " tem_convenio = ?," +
                " codigo_convenio = ?" +
                " where codigo_paciente = ?;";
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
        preparedStatement.setString(14, person.getPossuiConvenio().toString() );//esse aqui deu o mesmo problema, acho q é porque é um tipo de dado ENUM
        preparedStatement.setLong(15, person.getConvenio());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public ArrayList<Paciente> findAll() throws SQLException {
        this.createConnection();
        String sql = "select * from pacientes";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Paciente> persons = new ArrayList<>();
        while (resultSet.next()) {
            persons.add(new Paciente(
                    resultSet.getLong("codigo_paciente"),
                    resultSet.getString("nome"),
                    resultSet.getString("numero_rg"),
                    resultSet.getString("orgao_emissor"),
                    resultSet.getString("numero_cpf"),
                    resultSet.getString("endereco"),
                    resultSet.getString("complemento"),
                    resultSet.getString("bairro"),
                    resultSet.getString("cidade"),
                    resultSet.getString("estado"),
                    resultSet.getString("telefone"),
                    resultSet.getString("celular"),
                    resultSet.getDate("data_nascimento"),
                    Sexo.valueOf(resultSet.getString("sexo")),
                    Sim_ou_Nao.valueOf(resultSet.getString("tem_convenio")),
                    resultSet.getLong("codigo_convenio")));
        }
        this.destroyConnection();
        return persons;
    }

    private void destroyConnection() throws SQLException {
        this.connection.close();
    }
}
