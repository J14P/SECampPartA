import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLOutput;

public class SECampFrame extends JFrame {
    JFrame frame;

    JPanel invoicePnl;
    JPanel addressPnl;

    JButton generateBtn;
    JButton quitBtn;

    JTextField nameField;
    JTextField addressField;
    JTextField cityStateZipField;


    public SECampFrame()
    {

        createinvoicePnl();
        createaddressPnl();

        add(addressPnl);
        add(invoicePnl);
        setTitle("Invoice");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void createaddressPnl()
    {
        addressPnl = new JPanel();
        addressPnl.setLayout(new GridLayout(3,3));
        addressPnl.setBorder(new TitledBorder(new EtchedBorder(), "Address Panel"));

        nameField = new JTextField();
        addressField = new JTextField();
        cityStateZipField = new JTextField();


        invoicePnl.add(nameField);
        invoicePnl.add(addressField);
        invoicePnl.add(cityStateZipField);
    }

    private void createinvoicePnl()
    {
        invoicePnl = new JPanel();
        invoicePnl.setLayout(new GridLayout(3,3));
        invoicePnl.setBorder(new TitledBorder(new EtchedBorder(), "Invoice Panel"));

        int count = 0;

        if (count == 0)
        {
            createInvoiceTemplate();
        }

        generateBtn = new JButton("Generate");
        quitBtn = new JButton("Quit");

        quitBtn.addActionListener((ActionEvent ae) -> {System.exit(0);});


        invoicePnl.add(generateBtn);
        invoicePnl.add(quitBtn);

    }

    private void createInvoiceTemplate()
    {
        System.out.println("\t\tInvoice");
        System.out.println("Sam's Small Appliances");
        System.out.println("100 Main Street");
        System.out.println("Anytown, CA 98675");
        System.out.println("-------------------------------");
        System.out.println("item \t\t Qty \tPrice\tTotal");
        System.out.println("Toaster \t\t3\t$29.95\t$89.85");
        System.out.println("Hair Dryer\t\t1\t$24.95\t$24.95");
        System.out.println("Car Vaccum\t\t2\t$19.99\t$39.98");
        System.out.println("-------------------------------");
        System.out.println("AMOUNT DUE: $154.78");
    }
}
