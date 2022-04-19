package exceptions;

public class CadastroIncorretoException extends Exception {
	public CadastroIncorretoException() {
		super("Cadastro não encontrado.");
	}
}
