package models;

public class IPhone implements CellPhone, Internet, Music {

	@Override
	public void play() {
		System.out.println("A música está tocando");
	}

	@Override
	public void pause() {
		System.out.println("A música está pausada");
	}

	@Override
	public void selectMusic(String music) {
		System.out.println("Selecionando música: " + music);
	}

	@Override
	public void showPage(String url) {
		System.out.println("Exibindo página: " + url);
	}

	@Override
	public void addNewTab() {
		System.out.println("Nova aba adicionada");
	}

	@Override
	public void refreshPage() {
		System.out.println("Página atualizada");
	}

	@Override
	public void call(String number) {
		System.out.println("Ligando para o número: " + number);
	}

	@Override
	public void answerCall() {
		System.out.println("Atendendo a ligação");
	}

	@Override
	public void disconnectCall() {
		System.out.println("Desligando a ligação");
	}

}
