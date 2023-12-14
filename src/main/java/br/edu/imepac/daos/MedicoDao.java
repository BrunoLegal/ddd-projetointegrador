/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.daos;

import br.edu.imepac.entidades.Medico;
import br.edu.imepac.interfaces.IDatabaseCRUD;
import br.edu.imepac.utils.DBConfig;

import java.sql.*;
import java.util.ArrayList;



import br.edu.imepac.entidades.Medico;
import br.edu.imepac.interfaces.IDatabaseCRUD;
import br.edu.imepac.utils.DBConfig;


import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author 231-001278
 */
public class MedicoDao implements IDatabaseCRUD<Medico> {
    private Connection connection; // cria um objeto para representar a conexão com a database


    //throws basicamente vai fazer a classe jogar um erro "SQLException" caso de um problema
    //isso é usado para ajudar com o tratamento mais tarde
    private void createConnection() throws SQLException{
        this.connection = DriverManager.getConnection(DBConfig.url, DBConfig.user, DBConfig.password);
    }
    //
    private void destroyConnection() throws SQLException {
        this.connection.close();
    }


    //o @Override eu não entendo muito bem para que serve, mas é boa prática, e a ferramenta de criação automatica de codigo coloca então eu não vou mudar
    @Override
    public int save(Medico entidade) throws SQLException {
        this.createConnection();
        String sql = "insert into medicos(nome_medico, codigo_especialidade, crm) values (?,?,?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1,entidade.getNome_Medico());
        preparedStatement.setLong(2,entidade.getCodigo_Especialidade());
        preparedStatement.setString(3,entidade.getCRM());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }


    @Override
    public int delete(Long id) throws SQLException {
        this.createConnection(); //chama o metodo CreateConnection para rapidamente criar uma conexão
        String sql = "delete from medicos where codigo_medico = ?"; //Cria uma string com o comando a ser inserido, "?" é o simbolo utilizado como uma "variavel"
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql); //prepara o comando para ser inserido na database
        preparedStatement.setLong(1, id); //aqui insere um comando do tipo Long onde aquele primeiro ? ficava, no caso o id recebido
        int result = preparedStatement.executeUpdate(); // cria uma variavel int, ela armazena o resultado do metodo que executa o comando preparado
        this.destroyConnection(); //rapidamente fecha a conexão
        return result;
    }


    @Override
    public Medico read(Long id) throws SQLException {
        this.createConnection();
        String sql = "select * from medicos where codigo_medico = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Medico esp = null;
        if(resultSet.next()){
            esp = new Medico(resultSet.getLong("Codigo_medico"), resultSet.getString("Nome_medico"), resultSet.getString("CRM"), resultSet.getLong("Codigo_Especialidade"));
        }
        this.destroyConnection();
        return esp;
    }




    @Override
    public int update(br.edu.imepac.entidades.Medico entidade) throws SQLException {
        this.createConnection();
        String sql = "update medicos set nome_medico = ?, codigo_especialidade = ?, crm = ? where codigo_medico = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1,entidade.getNome_Medico());
        preparedStatement.setLong(2,entidade.getCodigo_Especialidade());
        preparedStatement.setString(3,entidade.getCRM());
        preparedStatement.setLong(4, entidade.getCodigo_Medico());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }




    @Override
    public ArrayList<Medico> findAll() throws SQLException {
        this.createConnection();
        String sql = "select * from medicos";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Medico> medicos = new ArrayList<>(); //cria um objeto ArrayList, basicamente uma lista de objetos
        //adiciona cada resultado dos selects na lista até o resultSet ser null
        while (resultSet.next())
            medicos.add(new Medico(resultSet.getLong("Codigo_Medico"), resultSet.getString("Nome_Medico"), resultSet.getString("CRM") ,resultSet.getLong("Codigo_Especialidade")));
        this.destroyConnection();
        return medicos;
    }
}