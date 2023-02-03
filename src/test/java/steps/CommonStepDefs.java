package steps;

import constants.EnumLoginButtonsAndDropdowns;
import constants.EnumSideBarsIconsAndButtonsName;
import io.cucumber.java.en.And;
import selenide.BasePage;
import selenide.GeneralPosPage;

public class CommonStepDefs {

    BasePage basePage = new BasePage();
    GeneralPosPage generalPosPage = new GeneralPosPage();


    @And("I click on {} button in sidebar")
    public void iClickOnTransactionButtonInSidebar(EnumSideBarsIconsAndButtonsName enumSideBarsIconsAndButtonsName) {
        generalPosPage.clickSideIcon(enumSideBarsIconsAndButtonsName);
    }

    @And("I click in {} sidebar dropdown {}")
    public void iClickInSETTINGSSidebarDropdownDEVICE_SETTINGS(EnumSideBarsIconsAndButtonsName parent, EnumSideBarsIconsAndButtonsName child) {
        generalPosPage.clickExpandedDropdownItem(parent, child);

    }

    @And("I switch to default content")
    public void iSwitchToDefaultContent() {
        generalPosPage.switchToMainContent();
    }
}
