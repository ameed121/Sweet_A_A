package Package_Sweet;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public List<User> getSignedUsers() {
        return signedUsers;
    }

    public void setSignedUsers(List<User> signedUsers) {
        this.signedUsers = signedUsers;
    }

    public List<Owner> getSignedStoreOwners() {
        return signedStoreOwners;
    }

    public void setSignedStoreOwners(List<Owner> signedStoreOwners) {
        this.signedStoreOwners = signedStoreOwners;
    }

    public List<Supplier> getSignedSuppliers() {
        return signedSuppliers;
    }

    public void setSignedSuppliers(List<Supplier> signedSuppliers) {
        this.signedSuppliers = signedSuppliers;
    }

    public User getLogedUser() {
        return logedUser;
    }

    public void setLogedUser(User logedUser) {
        this.logedUser = logedUser;
    }

    public Owner getLogedOwner() {
        return logedOwner;
    }

    public void setLogedOwner(Owner logedOwner) {
        this.logedOwner = logedOwner;
    }

    public Supplier getLogedSupplier() {
        return logedSupplier;
    }

    public void setLogedSupplier(Supplier logedSupplier) {
        this.logedSupplier = logedSupplier;
    }

    public boolean isLogedAdmin() {
        return logedAdmin;
    }

    public void setLogedAdmin(boolean logedAdmin) {
        this.logedAdmin = logedAdmin;
    }

    public List<User> signedUsers;
    public List<Owner> signedStoreOwners;
    public List<Supplier> signedSuppliers;
    public User logedUser;
    public Owner logedOwner;
    public Supplier logedSupplier;
    public boolean logedAdmin;

    public DataBase() {
        this.signedUsers = new ArrayList<User>();
        this.signedStoreOwners = new ArrayList<Owner>();
        this.signedSuppliers = new ArrayList<Supplier>();
        logedUser = new User(null, null, null, null);
        logedOwner = new Owner(null, null, null, null);
        logedSupplier = new Supplier(null, null, null, null);
        logedAdmin = false;
    }

    // Method to update an Owner in the signedStoreOwners list
    public void updateOwner(Owner updatedOwner) {
        for (int i = 0; i < signedStoreOwners.size(); i++) {
            if (signedStoreOwners.get(i).getName().equals(updatedOwner.getName())) {
                signedStoreOwners.set(i, updatedOwner);
                break;
            }
        }
    }

    // Method to update a Supplier in the signedSuppliers list
    public void updateSupplier(Supplier updatedSupplier) {
        for (int i = 0; i < signedSuppliers.size(); i++) {
            if (signedSuppliers.get(i).getName().equals(updatedSupplier.getName())) {
                signedSuppliers.set(i, updatedSupplier);
                break;
            }
        }
    }

    // Method to update a User in the signedUsers list
    public void updateUser(User updatedUser) {
        for (int i = 0; i < signedUsers.size(); i++) {
            if (signedUsers.get(i).getName().equals(updatedUser.getName())) {
                signedUsers.set(i, updatedUser);
                break;
            }
        }
    }
}
