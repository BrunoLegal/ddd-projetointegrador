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

/**
 *
 * @author 231-001278
 */
public class MedicoDao implements IDatabaseCRUD<br.edu.imepac.entidades.Medico> {
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
        String sql = "insert into medico(codigo_medico, nome_medico, , codigo_especialidade, crm) values (?,?,?,?))";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setInt(1,entidade.getCodigo_Medico());
        preparedStatement.setString(2,entidade.getNome_Medico());
        preparedStatement.setInt(3,entidade.getCodigo_Especialidade());
        preparedStatement.setString(4,entidade.getCRM());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }
