package testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Paciente.TelefoneDeContato;

public class TestaTelefonesDeContato {
	
	TelefoneDeContato telefone;
	
	@Before
	public void test() throws Exception{
		telefone = new TelefoneDeContato("(83)3322-1010");
	}
	
	@Before
	public void test2() throws Exception{
		telefone = new TelefoneDeContato("(83)88007777");
	}
	
	@Before
	public void test3() throws Exception{
		telefone = new TelefoneDeContato("");
	}	
	
	@Test
	public void testaTelefoneResidencial(){
		
		try{
			telefone = new TelefoneDeContato("(83)3-1010");
			Assert.fail("Esperava excecao de telefone residencial invalido");
		}catch(Exception e){
			Assert.assertEquals("Telefone residencial invalido", e.getMessage());
		}
		
		try{
			telefone = new TelefoneDeContato("(8)3322-1010");
			Assert.fail("Esperava excecao de telefone residencial invalido");
		}catch(Exception e){
			Assert.assertEquals("Telefone residencial invalido", e.getMessage());
		}
		
		try{
			telefone = new TelefoneDeContato("(83)3322-101");
			Assert.fail("Esperava excecao de telefone residencial invalido");
		}catch(Exception e){
			Assert.assertEquals("Telefone residencial invalido", e.getMessage());
		}
		
		try{
			telefone = new TelefoneDeContato("833322-1010");
			Assert.fail("Esperava excecao de telefone residencial invalido");
		}catch(Exception e){
			Assert.assertEquals("Telefone residencial invalido", e.getMessage());
		}
		
		try{
			telefone = new TelefoneDeContato("(83)3322-10101");
			Assert.fail("Esperava excecao de telefone residencial invalido");
		}catch(Exception e){
			Assert.assertEquals("Telefone residencial invalido", e.getMessage());
		}
		
		try{
			telefone = new TelefoneDeContato("(83)33222-1010");
			Assert.fail("Esperava excecao de telefone residencial invalido");
		}catch(Exception e){
			Assert.assertEquals("Telefone residencial invalido", e.getMessage());
		}
		
		try{
			telefone = new TelefoneDeContato("(083)3322-1010");
			Assert.fail("Esperava excecao de telefone residencial invalido");
		}catch(Exception e){
			Assert.assertEquals("Telefone residencial invalido", e.getMessage());
		}
	}
}
//	
//	@Test
//	public void testaTelefoneComercial(){
//		
//		try{
//			telefone = new TelefoneDeContato("(83)3322-1010", "(83)33-9999", "(83)8800-7777");
//			Assert.fail("Esperava excecao de telefone residencial invalido");
//		}catch(Exception e){
//			Assert.assertEquals("Telefone comercial invalido", e.getMessage());
//		}
//		
//		try{
//			telefone = new TelefonesDeContato("(83)3322-1010", "(833333-9999", "(83)8800-7777");
//			Assert.fail("Esperava excecao de telefone residencial invalido");
//		}catch(Exception e){
//			Assert.assertEquals("Telefone comercial invalido", e.getMessage());
//		}
//		
//		try{
//			telefone = new TelefonesDeContato("(83)3322-1010", "3333-9999", "(83)8800-7777");
//			Assert.fail("Esperava excecao de telefone residencial invalido");
//		}catch(Exception e){
//			Assert.assertEquals("Telefone comercial invalido", e.getMessage());
//		}
//		
//		try{
//			telefone = new TelefonesDeContato("(83)3322-1010", "(83)33333-9999", "(83)8800-7777");
//			Assert.fail("Esperava excecao de telefone residencial invalido");
//		}catch(Exception e){
//			Assert.assertEquals("Telefone comercial invalido", e.getMessage());
//		}
//		
//		try{
//			telefone = new TelefonesDeContato("(83)3322-1010", "(83)3333-999", "(83)8800-7777");
//			Assert.fail("Esperava excecao de telefone residencial invalido");
//		}catch(Exception e){
//			Assert.assertEquals("Telefone comercial invalido", e.getMessage());
//		}
//	}
//	
//	@Test
//	public void testaTelefoneCelular(){
//		
//		try{
//			telefone = new TelefonesDeContato("(83)3322-1010", "(83)3333-9999", "(83)");
//			Assert.fail("Esperava excecao de telefone residencial invalido");
//		}catch(Exception e){
//			Assert.assertEquals("Telefone celular invalido", e.getMessage());
//		}
//		
//		try{
//			telefone = new TelefonesDeContato("(83)3322-1010", "(83)3333-9999", "83 8800-7777");
//			Assert.fail("Esperava excecao de telefone residencial invalido");
//		}catch(Exception e){
//			Assert.assertEquals("Telefone celular invalido", e.getMessage());
//		}
//		
//		try{
//			telefone = new TelefonesDeContato("(83)3322-1010", "(083)3333-9999", "(83)8800-7777");
//			Assert.fail("Esperava excecao de telefone residencial invalido");
//		}catch(Exception e){
//			Assert.assertEquals("Telefone comercial invalido", e.getMessage());
//		}
//		
//		try{
//			telefone = new TelefonesDeContato("(83)3322-1010", "(083)3333-9999", "(83)88000-77770");
//			Assert.fail("Esperava excecao de telefone residencial invalido");
//		}catch(Exception e){
//			Assert.assertEquals("Telefone comercial invalido", e.getMessage());
//		}
//		
//		
//	}
//	
//	
//	
//	@Test
//	public void testTelefones() throws Exception{
//		
//		telefone = new TelefonesDeContato("(83)3322-1010", "(83)3333-9999", "(83)8800-7777");
//		
//		Assert.assertEquals("(83)3322-1010", telefone.getFoneResidencial());
//		Assert.assertEquals("(83)3333-9999", telefone.getFoneComercial());
//		Assert.assertEquals("(83)8800-7777", telefone.getFoneCelular());
//		
//		telefone.setFoneResidencial("(89)2101-5555");
//		Assert.assertEquals("(89)2101-5555", telefone.getFoneResidencial());
//		
//		telefone.setFoneComercial("(78)asdv-1234");
//		Assert.assertEquals("(83)3333-9999", telefone.getFoneComercial());
//		
//		telefone.setFoneComercial("(11)1234-5698");
//		Assert.assertEquals("(11)1234-5698", telefone.getFoneComercial());
//		
//		telefone.setFoneCelular("");
//		Assert.assertEquals("", telefone.getFoneCelular());
//		
//		Assert.assertEquals(
//				"Telefone Residencial: (89)2101-5555\nTelefone Comercial: (11)1234-5698\nTelefone Celular: ",
//				telefone.toString());
//		
//	}
//
//}
