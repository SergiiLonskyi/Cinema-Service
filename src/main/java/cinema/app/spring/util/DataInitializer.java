package cinema.app.spring.util;

import cinema.app.spring.model.Role;
import cinema.app.spring.model.RoleName;
import cinema.app.spring.model.User;
import cinema.app.spring.service.RoleService;
import cinema.app.spring.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role roleUser = new Role();
        roleUser.setName(RoleName.USER);
        Role roleAdmin = new Role();
        roleAdmin.setName(RoleName.ADMIN);
        roleService.add(roleUser);
        roleService.add(roleAdmin);
        User admin = new User();
        admin.setEmail("admin@mail.com");
        admin.setPassword("admin");
        admin.setRoles(Set.of(roleAdmin));
        userService.add(admin);
        User user = new User();
        user.setEmail("bob@mail.com");
        user.setPassword("bob12345");
        user.setRoles(Set.of(roleUser));
        userService.add(user);
    }
}
