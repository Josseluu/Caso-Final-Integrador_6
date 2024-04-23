import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazUsuario extends JFrame {
    private JTextField textField;
    private JButton addButton;
    private JButton modifyButton;
    private JButton deleteButton;
    private JTable table;
    private DefaultTableModel tableModel;

    public InterfazUsuario() {
        setLayout(new FlowLayout());

        textField = new JTextField(20);
        addButton = new JButton("Add");
        modifyButton = new JButton("Modify");
        deleteButton = new JButton("Delete");

        String[] columnNames = {"Data"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = textField.getText();
                if (!data.isEmpty()) {
                    tableModel.addRow(new Object[]{data});
                    textField.setText("");
                }
            }
        });

        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    String data = textField.getText();
                    if (!data.isEmpty()) {
                        tableModel.setValueAt(data, selectedRow, 0);
                        textField.setText("");
                    }
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.removeRow(selectedRow);
                }
            }
        });

        add(textField);
        add(addButton);
        add(modifyButton);
        add(deleteButton);
        add(new JScrollPane(table));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }
}