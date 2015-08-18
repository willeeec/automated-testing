package CommunityAdminPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityAdminPage;
import CommunityAdminPageFeatures.CommunityEditPage;
import CommunityAdminPageFeatures.CommunityUpdateCommand;

/*
* @author Anjali
*/


/*
* Checks edit profile feature by updating community name
*/
public class EditCommunityProfileTest extends CommonTests
{

	@Test
	public void test() 
	{
		//Navigates to edit page
		CommunityAdminPage.GotoEdit();
		
		//Pass new name and click submit
		CommunityEditPage.UpdateCommunityNameTo("dummyNewName");
		CommunityUpdateCommand.Update();
		
		//Validate changes
		Assert.assertEquals(true,CommunityUpdateCommand.HasChanged());
	  
		
	}

}
