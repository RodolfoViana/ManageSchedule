package testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Paciente.EnderecoDoPaciente;
import Paciente.Paciente;
import Paciente.TelefonesDeContato;
import PlanoDeSaude.PlanoDeSaude;

//Testa metodos da classe paciente
public class TestaPaciente2 {

	Paciente paciente;
	Paciente paciente2;
	PlanoDeSaude plano;
	PlanoDeSaude novoPlano;
	EnderecoDoPaciente endereco;
	EnderecoDoPaciente novoEndereco;
	TelefonesDeContato telefones;
	TelefonesDeContato novosTelefones;
	
	@Before
	public void testaPlano() throws Exception{
		plano = new PlanoDeSaude("Plano de saude", 50.0, "(83)3333-5555");
	}
	
	@Before
	public void testaNovoPlano() throws Exception{
		novoPlano = new PlanoDeSaude("novo plano de saude", 150.0, "(83)2100-8877");
	}

	@Before
	public void testaEndereco() throws Exception {
		endereco = new EnderecoDoPaciente("Rua perto do centro", "", "Centro",
				"Campina Grande", "Paraiba", "58100-100", 100);
	}

	@Before
	public void testaNovoEndereco() throws Exception {
		novoEndereco = new EnderecoDoPaciente("Rua longe do centro", "",
				"Bairro", "Joao Pessoa", "Paraiba", "58222-222", 258);
	}

	@Before
	public void testaTelefone() throws Exception {
		telefones = new TelefonesDeContato("(83)3333-0000", "(11)2111-9988",
				"(83)8845-9658");
	}

	@Before
	public void testaNovoTelefone() throws Exception {
		novosTelefones = new TelefonesDeContato("(83)1234-5678", "",
				"(83)8888-0000");
	}

	@Test
	public void testPaciente() throws Exception {

		paciente = new Paciente("Maria da Silva", "450.254.268-03", endereco,
				telefones, "30/12/1990", plano, "paciente@yahoo.com.br",
				"Telefone celular", "10/10/2010");

		Assert.assertEquals("Mensagem incorreta", "Maria da Silva",
				paciente.getNome());
		Assert.assertEquals("Mensagem incorreta", "450.254.268-03",
				paciente.getCpf());
		Assert.assertEquals("Mensagem incorreta", "(83)3333-0000", paciente
				.getTelefones().getFoneResidencial());
		Assert.assertEquals("Mensagem incorreta", "(11)2111-9988", paciente
				.getTelefones().getFoneComercial());
		Assert.assertEquals("Mensagem incorreta", "(83)8845-9658", paciente
				.getTelefones().getFoneCelular());
		Assert.assertEquals("Mensagem incorreta", "30/12/1990",
				paciente.getDataDeNascimento());
		Assert.assertEquals(
				"Mensagem incorreta",
				"Nome: Plano de saude - preco: 50.0 - telefone: (83)3333-5555",
				paciente.getPlanoDeSaude().toString());
		Assert.assertEquals("Mensagem incorreta", "paciente@yahoo.com.br",
				paciente.getEmail());
		Assert.assertEquals("Mensagem incorreta", "Telefone celular",
				paciente.getFormaDeContato());
		Assert.assertEquals("Mensagem incorreta", "10/10/2010",
				paciente.getDataDaUltimaVisita());
		
		
		paciente.setEndereco(novoEndereco);
		Assert.assertEquals("Mensagem incorreta", novoEndereco.toString(),
				paciente.getEndereco().toString());

		paciente.setTelefones(novosTelefones);
		Assert.assertEquals("Mensagem incorreta", novosTelefones.toString(),
				paciente.getTelefones().toString());
		
		paciente.setPlanoDeSaude(novoPlano);
		Assert.assertEquals(
				"Mensagem incorreta",
				"Nome: novo plano de saude - preco: 150.0 - telefone: (83)2100-8877",
				paciente.getPlanoDeSaude().toString());
		
		paciente.setEmail("@gmail");
		Assert.assertEquals("Mensagem incorreta", "paciente@yahoo.com.br",
				paciente.getEmail());

		paciente.setEmail("novoemaildopaciente@gmail.com");
		Assert.assertEquals("Mensagem incorreta",
				"novoemaildopaciente@gmail.com", paciente.getEmail());
		
		paciente.setFormaDeContato("Email");
		Assert.assertEquals("Mensagem incorreta", "Email",
				paciente.getFormaDeContato());
		
		paciente.setDataDaUltimaVisita("");
		Assert.assertEquals("Mensagem incorreta", "10/10/2010",
				paciente.getDataDaUltimaVisita());
		
		paciente.setDataDaUltimaVisita("20/10/2010");
		Assert.assertEquals("Mensagem incorreta", "20/10/2010",
				paciente.getDataDaUltimaVisita());
		
		

	}

	@Test
	public void testaIdade() throws Exception {

		paciente = new Paciente("Maria da Silva", "450.254.268-03", endereco,
				telefones, "05/05/1985", plano, "paciente@yahoo.com.br",
				"Telefone celular", "10/10/2010");

		Assert.assertEquals(25, paciente.getIdade()); // paciente ja completou
														// 25 anos

		paciente = new Paciente("Maria da Silva", "450.254.268-03", endereco,
				telefones, "20/05/1990", plano, "paciente@yahoo.com.br",
				"Telefone celular", "10/10/2010");

		Assert.assertEquals(20, paciente.getIdade()); // paciente ja completou
														// 20 anos

		paciente = new Paciente("Maria da Silva", "450.254.268-03", endereco,
				telefones, "30/12/1990", plano, "paciente@yahoo.com.br",
				"Telefone celular", "10/10/2010");

		Assert.assertEquals(19, paciente.getIdade()); // paciente ainda nao
														// completou 20 anos

	}

}
