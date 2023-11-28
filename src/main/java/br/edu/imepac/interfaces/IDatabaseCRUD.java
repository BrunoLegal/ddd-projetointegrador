package br.edu.imepac.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IDatabaseCRUD<T> {
    //Isso é uma interface, qualquer classe que implementar essa interface é forçada a ter os metodos mencionados aqui
    /* O <T> é necessário, para que a classe implementando essa interface possa
       usar qualquer entidade, caso contrário cada entidade teria que ter uma interface própria,
       basicamente o T é um coringa pra que seja necessário apenas uma interface para multiplos arquivos
       que usem o mesmo metodo
     */
    //isso são metodos, detalhe, não há código, é basicamente uma lista de metodos que TEM que ter
    int delete(Long id) throws SQLException;

    //reforçando o comentário no começo, o T aqui substitui um Usuario, ou um Paciente
    T read(Long id) throws SQLException;

    int save(T entidade) throws SQLException;

    int update(T entidade) throws SQLException;

    ArrayList<T> findAll() throws SQLException;

}
