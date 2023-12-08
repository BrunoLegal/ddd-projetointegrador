/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.daos;

import br.edu.imepac.entidades.Especialidade;
import br.edu.imepac.interfaces.IDatabaseCRUD;
import br.edu.imepac.utils.DBConfig;

import java.sql.*; //TODO importar somente o necessario
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
 /* note que essa classe implementa a interface IDatabaseCrud, e o coringa "T" aqui vai
    significar a entidade(classe) Especialidade, então, na interface, onde tem "T", aqui
    é substituido por "Entidade"
 */
public class EspecialidadeDao implements IDatabaseCRUD<Especialidade> {
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
    public int delete(Long id) throws SQLException {
        this.createConnection(); //chama o metodo CreateConnection para rapidamente criar uma conexão
        String sql = "delete from Especialidades where Codigo_Especialidade = ?"; //Cria uma string com o comando a ser inserido, "?" é o simbolo utilizado como uma "variavel"
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql); //prepara o comando para ser inserido na database
        preparedStatement.setLong(1, id); //aqui insere um comando do tipo Long onde aquele primeiro ? ficava, no caso o id recebido
        int result = preparedStatement.executeUpdate(); // cria uma variavel int, ela armazena o resultado do metodo que executa o comando preparado
        this.destroyConnection(); //rapidamente fecha a conexão
        return result;
    }

    @Override
    public Especialidade read(Long id) throws SQLException {
        this.createConnection();
        String sql = "select * from Especialidades where Codigo_Especialidade = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery(); //cria um objeto ResultSet pra armazenar o resultado do select
        Especialidade esp = null; //prepara um objeto esp
        if(resultSet.next()){
            esp = new Especialidade(resultSet.getLong("Codigo_Especialidade"), resultSet.getString("Descricao_Especialidade")); // cria um novo objeto recebendo os valores para cada coluna
        }
        this.destroyConnection();
        return esp; //retorna o objeto para quem chamou o metodo
    }

    @Override
    public int save(Especialidade entidade) throws SQLException {
        this.createConnection();
        String sql = "insert into Especialidades(Descricao_Especialidade) values (?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1,entidade.getDescricao_especialidade());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public int update(Especialidade entidade) throws SQLException {
        this.createConnection();
        String sql = "update Especialidades set Descricao_Especialidade = ? where Codigo_Especialidade = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setString(1, entidade.getDescricao_especialidade()); //o primeiro parametro é um numero, ele representa qual "?" é para se substituir, da esquerda para a direita
        preparedStatement.setLong(2, entidade.getCodigo_especialidade());
        int result = preparedStatement.executeUpdate();
        this.destroyConnection();
        return result;
    }

    @Override
    public ArrayList<Especialidade> findAll() throws SQLException {
        this.createConnection();
        String sql = "select * from Especialidades";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Especialidade> especialidades = new ArrayList<>(); //cria um objeto ArrayList, basicamente uma lista de objetos
        while (resultSet.next()) { //adiciona cada resultado dos selects na lista até o resultSet ser null
            especialidades.add(new Especialidade(resultSet.getLong("Codigo_Especialidade"), resultSet.getString("Descricao_Especialidade")));
        }
        this.destroyConnection();
        return especialidades;
    }
}