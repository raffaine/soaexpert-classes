package br.com.demacho.services.contaservice.v1;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import org.example.demacho.MensagemRetorno;
import org.example.demacho.Usuario;

/**
 * This class was generated by the JAX-WS RI. Oracle JAX-WS 2.1.5 Generated
 * source version: 2.1
 * 
 */
@WebService(portName = "ContaServiceSOAP", serviceName = "ContaService", targetNamespace = "http://demacho.com.br/services/ContaService/v1", wsdlLocation = "/wsdls/ContaService.wsdl", endpointInterface = "br.com.demacho.services.contaservice.v1.ContaService")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class ContaService_ContaServiceSOAPImpl implements ContaService {

	public ContaService_ContaServiceSOAPImpl() {
	}

	/**
	 * 
	 * @param usuario
	 * @return returns org.example.demacho.Usuario
	 */
	public Usuario criar(Usuario usuario) {
		// replace with your impl here
		return null;
	}

	/**
	 * 
	 * @param usuario
	 */
	public void ativar(Usuario usuario) {
		// replace with your impl here
		return;
	}

	/**
	 * 
	 * @param usuario
	 * @return returns org.example.demacho.MensagemRetorno
	 */
	public MensagemRetorno remover(Usuario usuario) {
		// replace with your impl here
		return null;
	}

}