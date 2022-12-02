package dio.me.mockito;

import static org.mockito.ArgumentMatchers.anyString;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTestOne {	
	 
	@Mock	
	private ApiDosCorreios apiDosCorreios;
	
	@InjectMocks
	private CadastrarPessoa cadastrarPessoa;
	
	@Test
	void validarDadosDeCadastro() {
		
		DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Contagem", "Rua 1", "Casa", "Centro");
		Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("789789")).thenReturn(dadosLocalizacao); // anyString() -> qualquer String
		Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Lucas", "123456", LocalDate.now(), "789789");
		
		Assertions.assertEquals("Lucas", pessoa.getNome());
		Assertions.assertEquals("123456", pessoa.getDocumento());
		Assertions.assertEquals("MG", pessoa.getEndereco().getUf());
		Assertions.assertEquals("Casa", pessoa.getEndereco().getComplemento());

	}
	
	@Test
	void cadastrarPessoa() {
		
		DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Contagem", "Rua 1", "Casa", "Centro");
		Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("789789")).thenReturn(null);
		Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Lucas", "123456", LocalDate.now(), "789789");
		
		Assertions.assertNull(pessoa.getEndereco());

	}
	
	@Test
	void lancarExceptionQuandoChamarApiDosCorreios() {
		
		Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalArgumentException.class);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("Lucas", "123456", LocalDate.now(), "789789"));
		
	}
	
	@Test
	void lancarExceptionApiDosCorreios() {
		
		Mockito.doThrow(IllegalArgumentException.class).when(apiDosCorreios).buscaDadosComBaseNoCep(anyString());	
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("Lucas", "123456", LocalDate.now(), "789789"));
		
	}
}
