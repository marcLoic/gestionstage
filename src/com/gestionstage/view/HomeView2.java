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
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class HomeView2 extends JFrame implements ActionListener {

	JButton creerDemandeStage, modifierDemandeStage, supprimerDemandeStage;
	
	JPanel mainPanel, buttonsPanel, creerPanel, modifierPanel, supprimerPanel, demandeStagePanel;
	
	private JLabel labelDemandeStage;
	
	JTable table;
	
	/*String column[] = {"Entreprise d'accueil", "Sujet", "Résultats attendus", "Expositions de l'élève", 
						"Lieu de stage", "Gratification", "Avantages de l'élève", "Statu de la demande"};
*/
	  String data[][]={ {"101","Amit","670000"},    
              {"102","Jai","780000"},    
              {"101","Sachin","700000"}};    
	  String column[]={"ID","NAME","SALARY"};
	
	public HomeView2()  
    {  
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Welcome");  
        setSize(1000, 600);
        
        creerDemandeStage = new JButton("Creer une demande de stage");
        modifierDemandeStage = new JButton("Modifier une demande de stage");
        modifierDemandeStage.setSize(50, 50);
        supprimerDemandeStage = new JButton("Suprimer une demande de stage");
        supprimerDemandeStage.setSize(50, 50);
        
        creerPanel = new JPanel();
        creerPanel.add(creerDemandeStage);
        modifierPanel = new JPanel();
        modifierPanel.add(modifierDemandeStage);
        supprimerPanel = new JPanel();
        supprimerPanel.add(supprimerDemandeStage);
        
        this.table = new JTable();
        
        buttonsPanel = new JPanel(new GridLayout(1, 4));
        mainPanel = new JPanel();
        
        buttonsPanel.add(creerPanel);
        buttonsPanel.add(modifierPanel);
        buttonsPanel.add(supprimerPanel);
        
        mainPanel.add(this.table);
        mainPanel.add(buttonsPanel);
        
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
