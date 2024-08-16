package Package_Sweet;

public class SignUp {

    private DataBase dataBase;
    private String message;  // Instance variable to store the message

    public SignUp(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public String getMessage() {
        return message;
    }

    public boolean signUpUser(String username, String password, String email, String city) {
        if (validateUserData(username, password, email, city)) {
            // Check if the user already exists in signedUsers
            for (User user : dataBase.signedUsers) {  // Directly accessing signedUsers
                if (user.getName().equals(username)) {
                    message = "Username already exists as User.";
                    return false;
                }
            }

            // If validation passes and user doesn't exist, add new user
            User newUser = new User(username, password, email, city);
            dataBase.signedUsers.add(newUser);  // Directly adding to signedUsers
            message = "User signed up successfully!";
            return true;
        } else {
            message = "Sign up failed due to invalid data.";
            return false;
        }
    }

    public boolean signUpOwner(String username, String password, String email, String city) {
        if (validateUserData(username, password, email, city)) {
            // Check if the owner already exists in signedStoreOwners
            for (Owner owner : dataBase.signedStoreOwners) {  // Directly accessing signedStoreOwners
                if (owner.getName().equals(username)) {
                    message = "Username already exists as Store Owner.";
                    return false;
                }
            }

            // If validation passes and owner doesn't exist, add new owner
            Owner newOwner = new Owner(username, password, email, city);
            dataBase.signedStoreOwners.add(newOwner);  // Directly adding to signedStoreOwners
            message = "Store Owner signed up successfully!";
            return true;
        } else {
            message = "Sign up failed due to invalid data.";
            return false;
        }
    }

    public boolean signUpSupplier(String username, String password, String email, String city) {
        if (validateUserData(username, password, email, city)) {
            // Check if the supplier already exists in signedSuppliers
            for (Supplier supplier : dataBase.signedSuppliers) {  // Directly accessing signedSuppliers
                if (supplier.getName().equals(username)) {
                    message = "Username already exists as Supplier.";
                    return false;
                }
            }

            // If validation passes and supplier doesn't exist, add new supplier
            Supplier newSupplier = new Supplier(username, password, email, city);
            dataBase.signedSuppliers.add(newSupplier);  // Directly adding to signedSuppliers
            message = "Supplier signed up successfully!";
            return true;
        } else {
            message = "Sign up failed due to invalid data.";
            return false;
        }
    }

    private boolean validateUserData(String username, String password, String email, String city) {
        if (username == null || username.isEmpty()) {
            return false;
        }
        if (password == null || password.length() < 6) {
            return false;
        }
        if (email == null || !email.contains("@")) {
            return false;
        }
        if (city == null || city.isEmpty()) {
            return false;
        }
        return true;
    }
}
