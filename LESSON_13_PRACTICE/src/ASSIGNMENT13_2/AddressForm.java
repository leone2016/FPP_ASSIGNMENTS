package ASSIGNMENT13_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddressForm extends JFrame {


    private JTextField idField, firstNameField, lastNameField, ssnField,
            streetField, cityField, stateField, zipField;
    private JLabel statusLabel;

    public AddressForm() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        setTitle("Address Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 250);
        setLayout(new GridLayout(4, 1));

        JPanel topPanel = new JPanel(new GridLayout(2, 4));
        JPanel midPanel = new JPanel(new GridLayout(1, 4));
        JPanel bottomPanel = new JPanel();

        idField = new JTextField();
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        ssnField = new JTextField();

        streetField = new JTextField();
        cityField = new JTextField();
        stateField = new JTextField();
        zipField = new JTextField();

        statusLabel = new JLabel();

        topPanel.add(new JLabel("ID")); topPanel.add(idField);
        topPanel.add(new JLabel("First Name")); topPanel.add(firstNameField);
        topPanel.add(new JLabel("Last Name")); topPanel.add(lastNameField);
        topPanel.add(new JLabel("SSN")); topPanel.add(ssnField);

        midPanel.add(new JLabel("Street")); midPanel.add(streetField);
        midPanel.add(new JLabel("City")); midPanel.add(cityField);
        midPanel.add(new JLabel("State")); midPanel.add(stateField);
        midPanel.add(new JLabel("Zip")); midPanel.add(zipField);

        JButton searchButton = new JButton("Search");
        JButton saveButton = new JButton("Save");
        JButton clearButton = new JButton("Clear");

        bottomPanel.add(searchButton);
        bottomPanel.add(saveButton);
        bottomPanel.add(clearButton);

        add(topPanel);
        add(midPanel);
        add(bottomPanel);
        add(statusLabel);

        searchButton.addActionListener(e -> searchPerson());
        saveButton.addActionListener(e -> savePerson());
        clearButton.addActionListener(e -> clearFields());

        setVisible(true);
    }

    private Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/fpp_address"; // your DB details
        String user = "root";
        String pass = "";
        return DriverManager.getConnection(url, user, pass);
    }

    private void searchPerson() {
        try (Connection con = getConnection();
             PreparedStatement stmt = con.prepareStatement(
                     "SELECT * FROM PERSON JOIN ADDRESS ON PERSON.ID = ADDRESS.PERSON_ID WHERE PERSON.ID=?")) {

            stmt.setString(1, idField.getText());
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                firstNameField.setText(rs.getString("first_name"));
                lastNameField.setText(rs.getString("last_name"));
                ssnField.setText(rs.getString("ssn"));
                streetField.setText(rs.getString("street"));
                cityField.setText(rs.getString("city"));
                stateField.setText(rs.getString("state"));
                zipField.setText(rs.getString("zip"));
                statusLabel.setText("");
            } else {
                statusLabel.setText("No records found");
            }
        } catch (SQLException ex) {
            statusLabel.setText("Database error: " + ex.getMessage());
        }
    }

    private void savePerson() {
        if (idField.getText().isEmpty() || firstNameField.getText().isEmpty() ||
                lastNameField.getText().isEmpty() || ssnField.getText().isEmpty() ||
                streetField.getText().isEmpty() || cityField.getText().isEmpty() ||
                stateField.getText().isEmpty() || zipField.getText().isEmpty()) {

            statusLabel.setText("All fields must be nonempty");
            return;
        }

        try (Connection con = getConnection()) {
            PreparedStatement stmt = con.prepareStatement("INSERT INTO PERSON VALUES (?, ?, ?, ?)");
            stmt.setString(1, idField.getText());
            stmt.setString(2, firstNameField.getText());
            stmt.setString(3, lastNameField.getText());
            stmt.setString(4, ssnField.getText());
            stmt.executeUpdate();

            stmt = con.prepareStatement("INSERT INTO ADDRESS VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, idField.getText());
            stmt.setString(2, streetField.getText());
            stmt.setString(3, cityField.getText());
            stmt.setString(4, stateField.getText());
            stmt.setString(5, zipField.getText());
            stmt.executeUpdate();

            statusLabel.setText("Record saved successfully");

        } catch (SQLException ex) {
            statusLabel.setText("Error saving record: " + ex.getMessage());
        }
    }

    private void clearFields() {
        idField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        ssnField.setText("");
        streetField.setText("");
        cityField.setText("");
        stateField.setText("");
        zipField.setText("");
        statusLabel.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AddressForm::new);
    }
}
