
package view;

import dao.AlunoDAO;
import dao.Conexao;
import java.sql.Connection;
import model.Aluno;

public class Main {
    public static void main(String[] args) {        
        AlunoDAO dao = new AlunoDAO();
        dao.atualizar(6);
        dao.pesquisarAll();
             
       
         
        
    }    
}