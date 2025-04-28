package login_pkg;

import javax.swing.*;
import java.awt.*;


public class InvoiceFrame extends BaseFrame{
	public InvoiceFrame() {
			super("Invoice list", 300, 200);
			String[] invoices = {
					"INV-001 | CustomerA | $100",
					"INV-002 | CustomerB | $250",
					"INV-003 | CustomerC | $75",
					"INV-004 | CustomerD | $300"
					};
			
			JList<String> invoiceList = new JList<>(invoices);
			JScrollPane scrollPane = new JScrollPane(invoiceList);
			frame.add(scrollPane, BorderLayout.CENTER);
}}
