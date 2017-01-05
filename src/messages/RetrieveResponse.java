package messages;

import java.io.Serializable;

public class RetrieveResponse implements Serializable {

	private long idRegistro;
	private int mensaje;
	byte[] firmaServidor;
	private byte[] doc;
	private String extension;
	private String selloTemporal;
	private boolean correcto;
	private byte[] firmaCliente;
	private byte[] firmaTSA;

	public RetrieveResponse(long idRegistro, int mensaje, String extension, byte[] doc, byte[] firmaServidor,
			byte[] firmaCliente, byte[] firmaTSA, String selloTemporal, boolean correcto) {
		this.idRegistro = idRegistro;
		this.selloTemporal = selloTemporal;
		this.doc = doc;
		this.extension = extension;
		this.mensaje = mensaje;
		this.firmaCliente = firmaCliente;
		this.firmaServidor = firmaServidor;
		this.correcto = correcto;
		this.firmaTSA = firmaTSA;

	}

	public byte[] getFirmaTSA() {
		return firmaTSA;
	}

	public String getExtension() {
		return extension;
	}

	public byte[] getDoc() {
		return doc;
	}

	public long getIdRegistro() {
		return idRegistro;
	}

	public int getMensaje() {
		return mensaje;
	}

	public boolean isCorrecto() {
		return correcto;
	}

	public byte[] getFirmaServidor() {
		return firmaServidor;
	}

	public byte[] getFirmaCliente() {
		return firmaCliente;
	}

	public String getSelloTemporal() {
		return selloTemporal;
	}
}
