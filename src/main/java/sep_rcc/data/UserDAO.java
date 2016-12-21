package sep_rcc.data;

import sep_rcc.model.User;

public class UserDAO extends GenericDAOImpl<User> {
    public UserDAO() {
        super(User.class);
    }
}
