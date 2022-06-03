package com.gestionstage.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class HomeView extends JFrame implements ActionListener {

	JButton creerDemandeStage, modifierDemandeStage, supprimerDemandeStage;
	
	JPanel mainPanel, buttonsPanel;
	
	private JLabel labelDemandeStage;
	
	JTable table;
	TableColumnModel columnModel = table.getColumnModel();
//	TableColumn number1 = 
	
	String column[] = {"Entreprise d'accueil", "Sujet", "Résultats attendus", "Expositions de l'élève", 
						"Lieu de stage", "Gratification", "Avantages de l'élève", "Statu de la demande"};
	String data[][]={};
	
	public HomeView()  
    {  
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Welcome");  
        setSize(1000, 600);
        
        creerDemandeStage = new JButton("Creer une demande de stage");
        modifierDemandeStage = new JButton("Modifier une demande de stage");
        supprimerDemandeStage = new JButton("Suprimer une demande de stage");
        
        this.table = new JTable(data, column);
        
        mainPanel = new JPanel();
        mainPanel.add(creerDemandeStage);
        mainPanel.add(modifierDemandeStage);
        mainPanel.add(supprimerDemandeStage);
        mainPanel.add(new JScrollPane(this.table));
        
        labelDemandeStage = new JLabel("Liste des demande de stage");
        
        add(mainPanel);
        
        setTitle("Accueil");
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
}
