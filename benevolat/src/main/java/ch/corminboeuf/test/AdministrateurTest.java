package ch.corminboeuf.test;
import junit.framework.TestCase;

import org.junit.Test;
import org.testng.Assert;

import ch.corminboeuf.view.SessionBean;


public class AdministrateurTest extends TestCase {

	@Test
	public void test() {
		
		SessionBean s = new SessionBean();
		Assert.assertEquals(s.getgUtilisateurs().getDaoAdministrateur().getAdministrateurs().get(0).getNom(),"Corminboeuf");
	}
}
