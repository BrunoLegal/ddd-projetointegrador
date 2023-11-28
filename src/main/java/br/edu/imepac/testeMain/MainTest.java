package br.edu.imepac.testeMain;

import br.edu.imepac.daos.EspecialidadeDao;
import br.edu.imepac.entidades.Especialidade;
import br.edu.imepac.servicos.EspecialidadeService;

import java.sql.SQLException;

//pacote e classe temporarios apenas para testar as classes e metodos sem utilizar o frontend
public class MainTest {
    public final static EspecialidadeService service = new EspecialidadeService();
    public static void main(String[] args) {
        Especialidade esp = new Especialidade("Programador");
        int res = -1;
        try{
            res = service.deleteEspecialidade(1L);
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println(res);


    }
}
