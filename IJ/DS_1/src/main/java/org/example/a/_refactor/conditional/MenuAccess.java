package org.example.a._refactor.conditional;

import org.example.agnar.goodprogrammer.Constants;

import java.util.Arrays;
import java.util.List;

public class MenuAccess {

    public void setAuthorizationsInEachMenus(List<MenuItem> menuItemsList, Role[] roles) {
        if (roles == null) {
            return;
        }

        for (MenuItem menuItem : menuItemsList) {
            if (Arrays.stream(roles).anyMatch(role -> role.getName().equals(menuItem.getReadAccessRole()))) {
                menuItem.setAccess(Constants.READ);
                menuItem.setVisible(true);
            }

            if (Arrays.stream(roles).anyMatch(role -> role.getName().equals(menuItem.getWriteAccessRole()))) {
                menuItem.setAccess(Constants.WRITE);
                menuItem.setVisible(true);
            }
        }

//        for (menuItem : menuItemsList) {
//            for(role : roles) {
//                if (role.getName().equals(menuItem.menuItem.getWriteAccessRole())) {
//                    menuItem.setAccess(Constants.WRITE);
//                    menuItem.setVisible(true);
//                }
//
//                if (role.getName().equals(menuItem.getReadAccessRole())) {
//                    menuItem.setAccess(Constants.READ);
//                    menuItem.setVisible(true);
//                }
//            }
//        }
    }

}