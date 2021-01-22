package org.example.i.menu;

import org.example.i.goodprogrammer.Constants;

import java.util.List;

public class MenuAccessMine {

    public void setAuthorizationsInEachMenus(List<MenuItem> menuItemsList, Role[] roles) {
        if (roles == null) {
            return;
        }

        for (MenuItem menuItem : menuItemsList) {
            for(Role role : roles) {
                String roleName = role.getName();
                String readAccessRole = menuItem.getReadAccessRole();
                String writeAccessRole = menuItem.getWriteAccessRole();

                boolean hasReadAccess = roleName.equals(readAccessRole);
                boolean hasWriteAccess = roleName.equals(menuItem.writeAccessRole);

                if (hasWriteAccess) {
                    menuItem.setAccess(Constants.WRITE);
                    menuItem.setVisible(true);
                    continue;
                }

                if (hasReadAccess) {
                    menuItem.setAccess(Constants.READ);
                    menuItem.setVisible(true);
                }
            }
        }
    }

}