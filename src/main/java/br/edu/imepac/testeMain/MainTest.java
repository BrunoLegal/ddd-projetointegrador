package br.edu.imepac.testeMain;

import br.edu.imepac.daos.EspecialidadeDao;
import br.edu.imepac.entidades.Especialidade;

import java.sql.SQLException;

//pacote e classe temporarios apenas para testar as classes e metodos sem utilizar o frontend
public class MainTest {
    public final EspecialidadeDao dao = new EspecialidadeDao();
    public static void main(String[] args) {
        Especialidade e = new Especialidade(2L,"Bombeiro");
        EspecialidadeDao dao = new EspecialidadeDao();
        int res;

        try{
            System.out.println(dao.update(e));
        }catch (SQLException E){
            E.printStackTrace();
        }


    }
}
