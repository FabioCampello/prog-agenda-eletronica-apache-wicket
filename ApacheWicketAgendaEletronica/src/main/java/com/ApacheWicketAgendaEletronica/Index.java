package com.ApacheWicketAgendaEletronica;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

//CLASSE PÚBLICA QUE EXTENDE DA CLASSE BASEPAGE
public class Index extends BasePage{

	//VARIÁVEL PRIAVADA DE CLASSE CONSTANTE
	private static final long serialVersionUID = -1355895078019063336L;	
		
	//MÉTODO CONSTRUTOR
	public Index(){
		Label lblmsgBoasVindas = new Label("lblBoasVindas", Model.of("Bem vindo a agenda eletrônica!"));
		add(lblmsgBoasVindas);
	}
	
}
