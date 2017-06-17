package com.ApacheWicketAgendaEletronica;

import org.apache.wicket.markup.html.basic.Label;

//CLASSE PÚBLICA QUE EXTENDE DA CLASSE BASEPAGE
public class Pesquisar extends BasePage {

	// VARIÁVEL PRIAVADA DE CLASSE CONSTANTE
	private static final long serialVersionUID = 1704610763047304111L;

	// MÉTODO CONSTRUTOR
	public Pesquisar() {
		add(new Label("lblPesquisar", "Pesquisar contatos!"));
	}

}
