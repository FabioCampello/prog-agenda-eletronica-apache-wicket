package com.ApacheWicketAgendaEletronica;

import org.apache.wicket.markup.html.basic.Label;

//CLASSE PÚBLICA QUE EXTENDE DA CLASSE BASEPAGE
public class Criar extends BasePage {

	// VARIÁVEL PRIAVADA DE CLASSE CONSTANTE
	private static final long serialVersionUID = 2862869644558569488L;

	// MÉTODO CONSTRUTOR
	public Criar() {
		add(new Label("lblCriar", "Criar novo contato!"));
	}

}
