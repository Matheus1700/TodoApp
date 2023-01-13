/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;


public class DeadlineColumnCellRenderer extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int col) {
        
        // retorna o componente que vai ser renderizado no grid
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, value,
                isSelected, hasFocus, row, col);
        label.setHorizontalAlignment(CENTER);
        
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);
        
        // fazendo a task mudar a cor de acordo com a validade do prazo
        if (task.getDeadline().after(new Date())) {
            label.setBackground(Color.GREEN);
            label.setForeground(Color.WHITE);
        } else {
            label.setBackground(Color.RED);
            label.setForeground(Color.WHITE);
        }
        
        return label;
    }
}
