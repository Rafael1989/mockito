package br.com.caelum.leilao.dominio;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {
	public Calendar hoje() {
		return Calendar.getInstance();
	}
}