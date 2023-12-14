/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.daos;

import br.edu.imepac.entidades.Usuario;
import br.edu.imepac.interfaces.IDatabaseCRUD;
import br.edu.imepac.utils.DBConfig;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
public class UsuarioDao implements IDatabaseCRUD<Usuario> {

    private Connection connection;

    private void createConnection() throws SQLException{
        this.connection = DriverManager.getConnection(DBConfig.url,DBConfig.user, DBConfig.password);
    }
    private void destroyConnection() throws SQLException{
        this.connection.close();
    }


    @Override
    public int delete(Long id) throws SQLException {
        this.createConnection();
        String sql = "delete from usuarios where Registro_Usuario = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public Usuario read(Long id) throws SQLException {
        this.createConnection();
        String sql = "select * from usuarios where registro_usuario = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Usuario user = null;
        if(resultSet.next()){
            user = new Usuario(resultSet.getLong("registro_usuario"),
                    resultSet.getString("indentificacao_usuario"),
                    resultSet.getString("senha_acesso"),
                    resultSet.getString("cadastro_funcionario"),
                    resultSet.getString("cadastro_usuario"),
                    resultSet.getString("cadastro_paciente"),
                    resultSet.getString("cadastro_especialidade"),
                    resultSet.getString("cadastro_medico"),
                    resultSet.getString("cadastro_convenio"),
                    resultSet.getString("agendamento_consulta"),
                    resultSet.getString("cancelamento_consulta"),
                    resultSet.getString("modulo_administrativo"),
                    resultSet.getString("modulo_agendamento"),
                    resultSet.getString("modulo_atendimento"));
        }
        this.destroyConnection();
        return user;
    }

    @Override
    public int save(Usuario entidade) throws SQLException {
        this.createConnection();
        String sql = "insert into usuarios values (NULL,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1,entidade.getIdentificacao_usuario());
        preparedStatement.setString(2,entidade.getSenha_acesso());
        preparedStatement.setString(3,entidade.getCadastro_funcionario());
        preparedStatement.setString(4,entidade.getCadastro_usuario());
        preparedStatement.setString(5,entidade.getCadastro_paciente());
        preparedStatement.setString(6,entidade.getCadastro_especialidade());
        preparedStatement.setString(7,entidade.getCadastro_medico());
        preparedStatement.setString(8,entidade.getCadastro_convenio());
        preparedStatement.setString(9,entidade.getAgendamento_consulta());
        preparedStatement.setString(10,entidade.getCancelamento_consulta());
        preparedStatement.setString(11,entidade.getModulo_administrativo());
        preparedStatement.setString(12,entidade.getModulo_agendamento());
        preparedStatement.setString(13,entidade.getModulo_atendimento());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public int update(Usuario entidade) throws SQLException {
        this.createConnection();
        String sql = "update usuarios set Indentificacao_Usuario= ?, Senha_Acesso = ?, Cadastro_Funcionario = ?, Cadastro_Usuario = ?, Cadastro_Paciente = ?, Cadastro_Especialidade = ?, Cadastro_Medico = ?, Cadastro_Convenio = ?, Agendamento_Consulta = ?, Cancelamento_Consulta = ?, Modulo_Administrativo = ?, Modulo_Agendamento = ?, Modulo_Atendimento = ? where Registro_Usuario = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1,entidade.getIdentificacao_usuario());
        preparedStatement.setString(2,entidade.getSenha_acesso());
        preparedStatement.setString(3,entidade.getCadastro_funcionario());
        preparedStatement.setString(4,entidade.getCadastro_usuario());
        preparedStatement.setString(5,entidade.getCadastro_paciente());
        preparedStatement.setString(6,entidade.getCadastro_especialidade());
        preparedStatement.setString(7,entidade.getCadastro_medico());
        preparedStatement.setString(8,entidade.getCadastro_convenio());
        preparedStatement.setString(9,entidade.getAgendamento_consulta());
        preparedStatement.setString(10,entidade.getCancelamento_consulta());
        preparedStatement.setString(11,entidade.getModulo_administrativo());
        preparedStatement.setString(12,entidade.getModulo_agendamento());
        preparedStatement.setString(13,entidade.getModulo_atendimento());
        preparedStatement.setLong(14, entidade.getRegistro_usuario());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public ArrayList<Usuario> findAll() throws SQLException {
        this.createConnection();
        String sql = "select * from usuarios";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Usuario> user = new ArrayList<>();
        while(resultSet.next()){
            user.add(new Usuario(resultSet.getLong("Registro_Usuario"),
                    resultSet.getString("Indentificacao_Usuario"),
                    resultSet.getString("Senha_Acesso"),
                    resultSet.getString("Cadastro_Funcionario"),
                    resultSet.getString("Cadastro_Usuario"),
                    resultSet.getString("Cadastro_Paciente"),
                    resultSet.getString("Cadastro_Especialidade"),
                    resultSet.getString("Cadastro_Medico"),
                    resultSet.getString("Cadastro_Convenio"),
                    resultSet.getString("Agendamento_Consulta"),
                    resultSet.getString("Cancelamento_Consulta"),
                    resultSet.getString("Modulo_Administrativo"),
                    resultSet.getString("Modulo_Agendamento"),
                    resultSet.getString("Modulo_Atendimento")));
        }
        this.destroyConnection();
        return user;
    }
    public Long check(String user, String psswd) throws SQLException{
        this.createConnection();
        String sql = "select registro_usuario from usuarios where indentificacao_usuario = ? and senha_acesso = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1,user);
        preparedStatement.setString(2,psswd);
        ResultSet resultSet = preparedStatement.executeQuery();
        Long result = Long.parseLong("-1");
        if(resultSet.next()){
            result = resultSet.getLong("registro_usuario");
        }
        this.destroyConnection();
        return result;
    }
}
