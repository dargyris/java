package org.example.i.menu;

import org.example.i.goodprogrammer.Constants;

import java.util.Arrays;
import java.util.List;

public class MenuAccess {

    public void setAuthorizationsInEachMenus(List<MenuItem> menuItemsList, Role[] roles) {
        if (roles == null) {
            return;
        }

        for (MenuItem menuItem : menuItemsList) {
            if (getAccessType(roles, menuItem.getReadAccessRole())) {
                menuItem.setAccess(Constants.READ);
                menuItem.setVisible(true);
            }

            if (getAccessType(roles, menuItem.getWriteAccessRole())) {
                menuItem.setAccess(Constants.WRITE);
                menuItem.setVisible(true);
            }
        }
    }

    private boolean getAccessType(Role[] roles, String writeAccessRole) {
        return Arrays.stream(roles).anyMatch(role -> role.getName().equals(writeAccessRole));
    }

}