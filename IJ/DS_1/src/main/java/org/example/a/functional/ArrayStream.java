package org.example.a.functional;

import org.example.a._refactor.conditional.MenuItem;
import org.example.a._refactor.conditional.Role;
import org.example.agnar.goodprogrammer.Constants;

import java.util.Arrays;
import java.util.List;

public class ArrayStream {
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
