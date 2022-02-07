/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Emille
 */
public class FabricaDeConexoes {
    
    public static Connection getConnection() throws Exception {
        Connection conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost/banco_aluno", "root", "Emilledc00");
        
        return conexao;
    }
}
