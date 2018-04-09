
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bell Rodrigues
 */
public class ChamaMetodos {
    
     
    public void Conexao() {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showInternalMessageDialog(null,"Não foi possivel encontrar a classe!");
        }
            
            Connection con;
        try {    
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/folhacalc?useSSL=false", "root", "");
            
        } catch (SQLException ex) {
            JOptionPane.showInternalMessageDialog(null,"Ocorreu um erro de SQL");
        }
    }
    
    public void ChamaNovoCadastro (){
       TelaNovoCadastro1 novocadastro = new TelaNovoCadastro1();
       novocadastro.setVisible(true);
    }
    
    public void ChamaNovaConsulta () {
        TelaInfoFuncionario novaconsultafuncionario = new TelaInfoFuncionario();
        novaconsultafuncionario.setVisible(true);
    }
    
    public void Sair() {
        System.exit(1);
    }
    
    public void ConsultaFolhaPagamento(){
        ConsultadeFolha consultafolha = new ConsultadeFolha();
        consultafolha.setVisible(true);
    }
    
    public void ConsultaFolhaPagamentoGrupo() {
        ConsultaFolhaGrupo consultagrupo = new ConsultaFolhaGrupo();
        consultagrupo.setVisible(true);
    }
    
        
}

