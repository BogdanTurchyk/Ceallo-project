package com.cydeo.step_definitions;

import com.cydeo.enums.contacts.NavigationBar;
import com.cydeo.helper.ContactsHelper;
import com.cydeo.pages.AllContactsPage;
import com.cydeo.pages.ContactPage;
import com.cydeo.pages.NavigationBarPage;
import com.cydeo.pages.PickAvatarPage;
import com.cydeo.utilities.MockData;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactsSteps {
    String fullName = MockData.fullName();

    @When("user add new contact")
    public void user_add_new_contact() {
        ContactsHelper.createNewContact(fullName);
    }

    @Then("new contact is created")
    public void new_contact_is_created() {
        Assert.assertTrue(new AllContactsPage().isContactPresent(fullName));
    }

    @When("user is on the contact's page")
    public void user_is_on_the_contact_s_page() {
        new NavigationBarPage().navigateTo(NavigationBar.CONTACTS);
    }

    @Then("user can observe list of contacts")
    public void user_can_observe_list_of_contacts() {
        Assert.assertTrue(new AllContactsPage().numberOfContacts() >= 1);
    }

    @When("user choose avatar from files")
    public void user_choose_avatar_from_files() {
        new ContactPage().openPickAvatarPage().selectRandomAvatar();
    }

    @Then("avatar is successfully changed")
    public void avatar_is_successfully_changed() {
        Assert.assertTrue(new PickAvatarPage().isChooseButtonEnabled());
    }

    @When("user delete contact")
    public void user_delete_contact() {
        new ContactPage().deleteContact();
    }

    @Then("contact is successfully deleted")
    public void contact_is_successfully_deleted() {
        Assert.assertFalse(new AllContactsPage().isContactPresent(fullName));
    }
}
