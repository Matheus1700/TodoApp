/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoApp2;

import controller.ProjectController;
import java.sql.Connection;
import java.util.List;
import model.Project;
import util.ConnectionFactory;



public class Main {
 
    public static void main (String[]args){
        /* Testando o projectController -- Deu certo
        ProjectController prj = new ProjectController();
        List <Project> lista = prj.getAll();
        
        System.out.println("Projeto 1: " + lista.get(0).getName());
        System.out.println("Projeto 1: " + lista.get(1).getName());
        
        */
    }
    
    /*  // Primeiro teste do ConnectionFactory
        Connection c = ConnectionFactory.getConnection();
        ConnectionFactory.closeConnection(c);
    */
    
    /*  // teste de adicionar um Projeto ao BD
        ProjectController projectController = new ProjectController();
        
        Project prj = new Project();
        prj.setName("Projeto ZERO");
        prj.setDescription("Descrição teste ZERO");
        projectController.save(prj);
    */
}
