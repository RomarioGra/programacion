import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Usuarios extends jframe {
    private JPanel panel;
    private JTextField idText;
    private JTextField nombreText;
    private JTextField rolText;
    private JButton ingresarButton;
    private JButton consultarButton;
    private JList list1;
Connection conexion;
preparedStatement preparar;
DefaultListModel modelo = new DefaultListModel();
    public void conectar(){
        try{
        conexion = DriverManager.getConnection(jdbc,mysql;localhost:3306/usuario327,user"root",password: "Nicoll318.");
    } catch (SQLException e) {
            throw new RuntimeException();
        }

    }
void consultar(){
        conectar();
}
   void insertar(){
      conectar();
      preparar = conexion.prepareStatement("insert into usuarios (id, nombre, rol) values (?,?,?) ");
      preparar.setInt( 1,Integer.parseInt(idText.getText()));
      preparar.setString( 2, nombreText.getText());
      preparar.setString( 3, rolText.getText());
   }


    public static void main(String[] args) {
        Usuarios usuarios1 = new Usuarios();
        usuarios1.setContentPane(new Usuarios().pane1);
        usuarios1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        usuarios1.setVisible(true);
        usuarios1.pack();
    }
    }